/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-29
 * Time: 10:22
 * Project: OOPJava Lektion05
 * Copyright: MIT
 */
public enum RomerskaSiffror {

    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);

    public final int sifferVärde;


    RomerskaSiffror (int s){
        this.sifferVärde = s;

    }

    public int getSifferVärde() {
        return sifferVärde;
    }
}
