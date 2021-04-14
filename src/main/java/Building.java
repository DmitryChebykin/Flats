public class Building {

    private int onFloorFlatsNumbers;
    private int entranceNumbers;
    private int floorNumbers;

    //region Setters section
    public void setEntranceNumbers(int entranceNumbers) {
        this.entranceNumbers = entranceNumbers;
    }

    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }


    public void setOnFloorFlatsNumbers(int onFloorFlatsNumbers) {
        this.onFloorFlatsNumbers = onFloorFlatsNumbers;
    }
    //endregion

    public Building() {
        this.onFloorFlatsNumbers = 1;
        this.entranceNumbers = 1;
        this.floorNumbers = 1;
    }

    private boolean checkFlatInBuilding(int apartmentNumber){
        return apartmentNumber <= entranceNumbers * floorNumbers * onFloorFlatsNumbers;

    }

    private int getEntranceByFlat(int apartmentNumber){
        int i = (apartmentNumber - 1) /(onFloorFlatsNumbers * floorNumbers) + 1;
        return i;
    }

    private int getFloorByFlat(int apartmentNumber){
        int i = ((apartmentNumber - 1) % (onFloorFlatsNumbers * floorNumbers)) / onFloorFlatsNumbers + 1;
        return i;
    }

    private int getFlatPositionOnFloor(int apartmentNumber){
        int i = apartmentNumber - ((getEntranceByFlat(apartmentNumber) - 1) * floorNumbers + (getFloorByFlat(apartmentNumber) - 1) * onFloorFlatsNumbers);
        return i;
    }

    public void getFlatInfo(int apartmentNumber){
        if(!checkFlatInBuilding(apartmentNumber)) {
            System.out.printf("Квартиры под номером %s нет в доме с такими параметрами", apartmentNumber);
        } else {
            System.out.printf("Квартира под номером %s находится в подъезде № %s, этаж - %s, положение на площадке  - %s",
                    apartmentNumber,
                    getEntranceByFlat(apartmentNumber),
                    getFloorByFlat(apartmentNumber),
                    getFlatPositionOnFloor(apartmentNumber));
        }
    }
}

