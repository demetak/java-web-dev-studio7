package org.launchcode.studio7;

public class DVD extends BaseDisc{
    public DVD(String name, String contents) {
        super(name, contents);
            this.setDiscType("DVD");
            this.setStorageCapacityInMB(4500);
            this.setSpinRate("570-1600");
        }
}
