package LowLevelDesignPattern.ObserverDesignPattern.Observer;

import LowLevelDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    StocksObservable stocksObservable;
    String userName;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable){
        this.stocksObservable = stocksObservable;
        this.userName = userName;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"product is in stock hurry up!");
    }

    public void sendMsgOnMobile(String userName, String msg) {
        System.out.println("Sending msg to mobile " + userName );
    }
}
