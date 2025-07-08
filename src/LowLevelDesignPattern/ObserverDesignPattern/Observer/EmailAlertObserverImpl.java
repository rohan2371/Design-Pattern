package LowLevelDesignPattern.ObserverDesignPattern.Observer;

import LowLevelDesignPattern.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId,"product is in stock hurry up!" +" stocks count : " + stocksObservable.getStockCount());
    }

    public void sendEmail(String emailId, String msg) {
        System.out.println("Sending email to " + emailId );
    }
}
