package dollarvalue;

public interface Publisher {

	public void addObserver(Subscriber o);
	
	public void removeObserver(Subscriber o);
	
	public void notifyObservers();
	
}
