package com.amit.all.systemdesign.observer.example2.observable;

import com.amit.all.systemdesign.observer.example2.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable {

	private List<NotificationAlertObserver> observerList;;
	private int stockCount;
	
	public IPhoneObservableImpl() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void add(NotificationAlertObserver alertObserver) {
		observerList.add(alertObserver);
	}

	@Override
	public void remove(NotificationAlertObserver alertObserver) {
		observerList.remove(alertObserver);
	}

	@Override
	public void notifySubscribers() {
		observerList.forEach(NotificationAlertObserver::update);
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if (this.stockCount == 0 && newStockAdded > 0) {
			this.stockCount += newStockAdded;
			notifySubscribers();
		} else {
			this.stockCount += newStockAdded;
		}
	}

	@Override
	public int getStockCount() {
		return this.stockCount;
	}

	@Override
	public String toString() {
		return "IPhoneObservableImpl [observerList=" + observerList + ", stockCount=" + stockCount + "]";
	}
	
	

}
