
package dragongame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tower {
    
    double dragon_health = 100;

    public void TowerDamage() {
       Random rand = new Random();
        
    //ARCHER TOWER
       double damage = 5; //attack point
        //System.out.println(damage);
       //if upgrade, damage = damage + 1
       //season spring --> damage = damage+1(permanent)
       //citizen emotional --> damage = damage - 1 (permanent)
       //citizen berserk --> damage = damage + 1 (permanent)
       
       int crit_chance = 10; //critical chance percentage
       //Citizen fearless --> crit_percent = crit_percent + 5(permanent)
       
       double crit_percent = 150;
       double crit_damage = (crit_percent*damage)/100;
        //System.out.println(crit_damage);
        
       int acc_chance = 80; //accuracy percentage
        //System.out.println(acc_chance);
       //Season Autumn --> acc_chance = acc_chance - 20 (for the season)
       //Season Winter --> acc_chance = acc_chance - 20 (for the season)
       //Citizen Nervous --> acc_chance = acc_chance - 5 (permanent)
        
         int randomNum = rand.nextInt(100+1);
        //System.out.println(randomNum);
            
        //for(int i=1; i<=10; i++){
            //System.out.println("attack count: " + i);
            System.out.println("Tower Attack!");
            System.out.println("dragon health: " + dragon_health);
            double hit = tower_attack( damage, crit_chance, crit_percent, crit_damage,  acc_chance, dragon_health);
            dragon_health-=hit;
            System.out.println("Current Dragon's Healthpoint " + dragon_health);
            System.out.println();
        
        //}
 }
    
   
    
    public static double tower_attack(double damage, double crit_chance, double crit_percent, double crit_damage, double acc_chance, double dragon_health){
       double attack=0;
        Random rand = new Random();
       
       int random_acc = rand.nextInt(100+1);
       int random_crithit = rand.nextInt(100+1);
       if(random_acc<=acc_chance){
            //tower attack
            if (random_crithit<=crit_chance){
                //crtical hit to dragon
                System.out.println("Tower attacked dragon with critical attack!");
                System.out.println("Dragon HealthPoint minus " + crit_damage);
                attack = crit_damage;
            }
            else {
                System.out.println("Dragon HealthPoint minus " + damage);
                attack = damage;
            }
         
            
        }
       else {
           System.out.println("tower miss");
       }
   return attack;
    }
}
    
    

