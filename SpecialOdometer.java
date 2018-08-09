package SplOdometer;

import Day4.SpecialOdometer1;

public class SpecialOdometer {

	private int [] odometerReadings;

	public int getIndex()
	{
		int index=0;
		return index;
	}
	public int next()
	{
		int next=0;
		return next;
	}
	public int previous()
	{
		int prev=0;
		return prev;
	}
	public int difference()
	{
		int speed1=0,speed2=0;
		return speed2-speed1;
	}
	public static void main(String [] args)
	{
		int n=2345;
		SpecialOdometer1 splOdometer=new SpecialOdometer1();
		int noOfDigits=splOdometer.getNoOfDigits(n);
	}
	public int getNoOfDigits(int n) {
		return 0;
	}

}
