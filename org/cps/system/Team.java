package org.cps.system;

/**
 *
 * @author alvin_000
 */
public class Team {
    
    private static int COUNT;
    
    private String teamName;
    private int score;
    
    
    /**
     * Constructor method for the class team.
     * @param name name of the team; must not exceed 30 characters
     */
    public Team(String name){
        
        this.teamName = name;       //Assign team neam
        this.score = 0;             //Initialize score to zero
        
        COUNT += 1;                 //Increment team count by 1
        
    }
    
    /**
     * 
     * @param points points earned or lost at a question
     */
    public void updateScore(int points){
    
        this.score += points;       //Increment or decrement score
        
    }
    
    /**
     * 
     * @return team assigned through the constructor
     */
    public String getTeamName(){
    
        return this.teamName;
        
    }
    
    /**
     * 
     * @return current accumulated score of the team
     */
    public int getCurrentScore(){
    
        return this.score;
    
    }
    
}
