import greenfoot.*;

/**
 * Write a description of class Bolabesi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bolabesi extends Actor
{
    /**
     * Act - do whatever the Bolabesi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here
        if(intersects((Actor)getWorld().getObjects(pesawat.class).get(0))){
             pesawat.nyawa++;
             getWorld().showText("Nyawa Pesawat = " + pesawat.nyawa, 100,100);
             getWorld().removeObject(this);
        }
    }    
}
