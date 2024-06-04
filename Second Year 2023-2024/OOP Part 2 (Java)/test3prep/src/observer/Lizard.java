package observer;

import java.util.ArrayList;
import java.util.List;

class Lizard implements Subject {
    private List<Observer> observers;
    private String location;
    public Lizard() {
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observers.contains(obj)) observers.add(obj);
    }
    @Override
    public void notifyObservers() {
        for (Observer obj : observers) {
            obj.update(this.location);
        }
    }
    public void setLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Lizard moved to: " + newLocation);
        notifyObservers();
    }
}
