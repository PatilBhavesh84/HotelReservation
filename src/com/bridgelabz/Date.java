package com.bridgelabz;

import java.time.LocalDate;
import java.util.Scanner;

public class Date {	public static String getDayFromDate() {
	System.out.println("Enter the date, month and year to get day");
	Scanner sc = new Scanner(System.in);
	int date = sc.nextInt();
	int month = sc.nextInt();
	int year = sc.nextInt();
	LocalDate localDate = LocalDate.of(year,month,date);
	java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
	String day = dayOfWeek.toString();
	return day;
}
public static void main(String[] args) {
	String day = getDayFromDate();
	System.out.println(day);
}
}
