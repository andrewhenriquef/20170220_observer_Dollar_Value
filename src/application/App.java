package application;

import dollarvalue.DollarValue;
import newssources.*;


public class App {

	public static void main(String[] args) {

		DollarValue dollarvalue = new DollarValue();
		
		//Observable without subscribers
		dollarvalue.changeValues(2, "3hs");
		
	
		Internet internet = new Internet(); 
		Radio radio = new Radio();
		Tv tv = new Tv();
		NewsPaper paper = new NewsPaper();
		
		//new subscribers
		dollarvalue.addObserver(internet);
		dollarvalue.addObserver(radio);
		dollarvalue.addObserver(paper);
		dollarvalue.addObserver(tv);
		
		dollarvalue.changeValues(2, "1hs");
		
		//removing some subscribers
		dollarvalue.removeObserver(radio);
		dollarvalue.removeObserver(tv);
	
		dollarvalue.changeValues(3.1f, "2hs");
			
	}
}
