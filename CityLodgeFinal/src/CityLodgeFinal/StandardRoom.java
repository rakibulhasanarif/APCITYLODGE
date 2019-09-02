package CityLodgeFinal;
import java.util.Scanner;

// Inheritance of Class from Parent Class

public class StandardRoom extends Room {
	 
	//Declaring Variables
	
	 private int numbofrentdays;
	 private double rentalrates;
	 Scanner keyboard= new Scanner(System.in);

	 //Constructor
	 
	public StandardRoom(String roomid, int numbofbedrooms, String feature, String roomtype, String roomstatus,int numbofrentdays,double rentalrates) {
		super(roomid,numbofbedrooms, feature, roomtype, roomstatus);
		// TODO Auto-generated constructor stub
		
		this.numbofrentdays=numbofrentdays;
		this.rentalrates=rentalrates;
	}
	
	//Constructor To Set Values 
	public StandardRoom(String roomid,int numbofbedrooms, String feature, String roomstatus,int numbofrentdays,double rentalrates) {
		this(roomid,numbofbedrooms, feature, "Standard", roomstatus,numbofrentdays,rentalrates);
		// TODO Auto-generated constructor stub
		
	}
	
	
	// Getter & Setter method
	
	public int getnumbofrentdays()
	
	{
		return numbofrentdays;
	}
	
	public void setnumbofrentdays(int numbofrentdays)
	
	{
		this.numbofrentdays=numbofrentdays;
	}
	
	public double getrentalrates()
	
	{
		return rentalrates;
	}
	
	public void setrentalrates(double rentalrates)
	
	{
		this.rentalrates=rentalrates;
	}
	
	//Method For Renting Standard Room
	public  boolean rent(String customerid,DateTime rentDate,int numofrentday)
	
	{
		int maxStay=10;
		String roomstatus= getroomstatus();
		if( roomstatus.equals("Available") && numofrentday <= maxStay)
		{
			
			
			System.out.println("Room is Booked!");
			
			setroomstatus("Rented");
		}
		else
		{
			System.out.println("Sorry! Room is not Available for Rent");
			
		}
		return false;
	}
	
	//Method For Returning Standard Room
	
	public  boolean returnRoom(DateTime renturnDate3,DateTime estimatedReturnDate)
	
	{
		System.out.println(" Rental Rates Are ");
		System.out.println(" $59 per day if the room has 1 bed");
		System.out.println(" $99 per day if the room has 2 beds");
		System.out.println(" $199 per day if the room has 4 beds");
			
		if( DateTime.diffDays(renturnDate3,estimatedReturnDate)==0)
		{
			System.out.println("Enter Total Number of days you have Stayed: ");
			int n =keyboard.nextInt();
			System.out.println("Enter RentalRate: ");
			int m =keyboard.nextInt();
			
			if(m==59||m==99||m==199)
				
			{
				double totalfare=n*m; 
				System.out.println("Your Total Fare IS: "+totalfare);
				System.out.println("Thank You for Coming CityLodge !");
				setroomstatus("Available");
			}
			else
			{
				
				System.out.println("Sorry! You have inserted wrong RentalRate");
			}
			
			
		}
		
		else
		{
			System.out.println("Enter The Estimated Number of Days For Wchich Room Was  Booked: ");
			int n =keyboard.nextInt();
			System.out.println("Enter Actual Number of days you have Stayed: ");
			int p =keyboard.nextInt();
			System.out.println("Enter RentalRate: ");
			int m =keyboard.nextInt();
			
			if(p>n && m==59||m==99||m==199 )
			{
				double latefee=(p-n)*((135*m)/100);
				double regularfee=m*p;
				double totalroomfee=latefee+regularfee;
				System.out.println("Your Total RoomRent is: $" + totalroomfee + " including latefee $" + latefee + "and regularfee : $"+regularfee);
				setroomstatus("Available");
			
			}
			else
			{
				System.out.println("Sorry You have Given Wrong Booking Interval or Room Rent Rate");
			}
		}
		return false;
		
	}
	
	//Method For Performing Maintenance 
	public boolean performMaintenance(String roomid)
	
	{
		String roomstatus= getroomstatus();
		if( roomstatus.equals("Available") )
		{
			setroomstatus("UnderMantainace");
			
			System.out.println("Standard Room " +roomid+ "is now under maintenance");
			
			
		}
		else
		{
			System.out.println("Sorry! Standard room "+ roomid +" is alreday rented by a customer ");
			
		}
		
		return false;
			
	}
	
	//Method For Completing Maintenance 
	
	@Override
	public boolean completeMaintenace(String roomid)
	
	{
		String roomstatus= getroomstatus();
		if( roomstatus.equals("UnderMantainace") )
		
		{
			setroomstatus("Available");
			
			System.out.println("Standard Room " +roomid+ "has all maintenance operations completed and is now ready for rent");
			
			
		}
		else
		{
			System.out.println("Sorry! Standard room "+ roomid +" was not Under Mantainence ");
			
		}
		
		return false;
		
	}

	//Method For Completing Maintenance 
	
	public boolean completeMaintenace(String roomid, DateTime completeMaintance5) 
	{
		String roomstatus= getroomstatus();
		if( roomstatus.equals("UnderMantainace") )
		{
			setroomstatus("Available");
			
			System.out.println("Standard Room " +roomid+ "has all maintenance operations completed and is now ready for rent");
			
			
		}
		else
		{
			System.out.println("Sorry! Standard room "+ roomid +" was not Under Mantainence ");
			
		}
		
		return false;
		
	}


	
	

}
