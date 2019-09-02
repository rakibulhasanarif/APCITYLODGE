package CityLodgeFinal;

public class HiringRecord {

	//Variable Declaration 
	
private String recordid;
private String customerId;
private String rentdate;
private String estimatedreturndate;
private String actualreturndate;
private double rentalfee;
private double latefee;

//Constructor

public HiringRecord(String recordid,String customerId,String rentdate,String estimatedreturndate,String actualreturndate,double rentalfee,double latefee)

{
	this.recordid=recordid;
	this.customerId=customerId;
	this.rentdate=rentdate;
	this.estimatedreturndate=estimatedreturndate;
	this.actualreturndate=actualreturndate;
	this.rentalfee=rentalfee;
	this.latefee=latefee;
} 

//Getter & Setter Method 

public String getrecordid()

{
	return recordid;
}

public void setrecordid(String recordid)

{
	this.recordid=recordid;
}

public String getcustomerId()

{
	return customerId;
}

public void setcustomerId(String customerId)

{
	this.customerId=customerId;
}

public String getrentdate()

{
	return rentdate;
}

public void setrentdate(String rentdate)

{
	this.rentdate=rentdate;
}

public String estimatedreturndate()

{
	return estimatedreturndate;
}

public void setestimatedreturndate(String estimatedreturndate)

{
	this.estimatedreturndate=estimatedreturndate;
}

public String getactualreturndate()

{
	return actualreturndate;
}

public void setactualreturndate(String actualreturndate)

{
	this.actualreturndate=actualreturndate;
}

public double getrentalfee()

{
	return rentalfee;
}

public void setrentaldate(double rentalfee)

{
	this.rentalfee=rentalfee;
}

public double latefee()

{
	return latefee;
}

public void setlatefee(double rentalfee)

{
	this.rentalfee=rentalfee;
}

//Method for Getting Room Details

public String[] getDetails()

{
	if(recordid!=null )
		
	{
		if(actualreturndate != null )
			{
		String[] fg=new String[6];
		fg[0]=recordid;
		fg[1]=customerId;
		fg[2]=rentdate;
		fg[3]=actualreturndate;
		fg[4]=Double.toString(rentalfee);
		fg[5]=Double.toString(latefee);
		
		return fg;
			}
			
		else
			{
			String[] fg=new String[4];
			fg[0]=recordid;
			fg[1]=customerId;
			fg[2]=rentdate;
			fg[3]=estimatedreturndate;
			return fg;
			}
			
	}
	
	return null;
	
	
}

@Override
public String toString()

{
	
if(recordid!=null )
		
	{
		if(actualreturndate != null )
			{
			 return String.format("%s:%s:%s:%s:%d:%d",recordid,customerId,rentdate,actualreturndate,rentalfee,latefee);
			}
		else
		{
			return String.format("%s:%s:%s:none:none:none",recordid,customerId,rentdate,estimatedreturndate,rentalfee,latefee);
		}
	}
		
	return actualreturndate;
	
}
}

