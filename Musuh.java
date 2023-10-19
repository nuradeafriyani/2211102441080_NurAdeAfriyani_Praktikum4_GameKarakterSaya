import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Musuh extends Actor
{
    public Musuh() 
    {
        setImage("Musuh.png");
    }
    
    public void act()
    {
        move(2); //Misalnya musuh bergerak maju dengan kecepatan 2 piksel per aksi
        
        //periksa tabrakan dengan kucing
        if (isTouching(Pemain.class))
        {
            Pemain pemain = (Pemain) getOneIntersectingObject(Pemain.class);
            //Hapus pemain saat bertabrakan dengan musuh
            getWorld().removeObject(pemain);
        }
        //Jika musuh mencapai tepi dunia, lakukan sesuatu (misalnya respawn musuh)
        if (getX() >= getWorld().getWidth())
        {
            getWorld().removeObject(this);
            //Tambahkan musuh baru atau respawn musuh di lokasi awal
            getWorld().addObject(new Musuh(), 0, Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}