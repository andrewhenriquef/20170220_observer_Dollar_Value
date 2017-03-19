package dollarvalue;

import java.util.ArrayList;

public class DollarValue implements Publisher {

	private float value;
	private String schedule;
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	

	//getters and setters
	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public ArrayList<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(ArrayList<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}
	
	//add subscriber
	public void addObserver(Subscriber o) {
		subscribers.add(o);
	}

	//remove subscriber
	public void removeObserver(Subscriber o) {
		
		int count = subscribers.indexOf(o);
	
		if(count >= 0){
			subscribers.remove(count);
		}
	
	}

	//notify subscribers
	public void notifyObservers() {
		
		for (int count = 0; count < subscribers.size(); count++){

			Subscriber subscriber = (Subscriber)subscribers.get(count);
			subscriber.update(getValue(), getSchedule());
		}
	}
	
	//when values changes, notify all subscribers
	public void changeValues(float value, String schedule){
		
		setValue(value);
		setSchedule(schedule);
		notifyObservers();
		
	}
}
