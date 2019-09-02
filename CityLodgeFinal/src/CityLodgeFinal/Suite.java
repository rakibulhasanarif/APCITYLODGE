package CityLodgeFinal;
import java.util.Scanner;
//Inheritance of Class from Parent Class

public class Suite extends Room 
{
	//Declaring Variable 
	 private int rentdays;
	 private double rent;
	 private double latefee;
	 Scanner keyboard= new Scanner(System.in);
	 
	 //Constructor 
	 
		public Suite(String roomid,int numbofbedrooms,String feature,String roomtype,String roomstatus,int rentdays,double rent) 
		{
			super(roomid,numbofbedrooms, feature, roomtype, roomstatus);
			// TODO Auto-generated constructor stub
			this.rentdays=rentdays;
			this.rent=rent;
			
		}
		
		//COnstant Values 
		public Suite(String roomid,String feature,String roomstatus,int rentdays,double rent) 
		
		{
			this (roomid, 6,feature, "Suite", roomstatus,rentdays,999);
			// TODO Auto-generated constructor stub
			
		}
		//Getter & Setter Method
		
		public int  getrentdays()
		
		{
			return rentdays;
		}
		
		public void setrentdays(int bedroom)
		
		{
			this.rentdays=bedroom;
		}
		
		public double  getrent()
		
		{
			return rent;
		}
		
		public void setrent(double rent)
		
		{
			this.rent=rent;
		}
		
		public double  getlatefee()
		
		{
			return latefee;
		}
		
		public void setlatefee(double latefee)
		
		{
			this.latefee=latefee;
		}
		
		//Method For Renting a Suite
		
		public boolean rent(String CustomerId,DateTime rentDate,int numofRentDay)
		{
			// TODO Auto-generated method stub
			{
				String roomstatus= getroomstatus();
				if( roomstatus.equals("Available"))
				{
					
					System.out.println("Suite is Booked!");
					setroomstatus("Rented");
				}
				else
				{
					System.out.println("Sorry! Suite is not Available for Rent");
					
				}
				return false;
			}
		}
		
		//Method For Returning a Suite
		
		public  boolean returnRoom(DateTime renturnDate3,DateTime estimatedReturnDate)
		{
			System.out.println(" Rental Rate for Sute is $999 ");
			System.out.println(" Late  Fee for Sute is $1099 per day ");
			double rent=999;
			
			if( DateTime.diffDays(renturnDate3,estimatedReturnDate)<=0)
			{
				System.out.println("Enter Total Number of days you have Stayed: ");
				int n =keyboard.nextInt();
				
							
					double totalfare=n*rent; 
					System.out.println("Your Total Fare IS: "+totalfare);
					System.out.println("Thank You for Coming CityLodge !");
					setroomstatus("Available");
				
				
			}
			
			else
			{
				System.out.println("Enter The Estimated Number of Days For Wchich Room Was  Booked: ");
				int n =keyboard.nextInt();
				System.out.println("Enter Actual Number of days you have Stayed: ");
				int p =keyboard.nextInt();
				
				
				if(p>n  )
				{
					double latefee=(p-n)*1099;
					double regularfee=rent*p;
					double totalroomfee=latefee+regularfee;
					System.out.println("Your Total RoomRent is: $" + totalroomfee + " including latefee $" + latefee + "and regularfee : $"+regularfee);
					setroomstatus("Available");
				
				}
				else
				{
					System.out.println("Sorry You have Given Wrong Booking Interval ");
				}
			}
			return false;
			
		}
		//Method For Performing Suite Maintenance 
		public boolean performMaintenance(String roomid)
		
		{
			String roomstatus= getroomstatus();
			if( roomstatus.equals("Available") )
			{
				setroomstatus("UnderMantainace");
				
				System.out.println("Suite " + roomid + "is now under maintenance");
				
				
			}
			else
			{
				System.out.println("Sorry! Suite "+ roomid +" is alreday rented by a customer ");
				
			}
			
			return false;
				
		}
		
		//Method For Completing Suite Maintenance 
		public boolean completeMaintenace(String roomid)
		
		{
			String roomstatus= getroomstatus();
			if( roomstatus.equals("UnderMantainace") )
			{
				setroomstatus("Available");
				
				System.out.println("Suite " +roomid+ "has all maintenance operations completed and is now ready for rent");
				
				
			}
			else
			{
				System.out.println("Sorry! Suite "+ roomid +" was not Under Mantainence ");
				
			}
			
			return false;
			
		}

		@Override
		public boolean completeMaintenace(String roomid, DateTime completeMaintance5) 
		{
			String roomstatus= getroomstatus();
			if( roomstatus.equals("UnderMantainace") )
			{
				setroomstatus("Available");
				
				System.out.println("Suite " + roomid + "has all maintenance operations completed and is now ready for rent");
				
				
			}
			else
			{
				System.out.println("Sorry! Suite "+ roomid +" was not Under Mantainence ");
				
			}
			
			return false;
			
		}


		
}