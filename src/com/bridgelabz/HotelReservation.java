package com.bridgelabz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class InvalidDetailsException extends Exception
{
	InvalidDetailsException (String giveMessage){
		System.out.println(giveMessage); 
	}
}

class HotelData{
	String hotelName;
	int hotelRatesOnForWeekdaysRegularCustomer;
	int hotelRatesOnForWeekendsRegularCustomer;
	int hotelRatesOnWeekdaysRewardCustomer;
	int hotelRatesOnWeekendsRewardCustomer;
	int ratingOfHotel;
 
	public HotelData(String hName,int hratesWeekdayRC,int hRatesOnWeekendsRC,int hRatesOnWeekdaysRewardCustomer,int hRatesOnWeekendsRewardCustomer,int ratingHotel) {
		this.hotelName=hName;
		this.hotelRatesOnForWeekdaysRegularCustomer=hratesWeekdayRC;
		this.hotelRatesOnForWeekendsRegularCustomer=hRatesOnWeekendsRC;
		this.hotelRatesOnWeekdaysRewardCustomer=hRatesOnWeekdaysRewardCustomer;
		this.hotelRatesOnWeekendsRewardCustomer=hRatesOnWeekendsRewardCustomer;
		this.ratingOfHotel=ratingHotel;
	}
	
	public String toString(){
		return "\n"+hotelName+
			"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesOnForWeekdaysRegularCustomer+
			"\nHotel rate on Weekends for Reward Customer: "+hotelRatesOnForWeekendsRegularCustomer+
			"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesOnWeekdaysRewardCustomer+
			"\nHotel rate on Weekends for Reward Customer: "+hotelRatesOnWeekendsRewardCustomer+
			"\nRating: "+ratingOfHotel;  
	}
}

public class HotelReservation {
	
	static HotelData lakewood = new HotelData("Lakewood",110,90,80,80,3);
	static HotelData Bridgewood = new HotelData("Bridgewood",160,60,110,50,4);
	static HotelData Ridgewood = new HotelData("Ridgewood",220,150,100,40,5);
	public static ArrayList<HotelData> hotels = new  ArrayList<>();
	static {
	hotels.add(lakewood);
	hotels.add(Bridgewood);
	hotels.add(Ridgewood);
	}
	public static void displayListOfAllhotels() {
		System.out.println(hotels);
	}

	public static void findCheapHotelsAsPerGivenDates() {
		Date c = new Date();
		int price = 0;
		System.out.println("How many days you want to stay");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min=0;
		int hotelRating=0;
		String hName = " ";
		for(int j=0;j<n;j++) {			
			String day = c.getDayFromDate();
			System.out.println(day);
			if(day.equals("SUNDAY")||day.equals("SATURDAY")) {
				min = hotels.get(0).hotelRatesOnForWeekendsRegularCustomer;
				for(int i =0;i<hotels.size();i++) {
					if (min>=hotels.get(i).hotelRatesOnForWeekendsRegularCustomer) {
						min =hotels.get(i).hotelRatesOnForWeekendsRegularCustomer;
						hName=hotels.get(i).hotelName;
						hotelRating=hotels.get(i).ratingOfHotel;
					}
				}			
			}
			else {
				min = hotels.get(0).hotelRatesOnForWeekdaysRegularCustomer;
				for(int i =0;i<hotels.size();i++) {
					if (min>=hotels.get(i).hotelRatesOnForWeekdaysRegularCustomer) {
						min =hotels.get(i).hotelRatesOnForWeekdaysRegularCustomer;
						hName=hotels.get(i).hotelName;
						hotelRating=hotels.get(i).ratingOfHotel;
					}
				}
			}
			System.out.println(hName+" total price is "+min);	
			price += min;	
		}			
		System.out.println(hName+",Rating: "+ hotelRating +" total price is "+price);	
	}

	public static void findCheapBestRatedHotelsForRewardCustomerAsPerGivenDates(){
		Date c = new Date();
		int finalPrice = 0;
		int price=0;
		System.out.println("How many days you want to stay");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		String hName = " ";
		for(int j=0;j<n;j++) {			
			String day = c.getDayFromDate();
			System.out.println(day);
			if(day.equals("SUNDAY")||day.equals("SATURDAY")) {
				max = hotels.get(0).ratingOfHotel;
				for(int i =0;i<hotels.size();i++) {
					if (max<=hotels.get(i).ratingOfHotel) {
						max=hotels.get(i).ratingOfHotel;
						hName=hotels.get(i).hotelName;
						price=hotels.get(i).hotelRatesOnWeekendsRewardCustomer;
					}
				}
				System.out.println(price);			
			}
			else {
				max = hotels.get(0).ratingOfHotel;
				for(int i =0;i<hotels.size();i++) {
					if (max<=hotels.get(i).ratingOfHotel) {
						max=hotels.get(i).ratingOfHotel;
						hName=hotels.get(i).hotelName;
						price=hotels.get(i).hotelRatesOnWeekdaysRewardCustomer;
					}
				}
				System.out.println(price);	
			}
			finalPrice = finalPrice + price;
			System.out.println(hName+" total price is "+finalPrice);					
		}			
		System.out.println(hName+",Rating: "+ max +" total price is "+finalPrice);
	}

	public static void findBestRatedHotelsAsPerGivenDates() {
		Date c = new Date();
		int finalPrice = 0;
		int price=0;
		System.out.println("How many days you want to stay");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max=0;
		String hName = " ";
		for(int j=0;j<n;j++) {			
			String day = c.getDayFromDate();
			System.out.println(day);
			if(day.equals("SUNDAY")||day.equals("SATURDAY")) {
				max = hotels.get(0).ratingOfHotel;
				for(int i =0;i<hotels.size();i++) {
					if (max<=hotels.get(i).ratingOfHotel) {
						max=hotels.get(i).ratingOfHotel;
						hName=hotels.get(i).hotelName;
						price=hotels.get(i).hotelRatesOnForWeekendsRegularCustomer;
					}
				}
				System.out.println(price);			
			}
			else {
				max = hotels.get(0).ratingOfHotel;
				for(int i =0;i<hotels.size();i++) {
					if (max<=hotels.get(i).ratingOfHotel) {
						max=hotels.get(i).ratingOfHotel;
						hName=hotels.get(i).hotelName;
						price=hotels.get(i).hotelRatesOnForWeekdaysRegularCustomer;
					}
				}
				System.out.println(price);	
			}
			finalPrice = finalPrice + price;
			System.out.println(hName+" total price is "+finalPrice);					
		}			
		System.out.println(hName+",Rating: "+ max +" total price is "+finalPrice);	
	}

		
	public static void main(String[] args) {		
		
		try {
			findCheapBestRatedHotelsForRewardCustomerAsPerGivenDates();
		}
		catch(Exception e) {
			System.out.println("Enter the proper input");
		}
	}
}