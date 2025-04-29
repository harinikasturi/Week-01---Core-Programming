import java.util.*;
	class problem4{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int num[]=new int[10];
		double total=0.0;
		int i =0;
		while(true){
		num[i]=sn.nextInt();
		if(num[i]<=0){
		break;}
		i++;
		if(i>=10){
		break;
		}
		}
		for (i=0;i<10;i++){
		if(num[i]<=0){
	    break;
		}
		System.out.println("the numbers are"+num[i]);
		total+=num[i];
		}
		System.out.println("The total is" +total);
		}
		}
		