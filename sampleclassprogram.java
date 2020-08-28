import java.util.*;

public class sampleclassprogram
{
	//instance variable
	private final double pi=3.14 ,radius;

	//constructor -same method name as class name
	public sampleclassprogram(double r1)
	{
		radius = r1;
	}

	//CAlculate circumference of circle using instance variables 
	public double circumference(double radi)
	{
		double circumfrnce = 2 * pi * radi;
		return circumfrnce;
	}

	//main method
	public static void main(String args[])
	{

		double radi = Double.parseDouble(args[0]);

		//create and initialize objects and invoke constructors
		sampleclassprogram c1 = new sampleclassprogram(4.5);

		//invoke method using ojects
		double n1 = c1.circumference(radi);

		//Display circumference
		StdOut.printf("Circumference : %.2e\n", n1);
		}
}
