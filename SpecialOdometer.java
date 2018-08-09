package Day4;

import java.util.ArrayList;

public class SpecialOdometer {

	private ArrayList<Integer> odometerReadings;


	public SpecialOdometer(int noOfDigits)
	{
		odometerReadings=new ArrayList<>();
	}
	private void generateOdometerReadings(int number,int next_possible_digit,int no_of_digits_left)
	{

		 if(no_of_digits_left==0)
	        {
	            odometerReadings.add(number);
	            return;
	        }
	    for (int i=(next_possible_digit+1);i<10;i++)
	        	generateOdometerReadings(number*10+i,i,no_of_digits_left-1);

	}

	public int getIndex(int number)
	{

		return odometerReadings.indexOf(number);
	}
	public void nextNValues(int n,int number)
	{
		for(int i=0;i<n;i++)
		{
			number=next(number);
			System.out.println(number);
		}
	}
	public void prevNValues(int n,int number)
	{
		for(int i=0;i<n;i++)
		{
			number=previous(number);
			System.out.println(number);
		}
	}
	public int next(int number)
	{

		return odometerReadings.get((getIndex(number)+1)%odometerReadings.size());
	}
	public int previous(int number)
	{
		return odometerReadings.get((getIndex(number)-1+odometerReadings.size())%odometerReadings.size());
	}
	public int difference(int number1,int number2)
	{
		return (getIndex(number2)-getIndex(number1)+odometerReadings.size())%odometerReadings.size();
	}
	public static void main(String [] args)
	{
		int n=12456789;
		int noOfDigits=String.valueOf(n).length();
		//System.out.println(noOfDigits);
		SpecialOdometer splOdometer=new SpecialOdometer(noOfDigits);
		splOdometer.generateOdometerReadings(0,0,noOfDigits);
		//System.out.println("Size : "+splOdometer.odometerReadings.size());
		System.out.println(splOdometer.odometerReadings);
		System.out.println("Index is "+splOdometer.getIndex(n));
		System.out.println("Next no is "+splOdometer.next(n));
		System.out.println("Prev no is "+splOdometer.previous(n));
		System.out.println("Next n values : ");
		splOdometer.nextNValues(2,n);
		System.out.println("Previous n values : ");
		splOdometer.prevNValues(2,n);
		System.out.println("Difference :"+splOdometer.difference(12456789,12345789));


	}
	public int getNoOfDigits(int n) {
		return 0;
	}
}
