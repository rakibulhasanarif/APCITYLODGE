package CityLodgeFinal;

import java.util.ArrayList;

//Abstract Class
public abstract class Room {
	
	//Declaring Variables
	
	private final int MAX_RECORD_SIZE = 10;
	private  String  roomid;
	private int numbofbedrooms;
	private String feature;
	private String roomtype;
	private String roomstatus;
	private HiringRecord[] records = new HiringRecord[MAX_RECORD_SIZE];
	private ArrayList<HiringRecord> CityLodgeHiringRecord= new ArrayList<HiringRecord>();
	
	//Constructor
	
	public Room(String roomid,int numbofbedrooms,String feature,String roomtype,String roomstatus)
	{
		this.roomid=roomid;
		this.numbofbedrooms=numbofbedrooms;
		this.feature=feature;
		this.roomtype=roomtype;
		this.roomstatus=roomstatus;
		
	}
	
	//Getter & Setter Method
	public String getroomid()
	
	{
		return roomid;
	}
	
	public void setroomid(String roomid)
	
	{
		this.roomid=roomid;
	}
	
	
	public String getfeature()
	
	{
		return feature;
	}
	
	public void setfeature(String feature)
	
	{
		this.feature=feature;
	}
	
	public String roomtype()
	
	{
		return roomtype;
	}
	
	public void setroomtype(String roomtype)
	
	{
		this.roomtype=roomtype;
	}
	
	public  String getroomstatus()
	
	{
		
		return roomstatus;
	}
	
	public void setroomstatus(String roomstatus)
	
	{
		
		this.roomstatus=roomstatus;
		
	}
	
	public int getNumbofbedrooms()
	
	{
		return numbofbedrooms;
	}
	
	public void setNumbofbedrooms(int numbofbedrooms) 
	
	{
		this.numbofbedrooms = numbofbedrooms;
	}
	
	public HiringRecord[] getRecords() 
	
	{
		return records;
	}
	
	public void setRecords(HiringRecord[] records)
	
	{
		this.records = records;
	}
	
	public ArrayList<HiringRecord> getCityLodgeHiringRecord() 
	
	{
		return CityLodgeHiringRecord;
	}
	
	public void setCityLodgeHiringRecord(ArrayList<HiringRecord> cityLodgeHiringRecord) 
	
	{
		CityLodgeHiringRecord = cityLodgeHiringRecord;
	}
	//Method For Passing Hiring Record into Hiring Record Class
	
	public void addHiringRecord(HiringRecord h)
	
	{
		CityLodgeHiringRecord.add(h);
	}
	
	// Abstract Methods 
	
	public abstract boolean rent(String CustomerId,DateTime rentDate,int numofRentDay);
	public abstract boolean returnRoom(DateTime renturnDate,DateTime estimatedReturnDate);
	public abstract boolean performMaintenance(String roomid);
	public abstract boolean completeMaintenace(String roomid,DateTime completeMaintance5);
	public abstract boolean completeMaintenace(String roomid);
	
	
	
	
	
	
}
