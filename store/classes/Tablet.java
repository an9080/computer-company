package store.classes;


import java.io.*;
public class Tablet extends TechnicalDevice implements Serializable{
	private int noOfSim;
	private String network;

	public Tablet(String ID, double size, String pType, int ram, String color, String b, double p, int q, int sim, String net) {			
			super(ID, size, pType, ram, color, b, p, q);
		noOfSim = sim;
		network = net;
	}

	public double getPrice() {
		int count = 0;
		double price = 0;
		while (quantity != count) {
			for (int i=0 ; i<=noOfSim ; i++)
	  //if (noOfSim == 2)
			price += 100;
		if (network.equals("4G Network"))
			price += 100;
		if (network.equals("Wi-Fi Network"))
			price += 150;
		count++;	
		}
		return price;
	}

	
	public String toString() {
		return noOfSim + network;
	}
}
