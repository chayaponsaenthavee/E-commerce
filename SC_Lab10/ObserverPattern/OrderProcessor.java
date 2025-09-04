package ObserverPattern;

import DataModels.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
    private final List<OrderObserver> observers = new ArrayList<>();

    public void register(OrderObserver observer) {
        observers.add(observer);
    }

    public void unregister(OrderObserver observer) {
        observers.remove(observer);
    }

    public void processOrder(Order order) {
        
        observers.forEach(observer -> observer.update(order));
    }
}