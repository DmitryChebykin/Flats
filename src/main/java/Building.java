public class Building {
    public void setEntranceNumbers(int entranceNumbers) {
        this.entranceNumbers = entranceNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    private int entranceNumbers;
    private int floorNumbers;

    public void setOnFloorFlatsNumbers(int onFloorFlatsNumbers) {
        this.onFloorFlatsNumbers = onFloorFlatsNumbers;
    }

    private int onFloorFlatsNumbers;

    public Building() {
        this.onFloorFlatsNumbers = 0;
        this.entranceNumbers = 0;
        this.floorNumbers = 0;
    }
    public boolean checkFlatInBuilding(int apartmentNumber){
        if(apartmentNumber <= entranceNumbers*floorNumbers) return true;
        return false;

    }
    public int getEntranceByFlat(int apartmentNumber){
        return (apartmentNumber-1)/onFloorFlatsNumbers*floorNumbers + 1;
    }
    public int getFloorByFlat(int apartmentNumber){
        return (apartmentNumber-1)%onFloorFlatsNumbers*floorNumbers/onFloorFlatsNumbers + 1;
    }
    public int getFlatPositionOnFloor(int apartmentNumber){
       return (getEntranceByFlat(apartmentNumber) - 1)*floorNumbers + (getFloorByFlat(apartmentNumber) - 1)*onFloorFlatsNumbers;
    }
}

