import java.util.*;
	class Earth{
		public static void main(String[] args){
		int radius=6378;
		double radiusinmiles=radius/1.6;
		double volumeinkms=(double)4/3*3.14*Math.pow(radius,3);
		double volumeinmiles=(double)4/3*3.14*Math.pow(radiusinmiles,3);
		System.out.println("The volume of earth in cubic kilometers is "+ volumeinkms+ "and cubic miles is "+volumeinmiles);
	}
}

		