import java.util.*;
	class TravelComputation {
			public static void main(String[] args) {
				Scanner sn=new Scanner(System.in);
				String name = "Eric";
				System.out.println("Enter fromCity");
				String fromCity = sn.nextLine();
				System.out.println("Enter viaCity");
				String viaCity =sn.nextLine(); 
				System.out.println("Enter toCity");	  
				String toCity =sn.nextLine();
				System.out.println("Enter distance fromCity to via city ");
				double distanceFromToVia = sn.nextDouble();
				System.out.println("Enter time to via city");
				int timeFromToVia =  sn.nextInt();
				System.out.println("Enter distance from via city  to tocity");
				double distanceViaToFinalCity =  sn.nextDouble();
				System.out.println("Enter time to finalcity");
				int timeViaToFinalCity = sn.nextInt();
				double totalDistance = distanceFromToVia + distanceViaToFinalCity;
				int totalTime = timeFromToVia + timeViaToFinalCity;
				System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
