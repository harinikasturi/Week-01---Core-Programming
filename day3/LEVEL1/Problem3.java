import java.util.*;
	class problem3{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sn.nextInt();
			int table[] =new int[10];
			for (int i=0;i<10;i++){
			table[i]=num*(i+1);
			}
			for (int i=0;i<10;i++){
			System.out.println( +num+ "*" +(i+1)+ "=" +table[i]);
			}
			}
			}
			
			
			