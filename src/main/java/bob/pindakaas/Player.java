/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bob.pindakaas;

/**
 *
 * @author Bob
 */
public class Player 
{
    private String name;
    public int location;
    public int skipTurn;
    

    public Player(String name, int locatie)
    {
        this.name = name;
        this.location = location;
        this.skipTurn = skipTurn;
    }
     public String getName() {
        return name;
    }
     public int getLocation() {
         return location;
     }
     public void setLocation(int newLocation) {
         this.location = newLocation;
     }
    public void skippingTurn() {
        skipTurn++;
    }
     
     
}
