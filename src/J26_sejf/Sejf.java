package J26_sejf;

import java.util.Random;

public class Sejf {

    private int tajnaLiczba;

    public Sejf() {
        Random rnd = new Random();
        setTajnaLiczba(rnd.nextInt(100)+1);
    }

    public void setTajnaLiczba(int tajnaLiczba) {
        this.tajnaLiczba = tajnaLiczba;
    }

    public void odczyt(int kod){
        if (kod == 0000){
            System.out.println(this.tajnaLiczba);
        }
        else
            System.out.println("Zły kod Brak dostępu");
    }
}
