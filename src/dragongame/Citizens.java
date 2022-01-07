
package dragongame;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Citizens {

    public static int getRandomElement(int[] arr){
    return arr[ThreadLocalRandom.current().nextInt(arr.length)];
    }
    public static void main(String[] args) {
        Random r = new Random();
        //gold
        int T_gold=0;

        int[] gold = new int[] {200,250,300,350,400,450};
        int randNum = getRandomElement(gold);
        System.out.println(randNum);
        T_gold = T_gold + randNum ;
        System.out.println("Gold : "+ T_gold);
        
        
        //citizens emotion
        int emo = 10, nervous = 10, lazy = 10, berserk = 60, diligent = 60, fearless = 60;
        String str1="emotional", str2="nervous", str3="lazy", str4="berserk", str5="diligent", str6="fearless";
        String str7 = "menu";
        
        //tower
        int AP=5, accuracyPercentage=80, CCP=10;
        
        //wall
        int HP=100, blockPercentage=10;
        
        
        System.out.println("Citizen's Emotional (Decrease Tower's AttackPoint by 1) : "+ emo);
        System.out.println("Citizen's Nervous (Decrease Tower Accuray Percentage by 5%) : "+ nervous);
        System.out.println("Citizen's Lazy (Decrease Wall's HealthPoint by 100) : "+lazy);
        System.out.println("Citizen's Berserk (Increase Tower's AttackPoint by 1) : "+berserk);
        System.out.println("Citizen's Diligent (Increase Wall's HealthPoint by 75) : "+diligent);
        System.out.println("Citizen's Fearless (Increase Tower Critical Chance Percentage by 5%) : "+fearless);
        
        System.out.println("1. Decrease Emotional (50 Gold -> 50 Emotional Point");
        System.out.println("2. Decrease Nervous (50 Gold -> 50 Nervous Point");
        System.out.println("3. Decrease Lazy (50 Gold -> 50 Lazy Point");
        System.out.println("4. Increase Berserk (50 Gold -> 50 Berserk Point");
        System.out.println("5. Increase Diligent (50 Gold -> 50 Diligent Point");
        System.out.println("6. Increase Fearless (50 Gold -> 50 Fearless Point");
        System.out.println("7. Back to menu");
        System.out.println("Please enter your command:");
        
        Scanner sc = new Scanner(System.in);
        for(int i=0;  ;i++){
        System.out.println("\nUpgrade your citizens emotion points");
        System.out.println("Enter emotions and how many golds you want to spend");
            for(int j=0; j<6;j++){
        String searchEmo = sc.next();
        int spend_gold = sc.nextInt();
        
        if(searchEmo.equalsIgnoreCase(str7)){
          break;     
        }
        else if(searchEmo.equalsIgnoreCase(str1)){
            emo -= spend_gold;  
            if(emo>=100){
                emo=emo-100;
                System.out.println("Decrease Tower’s AttackPoint by 1");
            }
        }
        else if(searchEmo.equalsIgnoreCase(str2)){
            nervous -= spend_gold; 
            if(nervous>=100){
                nervous=nervous-100;
                System.out.println("Decrease Tower Accuracy Percentage by 5%");
            }
        }
        else if(searchEmo.equalsIgnoreCase(str3)){
            lazy -= spend_gold; 
            if(lazy>=100){
                lazy=lazy-100;
                System.out.println("Decrease Wall’s HealthPoint by 100");
            }
        }
        else if(searchEmo.equalsIgnoreCase(str4)){
            berserk += spend_gold; 
            if(berserk>=100){
                berserk=berserk-100;
                System.out.println("Increase Tower’s AttackPoint by 1");
            }
        }
        else if(searchEmo.equalsIgnoreCase(str5)){
            diligent += spend_gold; 
            if(diligent>=100){
                diligent=diligent-100;
                System.out.println("Increase Wall’s HealthPoint by 75");
            }
        }
        else if(searchEmo.equalsIgnoreCase(str6)){
            fearless += spend_gold;
            if(fearless>=100){
                fearless=fearless-100;
                System.out.println("Increase Tower Critical Chance Percentage by 5%");
            }
        }
        
        }
        
        System.out.println("Citizen's Emotional (Decrease Tower's AttackPoint by 1) : "+ emo);
        System.out.println("Citizen's Nervous (Decrease Tower Accuray Percentage by 5%) : "+ nervous);
        System.out.println("Citizen's Lazy (Decrease Wall's HealthPoint by 100) : "+lazy);
        System.out.println("Citizen's Berserk (Increase Tower's AttackPoint by 1) : "+berserk);
        System.out.println("Citizen's Diligent (Increase Wall's HealthPoint by 75) : "+diligent);
        System.out.println("Citizen's Fearless (Increase Tower Critical Chance Percentage by 5%) : "+fearless);
        
        System.out.println("1. Decrease Emotional (50 Gold -> 50 Emotional Point");
        System.out.println("2. Decrease Nervous (50 Gold -> 50 Nervous Point");
        System.out.println("3. Decrease Lazy (50 Gold -> 50 Lazy Point");
        System.out.println("4. Increase Berserk (50 Gold -> 50 Berserk Point");
        System.out.println("5. Increase Diligent (50 Gold -> 50 Diligent Point");
        System.out.println("6. Increase Fearless (50 Gold -> 50 Fearless Point");
        System.out.println("7. Back to menu");
        System.out.println("Please enter your command:");
        }

    }
}
