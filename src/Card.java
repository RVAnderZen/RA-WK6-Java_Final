//Create a class named "Card"

public class Card {
//Create a field named "value"	
	
	private int value;
	
//Create a field named "name"	

	private String name;
	
//Create a "Getter" method

	public int getValue() {
	    return value;
	}

//Create a "Setter" method	
	
	public void setValue(int value) {
	    this.value = value;
	}

//Create a "Getter" method	
	
	public String getName() {
	    return name;
	}

//Create a "Setter" method	
	
	public void setName(String name) {
	    this.name = name;
	}

//Create a "Describe" method
	
	public void describe() {
	    System.out.println("This card is the " + name + " with a value of " + value);
	}
}