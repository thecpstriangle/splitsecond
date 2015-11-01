package org.cps.system;

/**
 *
 * @author alvin_000
 */
public class Round {
    
    public final static int EASY = 0;
    public final static int MODERATE = 1;
    public final static int DIFFICULT = 2;
    public final static int TIE_BREAKER = 3;
    
    private String level;               //Level of difficulty
    private int questionCount;          //Number of questions in the round
    private long timeAllowed;           //Time allowed per question (milliseconds)
    
    private int maxCorrectPoints;       //Points to be incremeneted for correct answers in the first rank
    private int maxIncorrectPoints;     //Points to be decremented for incorrect answers in the first rank
    private int maxVoidPoints;          //Points to be decremented for void answers in the first rank
    private int stepBy;                 //Number of points to be in/decremented after the first rank
    
    /**
     * Constructor for the class Round. This class is the collection of the questions
     * and is classified only to four types or levels: easy; moderate; difficult; and
     * tie-breaker.
     * @param level Choose from Round.EASY, Round.MODERATE, Round.DIFFICULT, or
     * Round.TIE_BREAKER.
     */
    public Round(int level){
    
        switch(level){
        
            case 0: this.level = "Easy";
                break;
            case 1: this.level = "Moderate";
                break;
            case 2: this.level = "Difficult";
                break;
            case 3: this.level = "Tie-breaker";
                break;
            default: this.level = "Easy";
                break;
                
        }
        
    }

    /**
     * @param questionCount the questionCount to set
     */
    public void setQuestionCount(int questionCount) {
        
        this.questionCount = questionCount;
        
    }

    /**
     * @param timeAllowed the timeAllowed to set
     */
    public void setTimeAllowed(long timeAllowed) {
        
        this.timeAllowed = timeAllowed;
        
    }

    /**
     * @param maxCorrectPoints the maxCorrectPoints to set
     */
    public void setMaxCorrectPoints(int maxCorrectPoints) {
        
        this.maxCorrectPoints = maxCorrectPoints;
        
    }

    /**
     * @param maxIncorrectPoints the maxIncorrectPoints to set
     */
    public void setMaxIncorrectPoints(int maxIncorrectPoints) {
        
        this.maxIncorrectPoints = maxIncorrectPoints;
        
    }

    /**
     * @param maxVoidPoints the maxVoidPoints to set
     */
    public void setMaxVoidPoints(int maxVoidPoints) {
        
        this.maxVoidPoints = maxVoidPoints;
        
    }

    /**
     * @param stepBy the stepBy to set
     */
    public void setStepBy(int stepBy) {
        
        this.stepBy = stepBy;
        
    }

    /**
     * @return the level
     */
    public String getLevel() {
        
        return level;
        
    }

    /**
     * @return the questionCount
     */
    public int getQuestionCount() {
        
        return questionCount;
        
    }

    /**
     * @return the timeAllowed
     */
    public long getTimeAllowed() {
        
        return timeAllowed;
        
    }

    /**
     * @return the maxCorrectPoints
     */
    public int getMaxCorrectPoints() {
        
        return maxCorrectPoints;
        
    }

    /**
     * @return the maxIncorrectPoints
     */
    public int getMaxIncorrectPoints() {
        
        return maxIncorrectPoints;
        
    }

    /**
     * @return the maxVoidPoints
     */
    public int getMaxVoidPoints() {
        
        return maxVoidPoints;
        
    }

    /**
     * @return the stepBy
     */
    public int getStepBy() {
        
        return stepBy;
        
    }
    
}
