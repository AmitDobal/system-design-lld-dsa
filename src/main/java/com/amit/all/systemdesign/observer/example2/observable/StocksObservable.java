package com.amit.all.systemdesign.observer.example2.observable;


import com.amit.all.systemdesign.observer.example2.observer.NotificationAlertObserver;

public interface StocksObservable {

	public void add(NotificationAlertObserver alertObserver);

	public void remove(NotificationAlertObserver alertObserver);

	public void notifySubscribers();

	public void setStockCount(int newStockAdded);

	public int getStockCount();
}
