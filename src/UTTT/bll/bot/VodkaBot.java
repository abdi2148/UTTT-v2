/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTTT.bll.bot;

/**
 *
 * @author PC
 */
public class VodkaBot extends CookieAds {
    private static final String BOTNAME="Vodka Bot";
    
    // This is the drunken bot, it's pretty bad
    public VodkaBot() {
        int[][] pref = {
            {0, 0}, {2, 2}, {0, 2}, {2, 0},  
            {0, 1}, {2, 1}, {1, 0}, {1, 2}, 
            {1, 1}}; //Center
        super.preferredMoves = pref;
    }

    @Override
    public String getBotName() {
        return BOTNAME; 
    }
    
    

}
