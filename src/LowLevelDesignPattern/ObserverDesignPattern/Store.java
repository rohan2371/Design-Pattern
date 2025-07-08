package LowLevelDesignPattern.ObserverDesignPattern;

import LowLevelDesignPattern.ObserverDesignPattern.Observable.IphoneObservableImpl;
import LowLevelDesignPattern.ObserverDesignPattern.Observable.StocksObservable;
import LowLevelDesignPattern.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import LowLevelDesignPattern.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import LowLevelDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {

        StocksObservable iphoneObservable = new IphoneObservableImpl();

        // Create observers
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("viratkohli@gmail.com",iphoneObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("yuvraj@gmail.com",iphoneObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("rohan",iphoneObservable);

        // Register observers
        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);

    }
}
