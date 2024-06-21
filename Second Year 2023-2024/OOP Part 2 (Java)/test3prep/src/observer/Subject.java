package observer;


interface Subject {
    void register(Observer obj);
    void notifyObservers();
}