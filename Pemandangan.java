import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pemandangan extends World
{
    public Pemandangan()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Pemain(), 100, 200); //Tambahkan pemain ke pemandangan
        addObject(new Koin(), 300, 200); //Tambahkan koin ke pemandangan
        addObject(new Musuh(), 500, 200); //Tambahkan musuh ke pemandangan
    }
}
