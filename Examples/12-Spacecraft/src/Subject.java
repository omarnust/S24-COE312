public interface Subject {
	// assuming only one observer is registered
    void registerObserver(Observer observer);
    void removeObserver();
    void notifyObservers(int num);
}