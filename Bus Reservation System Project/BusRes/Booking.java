package BusRes;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	Scanner sc= new Scanner(System.in);
	String passengername;
	int busno;
	Date date;
  
		Booking(String name,int no,String date){
			System.out.print("Enter the name of the passeneger: ");
			name=sc.next();
			System.out.print("Enter the busno:");
			no=sc.nextInt();
			System.out.print("Enter the date: dd-mm-yy");
			date=sc.next();
			SimpleDateFormat s= new SimpleDateFormat("dd-MM-yy");
			try {
				s.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		public boolean Available(ArrayList<Booking>book,ArrayList<Bus>buses) {
			int capacity=0;
			int confirmed=0;
		    for(Bus b:buses) {
		    	if(b.getbusno()==busno) {
		    		capacity=b.getCapacity();
		    		
		    		
		    		
		    	}for(Booking bo:book) {
		    		if(bo.busno==busno && bo.date.equals(date)) {
		    			confirmed++;
		    			
		    		}
		    		
		    	}
		    }
		    return confirmed<capacity?true:false;
		}
}
