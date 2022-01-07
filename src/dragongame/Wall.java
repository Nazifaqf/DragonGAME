
package dragongame;
import java.util.Random;
import java.util.Scanner;

//extends from class where year,season,gold data is stored to be used for other classes.
public class Wall {
    int wall;
    int blockpercentage;

    public static void main(String[] args) {
        int wallhp;
        int totalwallhp;
        int blockpercentage;
        String kingname;
        totalwallhp = 100;
        wallhp = 100;
        blockpercentage = 10;
        kingname = "Tester";
        Scanner scan = new Scanner(System.in);
        
        //Check healthpoint remaining
        System.out.println("Wall healthpoint is " + wallhp);
        
        if(wallhp == 100)
            System.out.println("Wall is still sturdy.");
        else if(wallhp> 49 && wallhp< 100)
            System.out.println("Wall has suffered some damage but is still sturdy.");
        else if(wallhp> 0 && wallhp< 50){
            System.out.println("Wall has suffered too much damage.");
            System.out.println("We need to repair it, King " + kingname);
        }
        
        //Upgrade the walls or smokescreen
        //smokescreen is smoke that blocks the dragon view thus increasing blockpercentage
        System.out.println("*Master Carpenter appears*");
        System.out.println("Do you want to upgrade our defence, King " + kingname+" (yes/no)");
        System.out.println("Enter command: ");
        String orders;
        while( !(orders = scan.nextLine()).equalsIgnoreCase("no") ) {
        if(orders.equalsIgnoreCase("yes")) {
            //Do your logic for yes
            System.out.println("Alright, King " + kingname);
            System.out.println("Choose which upgrades you want to, my liege.");
            System.out.println("------------------------------------------------------");
            System.out.println("Wall Health : Increases max wall health by 10");
            System.out.println("Smokescreen : Increases miss percentage by 2");
            System.out.println("Repair      : Restore 20 health to tower");
            System.out.println("Back");
            System.out.println("------------------------------------------------------");
            System.out.println("Enter command :");
            while( !(orders = scan.nextLine()).equalsIgnoreCase("back") ) {
                if(orders.equalsIgnoreCase("Wall Health")) {
                    //If upgrade wall health
                    System.out.println("As you wish, King " + kingname);
                    totalwallhp =+ 10;
                    System.out.println("Max wall health : " + totalwallhp);
                    System.out.println("Do you want to upgrade more? (Enter command)");
                    
                }if(orders.equalsIgnoreCase("Smokescreen")) {
                    //If smokescreen
                    System.out.println("I will tell the man to increase the smoke, King " + kingname);
                    blockpercentage =+ 2;
                    System.out.println("Total miss percentage : " + blockpercentage);
                    System.out.println("Do you want to upgrade more? (Enter command)");

                }if(orders.equalsIgnoreCase("repair")) {
                    //If repair
                    System.out.println("I will tell the mans to repair the walls");
                    wallhp =+ 20;
                    System.out.println("Current wall health : " + wallhp);
                    System.out.println("Do you want to upgrade more? (Enter command)");

                }if(orders.equalsIgnoreCase("back")) {
                    //If back is chosen
                    System.out.println("As you say milord.");
                    System.out.println("*Master Carpenter leaves the hall*");
                    //stuck here on how to stop process;
//Problem on stopping 'else' command appearing after every command
                }else {
            System.out.println("\nWarning: You need to enter a given command!!");
        }
    }

        } else {
            System.out.println("\nWarning: You need to enter Yes or No!!. Do you want to enter another item? (Yes/No)");
        }
    }
    // Print the results for no
    System.out.println("As you say milord.");
    System.out.println("*Master Carpenter leaves the hall*");   
    
    }    
}
