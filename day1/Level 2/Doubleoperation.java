import java.util.*;
	class intOperation{
		public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		double a = sn.nextDouble();
		double b = sn.nextDouble();
		double c = sn.nextDouble();
		double op1=a+b*c;
		double op2=a*b+c;
		double op3=c+a/b;
		double op4=a%b+c;
		System.out.println(op1 + "," + op2 + " ," + op3 + "," + op4);
	}
}