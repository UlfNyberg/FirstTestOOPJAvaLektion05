/**
 * Created by: Ulf Nyberg
 * Date: 2020-09-29
 * Time: 09:10
 * Project: OOPJava Lektion05
 * Copyright: MIT
 */
public class TestDemo {
    public static void main(String[] args) {

        System.out.println(RomerskaSiffror.X.sifferVärde);
        System.out.println(RomerskaSiffror.D.sifferVärde);
        System.out.println("");

        for (RomerskaSiffror b : RomerskaSiffror.values())

            System.out.println(b + " = " + b.sifferVärde);










    }



}
