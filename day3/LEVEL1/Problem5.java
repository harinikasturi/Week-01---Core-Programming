import java.util.*;
	class problem5{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sn.nextInt();
			if(num<6||num>9){
			System.out.println("Wrong number");
			}else{
			int table[] =new int[10];
			for (int i=0;i<10;i++){
			table[i]=num*(i+1);
			}
			for (int i=0;i<10;i++){
			System.out.println( +num+ "*" +(i+1)+ "=" +table[i]);
			}
			}
			}
	}
			