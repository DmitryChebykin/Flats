public class Building {
    public static final String[] FLAT_POSITIONS_DESCRIPTIONS = {"ближняя слева", "дальняя слева", "дальняя справа", "ближняя справа"};

    private int flatsQuantityOnFloor;
    private int entrancesQuantity;
    private int floorsQuantity;

    public Building(int flatsQuantityOnFloor, int entrancesQuantity, int floorsQuantity) {
        this.flatsQuantityOnFloor = flatsQuantityOnFloor;
        this.entrancesQuantity = entrancesQuantity;
        this.floorsQuantity = floorsQuantity;
    }

    public int getFlatsQuantityOnFloor() {
        return flatsQuantityOnFloor;
    }

    public void setFlatsQuantityOnFloor(int flatsQuantityOnFloor) {
        this.flatsQuantityOnFloor = flatsQuantityOnFloor;
    }

    public int getEntrancesQuantity() {
        return entrancesQuantity;
    }

    public void setEntrancesQuantity(int entrancesQuantity) {
        this.entrancesQuantity = entrancesQuantity;
    }

    public int getFloorsQuantity() {
        return floorsQuantity;
    }

    public void setFloorsQuantity(int floorsQuantity) {
        this.floorsQuantity = floorsQuantity;
    }

    private boolean isFlatInBuilding(int flatNumber) {
        return flatNumber <= entrancesQuantity * floorsQuantity * flatsQuantityOnFloor;
    }

    private int getEntranceNumberForFlat(int flatNumber) {
        return (flatNumber - 1) / (flatsQuantityOnFloor * floorsQuantity) + 1;
    }

    private int getFloorNumberForFlat(int flatNumber) {
        return ((flatNumber - 1) % (flatsQuantityOnFloor * floorsQuantity)) / flatsQuantityOnFloor + 1;
    }

    private int getFlatDigitalPositionOnFloor(int flatNumber) {
        int flatsQuantityInPreviousEntrances = (getEntranceNumberForFlat(flatNumber) - 1) * floorsQuantity * flatsQuantityOnFloor;
        int flatsQuantityInPreviousFloorsAtCurrentEntrance = (getFloorNumberForFlat(flatNumber) - 1) * flatsQuantityOnFloor;
        return flatNumber - (flatsQuantityInPreviousEntrances + flatsQuantityInPreviousFloorsAtCurrentEntrance);
    }

    public void printFlatInfo(int flatNumber) {
        if (!isFlatInBuilding(flatNumber)) {
            System.out.printf("Квартиры под номером %s нет в доме с такими параметрами", flatNumber);
        } else {
            System.out.printf(
                    "Квартира под номером %d находится в подъезде №%d, этаж - %d, положение на площадке порядковое - %d%n",
                    flatNumber, getEntranceNumberForFlat(flatNumber), getFloorNumberForFlat(flatNumber),
                    getFlatDigitalPositionOnFloor(flatNumber));

            if (flatsQuantityOnFloor == 4) {
                System.out.printf("Или по другому, эта квартира - %s.",
                        FLAT_POSITIONS_DESCRIPTIONS[getFlatDigitalPositionOnFloor(flatNumber) - 1]);
            }
        }
    }
}