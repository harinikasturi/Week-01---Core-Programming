import java.util.*;
	class Problem1{
		public static void main(String[] args){
			Scanner sn=new Scanner(System.in);
			int[] age= new int[10];
			System.out.println("Enter the age of students");
			for(int i=0; i<age.length;i++){
			age[i]=sn.nextInt();
			}
			for (int i=0;i<age.length;i++){
				if (age[i]>=18){
					System.out.println("The student with the age" + age[i]+ "can vote");
				}else{
					System.out.println("The student with the age" + age[i]+ "cannot vote" );
			}
		}
	}
}