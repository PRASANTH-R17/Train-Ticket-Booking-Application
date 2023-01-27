/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.util.*;

public class Main
{                                                           //Available Ticket --> print only available ticket counts
                                                            //Booked Ticket --> Ticket Booked Passenger Details Passenger ID,Name,age,confirm Birth
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int passengerID=1;
		while(true){
		    System.out.println("1. Booking Ticket \n2. Cancel Ticket \n3. Available Tickets \n4. Booked Ticket");
	        int Option=sc.nextInt();
	        switch(Option){
	            
	            case 1:{
	         
	                System.out.println("Enter Passenger name,age and berth preference (L,M or U)");
	                String name=sc.next();
	                int age=sc.nextInt();
	                String berth_preference=sc.next();
	                
	                //System.out.println(name);   // For Testing Purpose
	                //System.out.println(age);
	                //System.out.println(berth_preference);

	                if( (Booking.availableLowerBerths==0) && (Booking.availableMiddleBerths==0) && (Booking.availableUpperBerths==0) && (Booking.availableRacTickets==0) && (Booking.availableWatingList==0) )
	                {
	                    System.out.println("----------- Ticket Not Available");
	                    break;
	                    
	                }
	                
	                System.out.println("----------- PassengerID "+passengerID+"  Booking Status "+ Booking.bookingStart(passengerID,name,age,berth_preference) );
	                
	                passengerID++;
	                
	                break;
	                
	                
	            }//case 1
	            
	            case 2:{
	                System.out.println("Enter passenger Id to cancel");
	                int cancelID=sc.nextInt();
	                String AllocatedSeat=Booking.allotedBerths.get(Booking.PassengerIDs.indexOf(cancelID));
	                Booking.cancelTicket(cancelID,AllocatedSeat);
	                break;
	                
	            }
	            
	            case 3:{ //Available Tickets
	                Booking.printAvailable();
	                break;
	            }
	            
	            case 4:{
	                Booking.printPassengers();
	                break;
	            }
	            
	        }//switch
		    
		    
		    
		    
		}
	}
}
