package CityLodgeFinal;
//Importing Necessary Packages
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import CityLodgeFinal.DateTime;


public class CityLodge 
{
	
	private ArrayList<HiringRecord> CityLodgeHiringRecord= new ArrayList<HiringRecord>();
	private ArrayList<Room> CityLodgeRoom= new ArrayList<Room>(50);
	private ArrayList<StandardRoom> CityLodgeStandardRoom= new ArrayList<StandardRoom>();
	private ArrayList<Suite> CityLodgeSuite= new ArrayList<Suite>();
	
	
	public ArrayList<Room> getCityLodgeRoom()
	{
		
		return this.CityLodgeRoom;
		
	}
	
	
	public void setCityLogeRoom(ArrayList<Room> CityLodgeRoom)
	{
		
		this.CityLodgeRoom=CityLodgeRoom;
		
	}
	
	
	public ArrayList<HiringRecord> getCityLodgeHiringRecord()
	{
 		
		return this.CityLodgeHiringRecord;
		
	}
	
	
	public void setCityLogeHiringRecord(ArrayList<HiringRecord>CityLodgeHiringRecord)
	{
		
		this.CityLodgeHiringRecord=CityLodgeHiringRecord;
		
	}
	
	
	public ArrayList<StandardRoom> getCityLodgeStandardRoom()
	{
		
		return this.CityLodgeStandardRoom;
		
	}
	
	
	public void setCityLogeStandardRoom(ArrayList<StandardRoom> CityLodgeStandardRoom)
	{
		
		this.CityLodgeStandardRoom=CityLodgeStandardRoom;
		
	}
	
	
	public ArrayList<Suite> getCityLodgeSuite()
	{
		
		return this.CityLodgeSuite;
		
	}
	
	
	public void setCityLogeSuite(ArrayList<Suite> CityLodgeSuite)
	{
		
		this.CityLodgeSuite=CityLodgeSuite;
		
	}
	
