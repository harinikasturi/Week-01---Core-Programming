import java.util.*;
	public class Celsius{
		public static void main(String[] args){
		System.out.println("Enter the temperature");
		Scanner sn=new Scanner(System.in);
		float Fahrenheit=sn.nextFloat();
		float Celsius=(Fahrenheit-32)*5/9;
		System.out.println("The Celsius is" + Celsius);
	}
}