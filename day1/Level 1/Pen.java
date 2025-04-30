import java.util.*;
	class Pen{
		public static void main(String[] args){
		int students=3;
		int pens=14;
		int penPerEach=pens/students;
		int remaining=pens%students;
		System.out.println("The Pen Per Student is "+ penPerEach +" and the remaining pen not distributed is" +remaining);
	}
}
