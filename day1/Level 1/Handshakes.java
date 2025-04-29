import java.util.*;
	class HandShakes {
			public static void main(String[] args) {
				Scanner sn=new Scanner(System.in);
				System.out.println("Enter the number of students");
				int students=sn.nextInt();
				int handshakes= (students*(students-1))/2;
				System.out.println("The number of handshakes "+handshakes);
	}
}