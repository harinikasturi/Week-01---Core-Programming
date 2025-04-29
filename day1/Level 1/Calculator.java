import java.util.*;
	class Calculator{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the  two numbers");
			float number1=input.nextFloat();
			float number2=input.nextFloat();
			float Addition=number1+number2;
			float Subtraction=number1-number2;
			float Multiplication=number1*number2;
			float Division=number1/number2;
			System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers" +number1+ " and " +number2+ " is " + Addition+ "," + Subtraction+","+ Multiplication + " and " +Division);
	}
}

	