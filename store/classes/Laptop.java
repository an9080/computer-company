package store.classes;




import java.io.*;
public class Laptop extends TechnicalDevice implements Serializable{
private boolean touchDisplay;
private boolean cardReader;

	public Laptop(String ID, double size, String pType, int ram, String color, String b, double p, int q, boolean c, boolean t) {	
super(ID, size, pType, ram, color, b, p, q);
		cardReader = c;
		touchDisplay = t;
			}

	public double getPrice() {
		int count = 0;
		double price = 0;
		while (quantity != count) {
		if (cardReader)
			price += 100;
		if (touchDisplay)
			price += 380;
		count++;	
		}
		return price;
	}

	
	public String toString() {
		return touchDisplay + ""+cardReader;
	}
}