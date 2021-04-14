public class Program {
    public static void main(String[] args) {
        Building building = new Building();
        Request dto = new Request();
        dto.runConsole();
        building.setEntranceNumbers(dto.getEntranceQuantity());
        building.setFloorNumbers(dto.getFloorQuantity());
        building.setOnFloorFlatsNumbers(dto.getFlatsQuantityOnFloor());
        building.getFlatInfo(dto.getApartmentNumber());

    }
}
