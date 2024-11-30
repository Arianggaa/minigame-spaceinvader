import greenfoot.*;

/**
 * Write a description of class Bolaemas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bolaemas extends Actor
{
    public static int score = 0;
    /**
     * Act - do whatever the Bolaemas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(intersects((Actor)getWorld().getObjects(pesawat.class).get(0))){
            setLocation(Greenfoot.getRandomNumber(1090),Greenfoot.getRandomNumber(598));
            score ++;
            getWorld().showText("Score Pesawat = " + score, 100,200);
        }
    }    
}
