/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.pindakaas;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Bob
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);
     
        System.out.println("Hallo, wie is speler1?: ");
        String player1Name = input.next();
        Player player1 = new Player(player1Name, 0);
        System.out.println("en wie is speler2?: ");
        String player2Name = input.next();
        Player player2 = new Player(player2Name, 0);
        
        Player currentPlayer = player1;
     
        System.out.println(currentPlayer.getName() + ", jouw beurt." );
     System.out.println(" Je staat op start. Gooi je dobbelsteen (g):");
     String choice = input.next();
     int location = 0;
     
     
     while (choice.equals("g")){
         
         
      Random random = new Random();
      int upperbound=6;
      int throwDice=random.nextInt(upperbound);
       
      
      
      location = currentPlayer.getLocation();
      System.out.println("je gooide een " +throwDice + ".");
      location = location+throwDice;
      currentPlayer.setLocation(location);
      int lastThrow = throwDice;
      
              if (location > 63) {
                 int stepsBack = (location % 63);
                 location = 63-stepsBack;
                 currentPlayer.setLocation(location);
                  System.out.println("teveel! terug naar plekje... " +location);
        }
      
      System.out.println("je staat op vakje " +location );

        if ( location ==63) {
            System.out.println("je hebt het einde bereikt.");
            break;
        }
        
        else if (location == 23){
           System.out.println("Gevangenis, game over");
            break;
        }
        else if (location == 25 || location == 45)
        {
            location = 0;
        }
        if (location == 6 ){
            location = 12;
            currentPlayer.setLocation(location);
            System.out.println("brug, je gaat verder naar vakje " +location);
        }
//        if (location == 19){
//            location = 19-throwDice;
//            currentPlayer.setLocation(location);
//            System.out.println("Beurt overslaan, je blijft op vakje " +location);
//        }
        if (location == 42){
            location = 39;
            currentPlayer.setLocation(location);
            System.out.println("doolhof, terug naar " + location);
        }
        if (location == 58){
            location = 0;
            currentPlayer.setLocation(location);
            System.out.println("dood, je staat weer op " + location);
        }
        if (location == 52){
            System.out.println("drie beurten overslaan");
            
        }
        
        else if (location == 10 || location == 20 || location == 30 || location == 40 || location == 50 || location == 60 )
        {
            location = location+lastThrow;
            currentPlayer.setLocation(location);
            System.out.println("bonus! je staat nu op vakje " +location);
        }
                    if (player1.equals(currentPlayer))
            {
                currentPlayer = player2;

            }
            else
            {
                currentPlayer = player1;
            }
      System.out.println(currentPlayer.getName() + ", jouw beurt." );
      input.next();

     
      
                            }
        // TODO code application logic here
    }
    
}
