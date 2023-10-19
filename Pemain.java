import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pemain extends Actor {
    public Pemain() {
        // Atur gambar untuk pemain.
        setImage("pemain.png");
    }

    public void act() {
        move(5); // Pindahkan pemain ke depan.

        // Periksa tabrakan dengan koin.
        if (isTouching(Koin.class)) {
            Koin koin = (Koin) getOneIntersectingObject(Koin.class);
            int nilaiKoin = koin.getNilai();
            // Tambahkan nilaiKoin ke skor pemain.
            // Anda mungkin ingin menampilkan skor atau memperbarui cara lain.
            getWorld().removeObject(koin); // Hapus koin yang telah dikumpulkan.
        }

        // Periksa tabrakan dengan musuh.
        if (isTouching(Musuh.class)) {
            getWorld().removeObject(this); // Hapus pemain saat bertabrakan dengan musuh.
        }
    }
}
