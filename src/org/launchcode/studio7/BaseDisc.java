package org.launchcode.studio7;

public abstract class BaseDisc implements OpticalDisc {
    String name;
    double storageCapacityInMB;
    String contents;
    String discType;
    String spinRate;

    public BaseDisc(String name, String contents) {
        this.name = name;
        this.contents = contents;
    }
    @Override
    public void spinDisc(){
        System.out.println("A " +getDiscType()+" spins at a rate of "+getSpinRate()+" rpm.");
    };
    @Override
    public void storeData() {
        System.out.println("This "+getDiscType()+" stores "+ getStorageCapacityInMB()+" MB of data");
    }

    @Override
    public void writeByLaser() {
        System.out.println("You can write by laser to this "+ getDiscType());
    }

    @Override
    public void readByLaser() {
        System.out.println("You can read by laser to this "+ getDiscType());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    protected void setStorageCapacityInMB(double storageCapacityInMB) {
        this.storageCapacityInMB = storageCapacityInMB;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    protected String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public String getSpinRate() {
        return spinRate;
    }

    public void setSpinRate(String spinRate) {
        this.spinRate = spinRate;
    }

    @Override
    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", storageCapacityInMB=" + storageCapacityInMB +
                ", contents='" + contents + '\'' +
                ", discType='" + discType + '\'' +
                '}';
    }
}
