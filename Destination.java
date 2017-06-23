package assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Destination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our website, Please enter no of destination ?");
		int noOfDestination = scan.nextInt();
		Destinations[] holidaySpots = new Destinations[noOfDestination];
		for(int i=0; i<noOfDestination; i++){
			int c = i+1;
			System.out.println("Entering the details of Destination "+ c);
			System.out.println("Enter name of destination "+ c);
			
			String nameOfDestination = scan.next();
			
			Destinations a = new Destinations();
			holidaySpots[i] = a;
			
			holidaySpots[i].setName(nameOfDestination);
			
			System.out.println("Enter location name of destination "+ nameOfDestination);
			String nameOfLocation = scan.next();
			holidaySpots[i].setLocation(nameOfLocation);
			
			System.out.println("No of hotels in " + nameOfDestination + " :");
			int noOfHotel = scan.nextInt();
			String[] nameOfHotel = new String[noOfHotel];
			
			for(int j =0;j < noOfHotel; j++){
				int d  = j+1;
				System.out.println("Enter hotel name "+ d);
				nameOfHotel[j]=scan.next();
			}
			holidaySpots[i].setHotels(nameOfHotel);
			
			//System.out.println("No of hotels in " + na + " :");
			//int no = scan.nextInt();
			double[] priceOfHotel = new double[noOfHotel];
			
			for(int j =0;j < noOfHotel; j++){
				int d  = j+1;
				System.out.println("Enter price of "+ holidaySpots[i].getHotels()[j]);
				priceOfHotel[j]=scan.nextDouble();
			}
			holidaySpots[i].setPackageCost(priceOfHotel);
			
			int[] noOfDays = new int[noOfHotel];
			
			for(int j =0;j < noOfHotel; j++){
				int d  = j+1;
				System.out.println("Enter number of days in "+ holidaySpots[i].getHotels()[j]);
				noOfDays[j]=scan.nextInt();
			}
			holidaySpots[i].setNoOfDays(noOfDays);
			//System.out.println(holidaySpots[i].getHotels());
		}
		
		String customerDest = scan.next();
		boolean found = false;
		for(int i=0; i<noOfDestination;i++){
			Destinations yup = holidaySpots[i];
			if(customerDest.equals(yup.getName())){
				found  = true;
				System.out.println("Good News...we found your destination with awesome package. Here are the details");
				System.out.println(yup.toString());
				break;
			}
		}

		if(!found){
			System.out.println("Ohh...Sorry, We couldn't find your destination. Please check beck.");
		}
	}

}

class Destinations{
	private String name;
	private String location;
	private String[] hotels;
	private double[] packageCost;
	private int[] noOfDays;
	
	Destinations(){
		
	}
	
	Destinations(String name, String location, String[] hotels, double[] cost, int[] days){
		this.name = name;
		this.location = location;
		this.hotels = hotels;
		packageCost = cost;
		noOfDays = days;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String[] getHotels() {
		return hotels;
	}

	public void setHotels(String[] hotels) {
		this.hotels = hotels;
	}

	public double[] getPackageCost() {
		return packageCost;
	}

	public void setPackageCost(double[] packageCost) {
		this.packageCost = packageCost;
	}

	public int[] getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int[] noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "Destinations [name=" + name + ", location=" + location
				+ ", hotels=" + Arrays.toString(hotels) + ", packageCost="
				+ Arrays.toString(packageCost) + ", noOfDays="
				+ Arrays.toString(noOfDays) + "]";
	}
}