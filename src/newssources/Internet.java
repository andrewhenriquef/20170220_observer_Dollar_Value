package newssources;


import dollarvalue.DisplayDollar;
import dollarvalue.DollarValue;
import dollarvalue.Publisher;
import dollarvalue.Subscriber;

public class Internet implements Subscriber, DisplayDollar{

	private float dollar;
	private String schedule;
	
	public float getDollar() {
		return dollar;
	}

	public void setDollar(float dollar) {
		this.dollar = dollar;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public void update(float value, String schedule) {
		
		setDollar(value);
		setSchedule(schedule);
		display();
		
	}
	
	public void display(){
		
		System.out.println("Internet");
		System.out.println("Dolar: " + getDollar() + " Horário: " + getSchedule());
		System.out.println("----------------------------------------------->>");
	
	}	
	
}
