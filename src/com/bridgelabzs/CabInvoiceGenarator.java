package com.bridgelabzs;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CabInvoiceGenarator {
	public static int costPerKms=10;
    public static final int COST_PER_MIN=1;
    public static int totalNumberOfRides;
    public static double totalFare;
    public static double AverageFarePerRide;
    public static double totalDistance;
    public static double totalTime;

    static List<RideHistory > userList = new ArrayList<RideHistory>();



    public static double generateInvoiceAsPerUserID(int id) {
        RideHistory user1 = new RideHistory (1,10.0,20.0);
        RideHistory  user2 = new RideHistory (2,20.0,40.0);
        RideHistory  user4 = new RideHistory (1,10.0,20.0);
        RideHistory  user5 = new RideHistory (2,20.0,40.0);	       
        RideHistory  user3 = new RideHistory (3,30.0,60.0);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user5);
        return getInvoice(userList.get(id).getTotalDistance(),userList.get(id).getTotalRideDuration(),"R");
    }


    public static void getEnhancedInvoice() {
        int counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rides");
        totalNumberOfRides = scanner.nextInt();
        while(counter<=totalNumberOfRides){
            System.out.println("Enter the details of "+counter+" ride");
            System.out.println("Enter the distance for ride: "+counter);
            double distanceCovered = scanner.nextDouble();
            totalDistance = totalDistance + distanceCovered;
            System.out.println("Enter the time for ride: "+counter);
            double timeSpent = scanner.nextDouble();
            totalTime = totalTime + timeSpent;
            counter++;
        }
        getInvoice(totalDistance,totalTime,"R");

        scanner.close();
    }

    public static double getInvoice(double totalKms,double getTime,String PremiumOrRegular) {
        double totalFare;
        if(PremiumOrRegular.equals("P")) {
            costPerKms=20;
        }
        totalFare = (totalKms*costPerKms)+(getTime*COST_PER_MIN);
        if(totalFare<=5) {
            totalFare=5;
            System.out.println("--------------Invoice------------");
            System.out.println("Total payable amount : 5");
            System.out.println("---------------------------------");
            return totalFare;

        }else {
            System.out.println("--------------Invoice------------");
            System.out.println("Total distance travelled : "+totalKms);
            System.out.println("Total Ride Duration : "+getTime);
            System.out.println("Total payable amount for ride is "+totalFare);
            System.out.println("Average Fare Per Ride is "+totalFare/totalNumberOfRides);

            System.out.println("---------------------------------");
            return totalFare;
        }
    }

    public static void main(String[] args) {
        getInvoice(10.0, 20.0, "P");

        generateInvoiceAsPerUserID(5);
    }
}