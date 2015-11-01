package org.cps.system;

/**
 *
 * @author alvin_000
 */
public class Question implements Runnable{

    Thread timer;
    
    @Override
    public void run() {
        
        try{
        
            timer = new Thread(this);
            
            Thread.sleep(1000);
            timer.start();
            
            
        } catch(Exception e){
        
        }
        
    }
    
}
