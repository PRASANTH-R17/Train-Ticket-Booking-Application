import java.util.ArrayList;

class Booking{
    
    static ArrayList<Integer> PassengerIDs = new ArrayList<Integer>(); //passenger id 
    static ArrayList<String> preferanceBerths=new ArrayList<String>();  //passenger prefered Berth
    static ArrayList<String> allotedBerths=new ArrayList<String>(); //passenger alloted Berth
    
    static int availableLowerBerths=1; // LowerBerthcount
    static int availableMiddleBerths=1;  // MiddleBerthCount
    static int availableUpperBerths=1;       // UpperBerthCount
    
    static ArrayList<Integer> berthpassengerid = new ArrayList<Integer>();  
    static ArrayList<String> confirmBerth = new ArrayList<String>();
    static ArrayList<String> berthpassengername = new ArrayList<String>();
    static ArrayList<Integer> berthpassengerage = new ArrayList<Integer>();
    
    
    
    static int availableRacTickets=2;
    static ArrayList<Integer> Racpassengerid=new ArrayList<Integer>();
    static ArrayList<String> Racpassengername=new ArrayList<String>();
    static ArrayList<Integer> Racpassengerage=new ArrayList<Integer>();
    
    static int availableWatingList=1;
    static ArrayList<Integer> WLpassengerid=new ArrayList<Integer>();
    static ArrayList<String> WLpassengername=new ArrayList<String>();
    static ArrayList<Integer> WLpassengerage=new ArrayList<Integer>();
    
    public static String bookingStart(int passengerId,String name,int age, String berth_preference){
        String curentstatus="";
        
        if(berth_preference.equals("L") ){ //LowerBerth Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("L");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("L");
            berthpassengername.add(name);
            berthpassengerage.add(age);

            availableLowerBerths--;
            curentstatus="L";
            System.out.println("check 01");
        }
            
            
            
        else if(berth_preference.equals("M") && availableMiddleBerths!=0){ //MiddleBerth Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("M");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("M");
            berthpassengername.add(name);
            berthpassengerage.add(age);

            availableMiddleBerths--;
            curentstatus="M";}
            
        else if(berth_preference.equals("U") && availableUpperBerths!=0 ){ //UpperBerth Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("U");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("U");
            berthpassengername.add(name);
            berthpassengerage.add(age);
            
            availableUpperBerths--;
            curentstatus="U";}
            
        else if(availableLowerBerths>0){ // Available LowerBerth Booking
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("L");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("L");
            berthpassengername.add(name);
            berthpassengerage.add(age);

            availableLowerBerths--;
            curentstatus="L";
            System.out.println("check 02");
        }
        
        
        else if(availableUpperBerths>0){ // Available MiddleBerth Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("M");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("M");
            berthpassengername.add(name);
            berthpassengerage.add(age);

            availableMiddleBerths--;
            curentstatus="M";}
            
        else if(availableUpperBerths>0){ //Available UpperBerth Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("U");
            
            berthpassengerid.add(passengerId);
            confirmBerth.add("U");
            berthpassengername.add(name);
            berthpassengerage.add(age);
            
            availableUpperBerths--;
            curentstatus="U";}
            
        else if(availableRacTickets>0){ // RAC Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("RAC");
            
            Racpassengerid.add(passengerId);
            Racpassengername.add(name);
            Racpassengerage.add(age);

            availableRacTickets--;
            curentstatus="RAC";}
            
        else if(availableWatingList>0){ // RAC Booking
        
            PassengerIDs.add(passengerId);
            preferanceBerths.add(berth_preference);
            allotedBerths.add("WL");
            
            WLpassengerid.add(passengerId);
            WLpassengername.add(name);
            WLpassengerage.add(age);

            availableWatingList--;
            curentstatus="WL";}
            
        return curentstatus;
    }
    
    public static void printAvailable(){ // print count of berth in lower,middle,upper,RACs,WL
        System.out.println("Available LoweBerths : "+availableLowerBerths);
        System.out.println("Available MiddleBerths : "+availableMiddleBerths);
        System.out.println("Available UpperBerths : "+availableUpperBerths);
        System.out.println("Available RACs : "+availableRacTickets);
        System.out.println("Available Waiting List : "+availableWatingList);}
        
    public static void printPassengers(){
        System.out.println("---------- Berth passenger Details---------- ");
        for(int i=0;i<berthpassengerid.size();i++){ // print berth Passenger Details
            System.out.println("PassengerID : "+berthpassengerid.get(i));
            System.out.println("Name : "+berthpassengername.get(i));
            System.out.println("Age : "+berthpassengerage.get(i));
            System.out.println("Berth : "+confirmBerth.get(i));
            System.out.println();}
        
        if(Racpassengerid.size()==0) //if RAC ==0 stop execute
            return;
            
        System.out.println("----------RACs Passenger Details----------");
        for(int i=0;i<Racpassengerid.size();i++){
            System.out.println("PassengerID : "+Racpassengerid.get(i));
            System.out.println("Name : "+Racpassengerid.get(i));
            System.out.println("Age : "+Racpassengerid.get(i));
            System.out.println("Berth : RAC");
            System.out.println();}
        
        if(WLpassengerid.size()==0) ////if WL ==0 stop execute
            return;    
            
        System.out.println("---------- WL Passenger Details ----------");
        for(int i=0;i<WLpassengerid.size();i++){
            System.out.println("PassengerID : "+WLpassengerid.get(i));
            System.out.println("Name : "+WLpassengerid.get(i));
            System.out.println("Age : "+WLpassengerage.get(i));
            System.out.println("Berth : WL");
            System.out.println();
            
        }
 
    }
            
            
}
    


