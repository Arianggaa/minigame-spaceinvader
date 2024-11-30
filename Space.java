import greenfoot.*;

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1095, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        pesawat pesawat = new pesawat();
        addObject(pesawat, 60, 50);
        pesawat.setLocation(498, 271);
        RocketAtas rocketatas = new RocketAtas();
        addObject(rocketatas, 484, 33);
        rocketatas.setRotation(90);
        RocketBawah rocketbawah = new RocketBawah();
        addObject(rocketbawah, 504, 563);
        rocketbawah.setRotation(270);
        RocketKanan rocketkanan = new RocketKanan();
        addObject(rocketkanan, 56, 289);
        RocketKiri rocketkiri = new RocketKiri();
        addObject(rocketkiri, 961, 268);
        rocketkiri.setRotation(180);
        removeObject(pesawat);
        pesawat pesawa = new pesawat();
        addObject(pesawa, 504, 295);
        Bolaemas bolaemas = new Bolaemas();
        addObject(bolaemas, 1009, 36);
    }
}
