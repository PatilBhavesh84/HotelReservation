package com.bridgelabz;

public class HotelReservation {
	String hotelName;
	String hotelRatesForWeekdaysRegularCustomer;
	String hotelRatesForWeekendsRegularCustomer;
	String hotelRatesWeekdaysRewardCustomer;
	String hotelRatesWeekendsRewardCustomer;
	String ratingOfHotel;

	public HotelReservation (String hName,String hratesWeekdayRC,String hRatesOnWeekdaysRC,String hRatesOnWeekdaysRewardCustomer,String hRatesOnWeekendsRewardCustomer,String ratingHotel) {
		this.hotelName=hName;
		this.hotelRatesForWeekdaysRegularCustomer=hratesWeekdayRC;
		this.hotelRatesForWeekendsRegularCustomer=hRatesOnWeekdaysRC;
		this.hotelRatesWeekdaysRewardCustomer=hRatesOnWeekdaysRewardCustomer;
		this.hotelRatesWeekendsRewardCustomer=hRatesOnWeekendsRewardCustomer;
		this.ratingOfHotel=ratingHotel;
	}
	public String toString(){
		return hotelName+"\n"+"Hotel rate on Weekdays for Regular Customer: "+hotelRatesForWeekdaysRegularCustomer+
				"\nHotel rate on Weekends for Regular Customer: "+hotelRatesForWeekendsRegularCustomer+
				"\nHotel rate on Weekdays for Regular Customer: "+hotelRatesWeekdaysRewardCustomer+
				"\nHotel rate on Weekends for Regular Customer: "+hotelRatesWeekendsRewardCustomer+
				"\nRating: "+ratingOfHotel;  
	}  
	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation Program");
		HotelReservation lakewood = new HotelReservation("Lakewood","110","80","90","80","3");
		System.out.println(lakewood);
		HotelReservation Bridgewood = new HotelReservation("Bridgewood","160","110","60","50","4");
		System.out.println(Bridgewood);
		HotelReservation Ridgewood = new HotelReservation("Ridgewood","220","100","150","40","5");
		System.out.println(Ridgewood);
	}
}