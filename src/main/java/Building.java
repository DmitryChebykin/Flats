public class Building {

    private int flatQuantityOnFloor;
    private int entranceQuantity;
    private int floorQuantity;

    //region Setters section
    public void setEntranceQuantity(int entranceQuantity) {
        this.entranceQuantity = entranceQuantity;
    }

    public void setFloorQuantity(int floorQuantity) {
        this.floorQuantity = floorQuantity;
    }


    public void setFlatQuantityOnFloor(int flatQuantityOnFloor) {
        this.flatQuantityOnFloor = flatQuantityOnFloor;
    }
    //endregion

    public Building() {
        this.flatQuantityOnFloor = 1;
        this.entranceQuantity = 1;
        this.floorQuantity = 1;
    }

    private boolean checkFlatInBuilding(int apartmentNumber){
        return apartmentNumber <= entranceQuantity * floorQuantity * flatQuantityOnFloor;

    }

    private int getEntranceByFlat(int apartmentNumber){
        int i = (apartmentNumber - 1) /(flatQuantityOnFloor * floorQuantity) + 1;
        return i;
    }

    private int getFloorByFlat(int apartmentNumber){
        int i = ((apartmentNumber - 1) % (flatQuantityOnFloor * floorQuantity)) / flatQuantityOnFloor + 1;
        return i;
    }

    private int getFlatPositionOnFloor(int apartmentNumber){
        int i = apartmentNumber - ((getEntranceByFlat(apartmentNumber) - 1) * floorQuantity + (getFloorByFlat(apartmentNumber) - 1) * flatQuantityOnFloor);
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