	//Method That Will Run Menu
	public void runApp()
	{
		int j = 0;
		
		Scanner keyboard= new Scanner(System.in);
		CityLodge lodge= new CityLodge();
		
	
		//Main Menu Display
		
		System.out.println("Welcome to CityLodge");
		System.out.println("***** CITYLODGE MAIN MENU******");
		System.out.println(" Add Room                      1");
		System.out.println(" Rent Room                     2");
		System.out.println(" Return Room                   3");
		System.out.println(" Room Maintenance              4");
		System.out.println(" Complete Manteinance          5");
		System.out.println(" Display All Rooms             6");
		System.out.println(" Exit Programme                7");
		
		
		
		// loop so that menu runs until user choose to exit
				do 
				{
				System.out.println("You Are In Main Menu. Please Enter Your Chocie: \n");
				
				//Exception Handling
				try {
			
						j = keyboard.nextInt();
						keyboard.nextLine();
						
				}catch(InputMismatchException e)
						
				{
					System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1-7 ");
					
					keyboard.nextLine();
				}
				
				switch (j) 
				
				{
				
				// Adding Room Into The System
		       
				case 1:
		        	
		        	try 
		        	{
		        		
		        	System.out.println("Please Press 1 for Standard Room or Press 2 for Suite: ");
		        	int roomtype1=keyboard.nextInt();
		        	keyboard.nextLine();
		        	
		        	if(roomtype1 == 1)
		        	{
					try
					{
						//taking input for necessary validation of Add Standard Room
						
						System.out.println("Enter RoomID Which Starts With 'R':  ");
						String roomID111= keyboard.nextLine();
						
						if(roomID111.charAt(0) != 'R')
						{
							System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
							break;
						}
						
						
						
						System.out.println("Enter Features:  ");
						String features113= keyboard.nextLine();
					
						
						System.out.println("Enter RoomStatus:  ");
						String roomstatus115= keyboard.nextLine();
						
						if(roomstatus115.equals("Available"))
						{
							
							
						}
						
						else
						{
							System.out.println("Sorry Your Room Status Should Be Available as You Are Creating A New Room");
							break;
						}
						
						
						System.out.println("Enter numberofbedrooms:  ");
						int numbofbedrooms116 = Integer.parseInt(keyboard.nextLine()) ;
						
					   
						
						System.out.println("Enter NumberofRentdays:  ");
						int numbofrentdays117 = Integer.parseInt(keyboard.nextLine()) ;
						
					
						System.out.println("Enter rentrates:  ");
						double rentrates118 = Double.parseDouble(keyboard.nextLine()) ;
						
						
						StandardRoom s2=new StandardRoom(roomID111,numbofbedrooms116,features113,"Standard",roomstatus115,numbofrentdays117,rentrates118);
						lodge.addRoom(s2);
						lodge.showStandardRoom();
						
						
					} catch(NumberFormatException e)
					{
						System.out.println("Sorry Your Input Is Valid.Please Try Again!");
						keyboard.nextLine();
					}
					
		        	}
		        	
		        	else if(roomtype1 == 2)
		        	{
		        		try 
		        		{
		        			//taking input for necessary validation of Add Suite
		        			
							System.out.println("Enter RoomID Which Starts With 'S':  ");
							String roomID121= keyboard.nextLine();
							
							if(roomID121.charAt(0)!='S')
							{
								System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
								break;
							}
							
							
							
							System.out.println("Enter Features:  ");
							String features123= keyboard.nextLine();
						
							
							System.out.println("Enter RoomStatus:  ");
							String roomstatus125= keyboard.nextLine();
							
							if(roomstatus125.equals("Available"))
							{
								
								
							}
							else
							{
								System.out.println("Sorry Your Room Status Should Be Available as You Are Creating A New Room");
								break;
							}
													   
							
							System.out.println("Enter NumberofRentdays:  ");
							int numbofrentdays127 = Integer.parseInt(keyboard.nextLine()) ;
							
							//object that pass value to 					
							Suite s2=new Suite(roomID121,6,features123,"Suite",roomstatus125,numbofrentdays127,999);
							lodge.addRoom(s2);
							lodge.showSuite();
							
							
						} catch(NumberFormatException e)
						{
							System.out.println("Sorry Your Input Is Valid.Please Try Again!");
							keyboard.nextLine();
						}
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Sorry Your Input Is Not Valid. Please Insert a number Between 1 or 2");
		        	}
		        	
		        	}catch(InputMismatchException e)
		        	
		        	{
		        		System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1 or 2 ");
						
						keyboard.nextLine();
		        	}
						
					
		        	break;
		        	
		        	//Renting A Room
		        	
		        case 2:
		        	
		        	try 
		        	{
		        		//
		        	System.out.println("Please Press 1 for Standard Room or Press 2 for Suite: ");
		        	int roomtype1=keyboard.nextInt();
		        	keyboard.nextLine();
		        	
		        	if(roomtype1 == 1)
		        	{
					try
					{
						
						System.out.println("Enter RoomID Which Starts With 'R':  ");
						String roomID211= keyboard.nextLine();
						
						if(roomID211.charAt(0) != 'R')
						{
							System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
							break;
						}
						
						
						System.out.println("Enter CustomerId: ");
						String customerid212=keyboard.nextLine();
						
						System.out.println("Enter RentDate(dd/mm/yy) :   ");
						
						System.out.println("Enter RentDay :   ");
						int rentday1 = Integer.parseInt(keyboard.nextLine()) ;
						
						if(rentday1 == 1 || rentday1 == 2 || rentday1 == 3 || rentday1 == 4|| rentday1 == 5 || rentday1 == 6 || rentday1 == 7 || rentday1 == 8 || rentday1 == 9|| rentday1 == 10|| rentday1 == 11 || rentday1 == 12||rentday1==13||rentday1==14||rentday1==15||rentday1==16||rentday1==17||rentday1==18||rentday1==19||rentday1==20||rentday1==21||rentday1==22||rentday1==23||rentday1==24||rentday1==25||rentday1==26||rentday1==27||rentday1==28||rentday1==29||rentday1==30||rentday1==31)
						{
							
						}
						else
						{
							System.out.println("Day Should be Between 1 tp 31");
						}
						
						System.out.println("Enter RentMonth :   ");
						int rentmonth1 = Integer.parseInt(keyboard.nextLine()) ;
						
						if(rentmonth1==1||rentmonth1==2||rentmonth1==3||rentmonth1==4||rentmonth1==4||rentmonth1==6||rentmonth1==7||rentmonth1==8||rentmonth1==9||rentmonth1==10||rentmonth1==11||rentmonth1==12)
						{
							
						}
						else
						{
							System.out.println("Month Should be Between 1 tp 31");
						}
						
						System.out.println("Enter RentYear :   ");
						int rentyear1 = Integer.parseInt(keyboard.nextLine()) ;
						if(rentyear1<2019)
						{
							System.out.println("Year Should not be less than 2019 as it is the current year ");
						}
						DateTime rentDate= new DateTime(rentday1,rentmonth1,rentyear1);
				
						
						System.out.println("How many Days You Want To Stay ?: ");
						int o=keyboard.nextInt();
						
							
						for(int i=0;i<lodge.getCityLodgeStandardRoom().size();i++)
						{
							if(roomID211.equals(lodge.getCityLodgeStandardRoom().get(i).getroomid()) )
							{
								lodge.getCityLodgeStandardRoom().get(i).rent( customerid212, rentDate, o);
								
							}
							else
							{
								System.out.println("This Room Does Not Exist");
							}
						}
			
						
					} catch(NumberFormatException e)
					{
						System.out.println("Sorry Your Input Is Valid.Please Try Again!");
						keyboard.nextLine();
					}
					
		        	}
		        	
		        	else if(roomtype1==2)
		        	{
		        		try 
		        		{
		        			System.out.println("Enter RoomID Which Starts With 'S':  ");
							String roomID221= keyboard.nextLine();
							
							if(roomID221.charAt(0)!='S')
							{
								System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'S' At First  ");
								break;
							}
							
							
							System.out.println("Enter CustomerId: ");
							String customerid=keyboard.nextLine();
							
							
							System.out.println("Enter RentDate(dd/mm/yy) :   ");
							
							System.out.println("Enter RentDay :   ");
							int rentday1 = Integer.parseInt(keyboard.nextLine()) ;
							
							if(rentday1==1||rentday1==2||rentday1==3||rentday1==4||rentday1==5||rentday1==6||rentday1==7||rentday1==8||rentday1==9||rentday1==10||rentday1==11||rentday1==12||rentday1==13||rentday1==14||rentday1==15||rentday1==16||rentday1==17||rentday1==18||rentday1==19||rentday1==20||rentday1==21||rentday1==22||rentday1==23||rentday1==24||rentday1==25||rentday1==26||rentday1==27||rentday1==28||rentday1==29||rentday1==30||rentday1==31)
							{
								
							}
							else
							{
								System.out.println("Day Should be Between 1 tp 31");
							}
							
							System.out.println("Enter RentMonth :   ");
							int rentmonth1 = Integer.parseInt(keyboard.nextLine()) ;
							
							if(rentmonth1==1||rentmonth1==2||rentmonth1==3||rentmonth1==4||rentmonth1==4||rentmonth1==6||rentmonth1==7||rentmonth1==8||rentmonth1==9||rentmonth1==10||rentmonth1==11||rentmonth1==12)
							{
								
							}
							else
							{
								System.out.println("Month Should be Between 1 tp 31");
							}
							
							System.out.println("Enter RentYear :   ");
							int rentyear1 = Integer.parseInt(keyboard.nextLine()) ;
							if(rentyear1<2019)
							{
								System.out.println("Year Should not be less than 2019 as it is the current year ");
							}
							DateTime rentDate= new DateTime(rentday1,rentmonth1,rentyear1);
					
							
							System.out.println("How many Days You Want To Stay ?: ");
							int o=keyboard.nextInt();
							
								
							for(int i=0;i<lodge.getCityLodgeSuite().size();i++)
							{
								if(roomID221.equals(lodge.getCityLodgeSuite().get(i).getroomid()) )
								{
									lodge.getCityLodgeSuite().get(i).rent( customerid, rentDate, o);
									
								}
								else
								{
									System.out.println("This Room Does Not Exist");
								}
							}
							
							
						} catch(NumberFormatException e)
						{
							System.out.println("Sorry Your Input Is Valid.Please Try Again!");
							keyboard.nextLine();
						}
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Sorry Yoour Input Is Not Valid. Please Insert a number Between 1 or 2");
		        	}
		        	
		        	}catch(InputMismatchException e)
		        	
		        	{
		        		System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1 or 2 ");
						
						keyboard.nextLine();
		        	}
		        	
		        	
		            break;
		            
		          //Return A Room 
		            
		        case 3:
		        	
		        	try 
		        	{
		        	System.out.println("Please Press 1 for Standard Room or Press 2 for Suite: ");
		        	int roomtype1=keyboard.nextInt();
		        	keyboard.nextLine();
		        	
		        	if(roomtype1==1)
		        	{
					try
					{
						
						System.out.println("Enter RoomID Which Starts With 'R':  ");
						String roomID311= keyboard.nextLine();
						
						if(roomID311.charAt(0)!='R')
						{
							System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
							break;
						}
						
						System.out.println("Enter Estimated ReturnDate(dd/mm/yy) :   ");
						
					 	System.out.println("Enter Estimated RenturnDay :   ");
						int estimatedReturnDay3=Integer.parseInt(keyboard.nextLine());
						
						if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==5||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12||estimatedReturnDay3==13||estimatedReturnDay3==14||estimatedReturnDay3==15||estimatedReturnDay3==16||estimatedReturnDay3==17||estimatedReturnDay3==18||estimatedReturnDay3==19||estimatedReturnDay3==20||estimatedReturnDay3==21||estimatedReturnDay3==22||estimatedReturnDay3==23||estimatedReturnDay3==24||estimatedReturnDay3==25||estimatedReturnDay3==26||estimatedReturnDay3==27||estimatedReturnDay3==28||estimatedReturnDay3==29||estimatedReturnDay3==30||estimatedReturnDay3==31)
						{
							
						}
						
						else
						{
							System.out.println("Day Should be Between 1 tp 31");
						}
						
						System.out.println("Enter Estimated RenturnMonth :   ");
						int estimatedReturnMonth3=Integer.parseInt(keyboard.nextLine());
						
						if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==4||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12)
						{
							
						}
						else
						{
							System.out.println("Month Should be Between 1 tp 31");
						}
						
						System.out.println("Enter Estimated RenturnYear :   ");
						int estimatedReturnYear3=Integer.parseInt(keyboard.nextLine()) ;
			
						if(estimatedReturnYear3<2019)
						{
							System.out.println("Year Should not be less than 2019 as it is the current year ");
						}
						
						DateTime estimatedReturnDate= new DateTime(estimatedReturnDay3,estimatedReturnMonth3,estimatedReturnYear3);
						
						System.out.println("Enter Original ReturnDate(dd/mm/yy) :   ");	
						System.out.println("Enter Original RenturnDay :   ");
						int returnday2=Integer.parseInt(keyboard.nextLine()) ;
						
						if(returnday2==1||returnday2==2||returnday2==3||returnday2==4||returnday2==5||returnday2==6||returnday2==7||returnday2==8||returnday2==9||returnday2==10||returnday2==11||returnday2==12||returnday2==13||returnday2==14||returnday2==15||returnday2==16||returnday2==17||returnday2==18||returnday2==19||returnday2==20||returnday2==21||returnday2==22||returnday2==23||returnday2==24||returnday2==25||returnday2==26||returnday2==27||returnday2==28||returnday2==29||returnday2==30||returnday2==31)
						{
							
						}
						else
						{
							System.out.println("Day Should be Between 1 tp 31");
						}
						
						System.out.println("Enter Original RenturnMonth :   ");
						int returnmonth2=Integer.parseInt(keyboard.nextLine()) ;
						
						if(returnmonth2==1||returnmonth2==2||returnmonth2==3||returnmonth2==4||returnmonth2==4||returnmonth2==6||returnmonth2==7||returnmonth2==8||returnmonth2==9||returnmonth2==10||returnmonth2==11||returnmonth2==12)
						{
							
						}
						else
						{
							System.out.println("Month Should be Between 1 tp 31");
						}
						
						System.out.println("Enter Original RenturnYear :   ");
						int returnyear2=Integer.parseInt(keyboard.nextLine()) ;
			
						if(estimatedReturnYear3<2019)
						{
							System.out.println("Year Should not be less than 2019 as it is the current year ");
						}
				       	
				       	
				       	DateTime returnDatee= new DateTime(returnday2,returnmonth2,returnyear2);
				       	
				       	
				       	for(int i=0;i<lodge.getCityLodgeStandardRoom().size();i++)
						{
							if(roomID311.equals(lodge.getCityLodgeStandardRoom().get(i).getroomid()) )
							{
								lodge.getCityLodgeStandardRoom().get(i).returnRoom( returnDatee,estimatedReturnDate );
								
							}
						}
						
						
						
			
						
					} catch(NumberFormatException e)
					{
						System.out.println("Sorry Your Input Is Valid.Please Try Again!");
						keyboard.nextLine();
					}
					
		        	}
		        	
		        	else if(roomtype1==2)
		        	{
		        		{
							try
							{
								
								System.out.println("Enter RoomID Which Starts With 'S':  ");
								String roomID311= keyboard.nextLine();
								
								if(roomID311.charAt(0)!='S')
								{
									System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'S' At First  ");
									break;
								}
								
								System.out.println("Enter Estimated ReturnDate(dd/mm/yy) :   ");
								
							 	System.out.println("Enter Estimated RenturnDay :   ");
								int estimatedReturnDay3=Integer.parseInt(keyboard.nextLine());
								
								if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==5||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12||estimatedReturnDay3==13||estimatedReturnDay3==14||estimatedReturnDay3==15||estimatedReturnDay3==16||estimatedReturnDay3==17||estimatedReturnDay3==18||estimatedReturnDay3==19||estimatedReturnDay3==20||estimatedReturnDay3==21||estimatedReturnDay3==22||estimatedReturnDay3==23||estimatedReturnDay3==24||estimatedReturnDay3==25||estimatedReturnDay3==26||estimatedReturnDay3==27||estimatedReturnDay3==28||estimatedReturnDay3==29||estimatedReturnDay3==30||estimatedReturnDay3==31)
								{
									
								}
								
								else
								{
									System.out.println("Day Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Estimated RenturnMonth :   ");
								int estimatedReturnMonth3=Integer.parseInt(keyboard.nextLine());
								
								if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==4||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12)
								{
									
								}
								else
								{
									System.out.println("Month Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Estimated RenturnYear :   ");
								int estimatedReturnYear3=Integer.parseInt(keyboard.nextLine()) ;
					
								if(estimatedReturnYear3<2019)
								{
									System.out.println("Year Should not be less than 2019 as it is the current year ");
								}
								
								DateTime estimatedReturnDate= new DateTime(estimatedReturnDay3,estimatedReturnMonth3,estimatedReturnYear3);
								
								System.out.println("Enter Original ReturnDate(dd/mm/yy) :   ");	
								System.out.println("Enter Original RenturnDay :   ");
								int returnday2=Integer.parseInt(keyboard.nextLine()) ;
								
								if(returnday2==1||returnday2==2||returnday2==3||returnday2==4||returnday2==5||returnday2==6||returnday2==7||returnday2==8||returnday2==9||returnday2==10||returnday2==11||returnday2==12||returnday2==13||returnday2==14||returnday2==15||returnday2==16||returnday2==17||returnday2==18||returnday2==19||returnday2==20||returnday2==21||returnday2==22||returnday2==23||returnday2==24||returnday2==25||returnday2==26||returnday2==27||returnday2==28||returnday2==29||returnday2==30||returnday2==31)
								{
									
								}
								else
								{
									System.out.println("Day Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Original RenturnMonth :   ");
								int returnmonth2=Integer.parseInt(keyboard.nextLine()) ;
								
								if(returnmonth2==1||returnmonth2==2||returnmonth2==3||returnmonth2==4||returnmonth2==4||returnmonth2==6||returnmonth2==7||returnmonth2==8||returnmonth2==9||returnmonth2==10||returnmonth2==11||returnmonth2==12)
								{
									
								}
								else
								{
									System.out.println("Month Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Original RenturnYear :   ");
								int returnyear2=Integer.parseInt(keyboard.nextLine()) ;
					
								if(estimatedReturnYear3<2019)
								{
									System.out.println("Year Should not be less than 2019 as it is the current year ");
								}
						       	
						       	
						       	DateTime returnDatee= new DateTime(returnday2,returnmonth2,returnyear2);
						       	
						       	
						       	for(int i=0;i<lodge.getCityLodgeSuite().size();i++)
								{
									if(roomID311.equals(lodge.getCityLodgeSuite().get(i).getroomid()) )
									{
										lodge.getCityLodgeSuite().get(i).returnRoom( returnDatee,estimatedReturnDate );
										
									}
								}
								
								
								
					
								
							} catch(NumberFormatException e)
							{
								System.out.println("Sorry Your Input Is Valid.Please Try Again!");
								keyboard.nextLine();
							}
							
				        	}
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Sorry Yoour Input Is Not Valid. Please Insert a number Between 1 or 2");
		        	}
		        	
		        	}catch(InputMismatchException e)
		        	
		        	{
		        		System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1 or 2 ");
						
						keyboard.nextLine();
		        	}
		        	
		        	
		         break;  
		         
		         //Perform Room Maintenance
		         
		        case 4:
		        	
		        	try 
		        	{
		        	System.out.println("Please Press 1 for Standard Room or Press 2 for Suite: ");
		        	int roomtype1=keyboard.nextInt();
		        	keyboard.nextLine();
		        	
		        	if(roomtype1==1)
		        	{
					try
					{
						
						System.out.println("Enter RoomID Which Starts With 'R':  ");
						String roomID311= keyboard.nextLine();
						
						if(roomID311.charAt(0)!='R')
						{
							System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
							break;
						}
						
						for(int i=0;i<lodge.getCityLodgeStandardRoom().size();i++)
						{
							if(roomID311.equals(lodge.getCityLodgeStandardRoom().get(i).getroomid()) )
							{
								lodge.getCityLodgeStandardRoom().get(i). performMaintenance(roomID311);
								
							}
							else
							{
								System.out.println("Sorry! You have given an invalid Standard Room ID. Please Try Again");
							}
						}
									
						
					} catch(NumberFormatException e)
					{
						System.out.println("Sorry Your Input Is Valid.Please Try Again!");
						keyboard.nextLine();
					}
					
		        	}
		        	
		        	else if(roomtype1==2)
		        	{
		        		{
							try
							{
								
								System.out.println("Enter RoomID Which Starts With 'S':  ");
								String roomID311= keyboard.nextLine();
								
								if(roomID311.charAt(0)!='S')
								{
									System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'S' At First  ");
									break;
								}
								
								for(int i=0;i<lodge.getCityLodgeSuite().size();i++)
								{
									if(roomID311.equals(lodge.getCityLodgeSuite().get(i).getroomid()) )
									{
										lodge.getCityLodgeSuite().get(i). performMaintenance(roomID311);
										
									}
									else
									{
										System.out.println("Sorry! You have given an invalid Suite ID. Please Try Again");
									}
								}
								
								
															
							} catch(NumberFormatException e)
							{
								System.out.println("Sorry Your Input Is Valid.Please Try Again!");
								keyboard.nextLine();
							}
							
				        	}
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Sorry Your Input Is Not Valid. Please Insert a number Between 1 or 2");
		        	}
		        	
		        	}catch(InputMismatchException e)
		        	
		        	{
		        		System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1 or 2 ");
						
						keyboard.nextLine();
		        	}
		        
		        	break;
		        	
		        	  //Complete Room Maintenance  
		        case 5:
		        	try 
		        	{
		        	System.out.println("Please Press 1 for Standard Room or Press 2 for Suite: ");
		        	int roomtype1=keyboard.nextInt();
		        	keyboard.nextLine();
		        	
		        	if(roomtype1==1)
		        	{
					try
					{
						
						System.out.println("Enter RoomID Which Starts With 'R':  ");
						String roomID311= keyboard.nextLine();
						
						if(roomID311.charAt(0)!='R')
						{
							System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'R' At First  ");
							break;
						}
						
						
						for(int i=0;i<lodge.getCityLodgeStandardRoom().size();i++)
						{
							if(roomID311.equals(lodge.getCityLodgeStandardRoom().get(i).getroomid()) )
							{
								lodge.getCityLodgeStandardRoom().get(i). completeMaintenace(roomID311);
								
							}
							else
							{
								System.out.println("Sorry! You have given an invalid Standard Room ID. Please Try Again");
							}
						}
				       						
					} catch(NumberFormatException e)
					{
						System.out.println("Sorry Your Input Is Valid.Please Try Again!");
						keyboard.nextLine();
					}
					
		        	}
		        	
		        	else if(roomtype1==2)
		        	{
		        		{
							try
							{
								
								System.out.println("Enter RoomID Which Starts With 'S':  ");
								String roomID311= keyboard.nextLine();
								
								if(roomID311.charAt(0)!='S')
								{
									System.out.println("Sorry Your Standard RooM ID is Not Valid. Please Insert 'S' At First  ");
									break;
								}
								
								System.out.println("Enter Estimated ReturnDate(dd/mm/yy) :   ");
								
								System.out.println("Enter Day for completing Mantainance :   ");
								int estimatedReturnDay3=Integer.parseInt(keyboard.nextLine());
								
								if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==5||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12||estimatedReturnDay3==13||estimatedReturnDay3==14||estimatedReturnDay3==15||estimatedReturnDay3==16||estimatedReturnDay3==17||estimatedReturnDay3==18||estimatedReturnDay3==19||estimatedReturnDay3==20||estimatedReturnDay3==21||estimatedReturnDay3==22||estimatedReturnDay3==23||estimatedReturnDay3==24||estimatedReturnDay3==25||estimatedReturnDay3==26||estimatedReturnDay3==27||estimatedReturnDay3==28||estimatedReturnDay3==29||estimatedReturnDay3==30||estimatedReturnDay3==31)
								{
									
								}
								
								else
								{
									System.out.println("Day Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Month for completing Mantainance :   ");
								int estimatedReturnMonth3=Integer.parseInt(keyboard.nextLine());
								
								if(estimatedReturnDay3==1||estimatedReturnDay3==2||estimatedReturnDay3==3||estimatedReturnDay3==4||estimatedReturnDay3==4||estimatedReturnDay3==6||estimatedReturnDay3==7||estimatedReturnDay3==8||estimatedReturnDay3==9||estimatedReturnDay3==10||estimatedReturnDay3==11||estimatedReturnDay3==12)
								{
									
								}
								else
								{
									System.out.println("Month Should be Between 1 tp 31");
								}
								
								System.out.println("Enter Year for completing Mantainance :   ");
								int estimatedReturnYear3=Integer.parseInt(keyboard.nextLine()) ;
					
								if(estimatedReturnYear3<2019)
								{
									System.out.println("Year Should not be less than 2019 as it is the current year ");
								}
								
								DateTime completeMaintance5= new DateTime(estimatedReturnDay3,estimatedReturnMonth3,estimatedReturnYear3);
								for(int i=0;i<lodge.getCityLodgeSuite().size();i++)
								{
									if(roomID311.equals(lodge.getCityLodgeSuite().get(i).getroomid()) )
									{
										lodge.getCityLodgeSuite().get(i). completeMaintenace(roomID311,completeMaintance5);
										
									}
									else
									{
										System.out.println("Sorry! You have given an invalid Suite ID. Please Try Again");
									}
								}
									
								
							} catch(NumberFormatException e)
							{
								System.out.println("Sorry Your Input Is Valid.Please Try Again!");
								keyboard.nextLine();
							}
							
				        	}
		        	}
		        	
		        	else
		        	{
		        		System.out.println("Sorry Yoour Input Is Not Valid. Please Insert a number Between 1 or 2");
		        	}
		        	
		        	}catch(InputMismatchException e)
		        	
		        	{
		        		System.out.println("Sorry You Have Pressed Letter Which is Not A Valid Input. Please  Enter A Valid Integer between 1 or 2 ");
						
						keyboard.nextLine();
		        	}
		        	
		        	break;
		        	
		        	//Record of Rent
		        	
		        case 6:
		        	
		        	lodge.getCityLodgeHiringRecord();
		        	
		            break;
		            
		        default:
		            System.out.println("Please enter option between 1-7.");
		            
		           break;
		      }
				
				
				}while (j != 7);
				
				//Program Exit
				System.out.println("Pragramme Has Terminated. Thank You For Coming CityLodge!! \n");
		
	
	}
	
//Method for adding Standard Room
	public void addRoom(StandardRoom s)
	
