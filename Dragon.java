
package dragongame;

import java.util.Random;

public class Dragon {
    
    Tower eTower = new Tower();
    
    int level=1;
    int Healthpoint=100;
    int Attackpoint=7;
    int CritChance=20;//20% chance
    double CritAmount=1.5;
    int CritDamage=(int)(Attackpoint*CritAmount);
    int Accuracy=80;
    int Wall=100;
    
    /*public void DragonDisplay(){
        System.out.println("A dragon performs a sudden attacks to your city");
        System.out.println("Dragon's level: " +level);
        System.out.println("Dragon's Healthpoint: " +Healthpoint);
        System.out.println("Dragon's Attackpoint: " +Attackpoint);
        System.out.println("Dragon's Critical Chance: " +CritChance+"%");
        System.out.println("Dragon's Accuracy: " +Accuracy+"%");
    }*/
            
    public void Dragonupgrade(){
        
        this.Wall = Wall;
        this.Healthpoint=Healthpoint;
        
        System.out.println("Dragon stats ");
        System.out.println("level: "+level);
        System.out.println("Healthpoint: "+Healthpoint);
        System.out.println("Attackpoint: "+Attackpoint);
       
            level+=1;
            Healthpoint+=15;
            Attackpoint+=1;
            CritChance+=2;
        

    }  
    
    //Determine the Damage by the Dragon
    public static int doDamage(int Attackpoint, int CritChance, double CritAmount, int CritDamage, int Accuracy){
        int DamageDone=0;
        Random r = new Random();
        int randNum = r.nextInt(((100-1)+1)+1);
        
        if(randNum>=Accuracy){
            System.out.println("MISSED");
        }else{
           if(randNum<=CritChance){
            DamageDone= CritDamage;
            System.out.println("CRITICAL DAMAGE!");
               System.out.println("Dragon Damage: "+DamageDone);
        }else{
            DamageDone=Attackpoint;
        } 
        }
        
        return DamageDone;
    }

   //Damage to Wall Healthpoint
    public void DragoneDamage(){
        int count=1;
        
    for(int i=0; i<10;i++){
            
        System.out.println("Dragon is attacking the city for the "+count+" times");
        System.out.println("Wall Healthpoint: "+Wall);
        System.out.println("Dragon Damage: "+Attackpoint);
        int Damage = doDamage(Attackpoint, CritChance, CritAmount, CritDamage, Accuracy);
        Wall -= Damage;
        count++;
        System.out.println("");
        eTower.TowerDamage();
    }
    System.out.println("Wall Healthpoint: "+Wall);
}

}