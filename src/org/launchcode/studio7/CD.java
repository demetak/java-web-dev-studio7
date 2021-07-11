package org.launchcode.studio7;

public class CD extends BaseDisc {
    public CD(String name, String contents) {
        super(name,  contents);
        this.setDiscType("CD");
        this.setStorageCapacityInMB(700);
        this.setSpinRate("200-500");
    }
}
