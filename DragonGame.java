
package dragongame;

import java.util.Random;
import java.util.Scanner;

public class DragonGame {

    public static void main(String[] args) {
         // TODO code application logic here
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    int Initialgold= 200;
    int gold=0;
    
    Dragon eDragon = new Dragon();
    Tower eTower = new Tower();
    for(int year=1; year>0; year++){ 
        System.out.println("");
        System.out.println("Year: "+ year);
    for(int season=0;season<=3;season++){
        switch(season){
            case 0:
                System.out.println("season: Spring");
                break;
            case 1:
                System.out.println("season: Summer");
                break;
            case 2:
                System.out.println("season: Autumn");
                break;
            case 3:
                System.out.println("season: winter");
                break;
        }
        int tax = rand.nextInt(4);
       switch(tax){
           case 0:
               gold = 200;
               break;
           case 1:
               gold = 250;
               break;
           case 2:
               gold = 300;
               break;
           case 3:
               gold = 350;
               break;
           case 4:
               gold = 400;
               break;
       }
        
        //eDragon.Wall=100;
        //eDragon.Dragonupgrade();
       
        System.out.println("Tax received from citizens this season: "+ gold);
        Initialgold = Initialgold + gold;
        System.out.println("gold: "+ Initialgold + "\n");
        eDragon.DragoneDamage();
        for(int fight=1; fight<11; fight++){
            System.out.print(fight + " Fight the dragon!!! press any key to continue...");
            //eTower.TowerDamage();
            String name= s.nextLine();
        }
        System.out.println("\n");
    }
    }   

 
        
        
          
    }
    
}
