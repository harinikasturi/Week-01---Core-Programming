import java.util.*;
	class area{
		public static void main(String[] args){
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter the Height");
		int height=sn.nextInt();
		System.out.println("Enter the base");
		int base=sn.nextInt();
		double areainCm=base*height*0.5;
		double areaininch=(double)areainCm/2.54;
		System.out.println("The Area of the triangle in sq in is " + areaininch+ "and sq cm is "+areainCm);
	
	}
}

		
		