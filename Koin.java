import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Koin extends Actor
{
    private int nilai;
    
    public Koin()
    {
        setImage("Koin.png");
        
        //atur nilai Koin
        nilai = 10;
    }
    
    public int getNilai()
    {
        return nilai;
    }
}
