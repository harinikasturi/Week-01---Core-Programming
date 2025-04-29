import java.util.*;
	class Problem7{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sn.nextInt();
			if (num<1){
			System.out.println("error");
			}else{
			int even[]=new int[num/2+1];
			int odd[]=new int[num/2+1];
			int ei=0,oi=0;
			for (int i=1;i<=num;i++){
			if(i%2==0){
				even[ei++]=i;
			}else{
				odd[oi++]=i;
			}
			}
			System.out.println("Even Numbers :");
			for (int i=0;i<ei; i++){
				System.out.println(even[i]+" " );
				}
			System.out.println("Odd Numbers :");
			for (int i=0;i<oi; i++){
				System.out.println(odd[i]+" " );
				}
			}
		}
	}	
			
				
				
			
