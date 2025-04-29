import java.util.*;
	class intOperation{
		public static void main(String[] args){
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter Three numbers");
		int a = sn.nextInt();
		int b = sn.nextInt();
		int c = sn.nextInt();
		int op1=a+b*c;
		int op2=a*b+c;
		int op3=c+a/b;
		int op4=a%b+c;
		System.out.println(op1 + "," + op2 + " ," + op3 + "," + op4);
	}
}
		
		