	{
		CityLodgeStandardRoom.add(s);
		
	}
	
	//Method for adding Suite
	public void addRoom(Suite su)
	
	{
		CityLodgeSuite.add(su);
	}
	
	//Method for Showing Standard Room
	
	public void showStandardRoom()
	{
		System.out.print("Standard Rooms Are: ");
		System.out.println();
		for(int i=0;i< CityLodgeStandardRoom.size();i++)
		{
			System.out.println(" Id :"+CityLodgeStandardRoom.get(i).getroomid()+  " NumberofBedRooms: "+CityLodgeStandardRoom.get(i).getNumbofbedrooms()+" Feature: "+CityLodgeStandardRoom.get(i).getfeature()+" RoomType: " +CityLodgeStandardRoom.get(i).roomtype()+"RoomStatus: "+CityLodgeStandardRoom.get(i).getroomstatus()+" NumberOfDays: "+CityLodgeStandardRoom.get(i).getnumbofrentdays()+"RentalRate: "+CityLodgeStandardRoom.get(i).getrentalrates());
		}
		
	}
	
	//Method for Showing Suite
	
	public void showSuite()
	{
		System.out.print("Suites Are: ");
		System.out.println();
		for(int i=0;i< CityLodgeSuite.size();i++)
		{
			System.out.println(" Id :"+CityLodgeSuite.get(i).getroomid()+  " NumberofBedRooms: "+CityLodgeSuite.get(i).getNumbofbedrooms()+" Feature: "+CityLodgeSuite.get(i).getfeature()+" RoomType: " +CityLodgeSuite.get(i).roomtype()+"RoomStatus: "+CityLodgeSuite.get(i).getroomstatus()+" NumberOfDays: "+CityLodgeSuite.get(i).getrentdays()+"RentalRate: "+CityLodgeSuite.get(i).getrent());
		}
	}

	

}



