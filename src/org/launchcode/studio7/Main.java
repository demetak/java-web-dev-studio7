package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD aCD = new CD("Music CD","Best POP Musics of 2021");
        DVD aDVD = new DVD("Movie DVD", "Best DVD of 2021");

        aCD.readByLaser();
        aCD.writeByLaser();
        aCD.spinDisc();
        aCD.storeData();
        aDVD.readByLaser();
        aDVD.writeByLaser();
        aDVD.spinDisc();
        aDVD.storeData();
    }
}
