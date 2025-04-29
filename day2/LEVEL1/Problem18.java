import java.util.*;
	class P18{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			if (num>=6&&num<=9){
			for (int i=1;i<=10;i++){
			System.out.println(num + "*" + i + "="+(num*i));
			
			}
		}
		else{
			System.out.println("the number is not between 6 and 9");
			}
	}
}
