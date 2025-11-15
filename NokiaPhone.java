import java.util.Scanner;
public class PhoneApp{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

int menu;

System.out.println(" main menu ");
System.out.println(" 1 Phone book ");
System.out.println(" 2 Message ");
System.out.println(" 3 Chat ");
System.out.println(" 4 Call register ");
System.out.println(" 5 Tones");
System.out.println(" 6 Settings");
System.out.println(" 7 call divert");
System.out.println(" 8 Games ");
System.out.println(" 9 Calculators ");
System.out.println(" 10 Reminders ");
System.out.println(" 11 clock");
System.out.println(" 12 Profiles");
System.out.println(" 13 SIM services ");
System.out.println(" 0 Exist ");
System.out.println(".............................................");
System.out.print(" Enter number : ");

menu = input.nextInt();
switch (menu){
    case 1: 

        System.out.println("phonebok ; ");
        System.out.println(" 1 search ");
        System.out.println(" 2 Service Nos, ");
        System.out.println(" 3 Add name ");
        System.out.println(" 4 Erase  ");
        System.out.println(" 5 Edit ");
        System.out.println(" 6 Assign tone ");
        System.out.println(" 7 Send b'card' ");
        System.out.println(" 8 Options ");
        System.out.println(" 9 Speed ");
        System.out.println(" 10 voice tags ");
        System.out.println(".............................................");
        System.out.println(" Enter number 8 for more Options :");


        int option = input.nextInt();
        switch (option){
        case 8:
            System.out.println(" 1 Type of view");
            System.out.println(" 2 Memory status ");
        break;

        default : System.out.println("Select one of the above option");
         } break;
            
        
    case 2:

        System.out.println(" Message ; ");
        System.out.println(" 1 Write messages ");
        System.out.println(" 2 Inbox ");
        System.out.println(" 3 Outbox ");
        System.out.println(" 4 Picture messages  ");
        System.out.println(" 5 Templates ");
        System.out.println(" 6 Smileys ");
        System.out.println(" 7 Message settings ");
        System.out.println(" 8 Info service ");
        System.out.println(" 9 Voice mailbox number ");
        System.out.println(" 10 Service command editor ");
        System.out.println(".............................................");
        System.out.print("Enter number 7 for more options in Message Settings: ");

      
       int messageSettings = input.nextInt();

        switch (messageSettings){
        case 7:
 
            System.out.println(" 1 Set 1");
            System.out.println(" 2 Common ");
        break;

        default : System.out.println(" Enter number 1 or 2 for more options : ");
        }

            int settingsMoreOptions = input.nextInt();



            switch (settingsMoreOptions){

            case 1: 
          
                System.out.println(" 1 Message centre number ");
                System.out.println(" 2 Message sent as ");
                System.out.println(" 3 Message settings "); 

                break;


            case 2: 
            
                System.out.println(" 1 Delivery report ");
                System.out.println(" 2 Reply via same centre ");
                System.out.println(" 3 Character support ");

            } break;
        
    case 3: System.out.println(" chat  ");

             break;
    case 4: 
        System.out.println("  Call register ");
        System.out.println(" 1 Missed calls ");
        System.out.println(" 2 Recieved calls");
        System.out.println(" 3 Dailled numbers ");
        System.out.println(" 4 Erased recent call lists ");
        System.out.println(" 5 Show call duration ");
        System.out.println(" 6 Show call cost ");
        System.out.println(" 7 Call cost settings ");
        System.out.println(" 8 Prepaid credit ");
        System.out.println(".............................................");
        System.out.println(" Enter number 5 or 6 or 7 for more option : ");
        


        int moreOptions = input.nextInt();

            switch (moreOptions){
                case 5:
                    System.out.println(" 1 Last call duration ");
                    System.out.println(" 2 All calls duration ");
                    System.out.println(" 3 Received calls duration ");
                    System.out.println(" 4 Dialled calls dueration ");
                    System.out.println(" 5 Clear timers ");

                     break;                

              
               case 6:
                    System.out.println(" 1 Last call cost ");
                    System.out.println(" 2 All calls cost ");
                    System.out.println(" 3 Clear coumters ");
                  
                     break;
                
                case 7:
                    System.out.println(" 1 Call cost settings ");
                    System.out.println(" 2 Show cost limit ");

                }

                break;
        
        
    case 5: 
        System.out.println("  Tones ");
        System.out.println(" 1 Ringing tone ");
        System.out.println(" 2 Ringing volume ");
        System.out.println(" 3 Incoming call alert");
        System.out.println(" 4 Composer ");
        System.out.println(" 5 Message alert tone ");
        System.out.println(" 6 Keypad tones ");
        System.out.println(" 7 Warming and game tones ");
        System.out.println(" 8 Vibrating alert");
        System.out.println(" 9 Screen saver ");

        
             break;

    case 6:

        System.out.println(" Settings ");
        System.out.println(" 1 Call settings ");
        System.out.println(" 2 Phone setting ");
        System.out.println(" 3 Security settings ");
        System.out.println(" 4 Restore factory settings ");
        System.out.println(".............................................");
        System.out.println(" Enter 1 or 2 or 3 or 4 for more options");

       int viewOption = input.nextInt();

            switch (viewOption){

            case 1:
            System.out.println(" 1 Automatic redial ");
            System.out.println(" 2 Speed dailing ");
            System.out.println(" 3 Call waiting options ");
            System.out.println(" 4 Own number sending ");
            System.out.println(" 5 Phone line in use ");
            System.out.println(" 6 Automatic answer ");

             break;            

            case 2:
            System.out.println(" 1 Language "); 
            System.out.println(" 2 Cell info display ");
            System.out.println(" 3 Welcome note ");
            System.out.println(" 4 Network selection ");
            System.out.println(" 5 Light ");
            System.out.println(" 6 Comfirm SIM service actions ");
            
            break;

            

            case 3:
            System.out.println(" 1 PIN code request ");
            System.out.println(" 2 Call barring service ");
            System.out.println(" 3 Fixed dailing ");
            System.out.println(" 4 Closed user group ");
            System.out.println(" 5 Phone security ");
            System.out.println(" 6 Change access codes ");

            
            }
            break;

     case 7: System.out.println(" Call divert  ");

            break;

     case 8: System.out.println(" Games  ");

            break;

     case 9: System.out.println(" Calculator  ");

            break;

     case 10: System.out.println(" Reminder  ");

            break;

     case 11: 
        
         System.out.println("  Clock ");
        System.out.println(" 1 Alarm clock ");
        System.out.println(" 2 Clock settings ");
        System.out.println(" 3 Date setting");
        System.out.println(" 4 Stopwatch ");
        System.out.println(" 5 Countdown timer ");
        System.out.println(" 6 Auto update of date and time ");

             break;

    case 12: System.out.println(" Profile ");
    
             break;

    case 13: System.out.println(" SIM service ");
    }


}
}








