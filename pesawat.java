import greenfoot.*;

/**
 * Write a description of class pesawat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pesawat extends Actor
{
    int x, y;
    public static int nyawa;
    private boolean tabrakan1 = true;
    private boolean tabrakan2 = true;
    private boolean tabrakan3 = true;
    private boolean tabrakan4 = true;
    private boolean bolabesibelumtampil = true;
    
    pesawat()
    {
        nyawa = 9;
    }
    /**
     * Act - do whatever the pesawat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            move(6);
        }
        //if(Greenfoot.isKeyDown("right")){
          //  move(6);
        //}
        if(Greenfoot.isKeyDown("left")){
            x = getX();
            y = getY();
            turnTowards(0,y);
        }
        if(Greenfoot.isKeyDown("right")){
            x = getX();
            y = getY();
            turnTowards(1095,y);
        }
        if(Greenfoot.isKeyDown("up")){
            x = getX();
            y = getY();
            turnTowards(x,0);
        }
        if(Greenfoot.isKeyDown("down")){
            x = getX();
            y = getY();
            turnTowards(x,600);
        }
        if(RocketAtas.y<3) tabrakan1 = true;
                if(intersects((Actor)getWorld().getObjects(RocketAtas.class).get(0))){
            if(tabrakan1){
                nyawa--;
                getWorld().showText("Nyawa Pesawat = " + nyawa, 100,100);
                tabrakan1 = false;
            }
        }
        if(RocketBawah.y>595) tabrakan2 = true;
                if(intersects((Actor)getWorld().getObjects(RocketBawah.class).get(0))){
            if(tabrakan2){
                nyawa--;
                getWorld().showText("Nyawa Pesawat = " + nyawa, 100,100);
                tabrakan2 = false;
            }
        }
        if(RocketKanan.x<20) tabrakan3 = true;
                if(intersects((Actor)getWorld().getObjects(RocketKanan.class).get(0))){
            if(tabrakan3){
                nyawa--;
                getWorld().showText("Nyawa Pesawat = " + nyawa, 100,100);
                tabrakan3 = false;
            }
        }
        if(RocketKiri.x>999) tabrakan4 = true;
                if(intersects((Actor)getWorld().getObjects(RocketKiri.class).get(0))){
            if(tabrakan4){
                nyawa--;
                getWorld().showText("Nyawa Pesawat = " + nyawa, 100,100);
                tabrakan4 = false;
            }
        }
        if(nyawa<1)
        {
            getWorld().showText("Game Over",500,300);
            Greenfoot.stop();
        }
        if(Bolaemas.score%5!=0) bolabesibelumtampil = true;
        if(Bolaemas.score%5==0 && bolabesibelumtampil)
        {
            Bolabesi bs = new Bolabesi();
            getWorld().addObject(bs,Greenfoot.getRandomNumber(1090),Greenfoot.getRandomNumber(598));
            bolabesibelumtampil = false;
        }
    }    
}

