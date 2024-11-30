import greenfoot.*;

/**
 * Write a description of class RocketKanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RocketKanan extends Actor
{
    public static int x;
    public static int score = 0;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        if(getX()>1000){
            setLocation(10,Greenfoot.getRandomNumber(550));
            score++;
            //getWorld().showText("Score Aligator = " + score, 100,200);
        }
        x = getX();
    }    
}
