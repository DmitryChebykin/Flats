public class Program {
    public static void main(String[] args) {
        Building building = new Building();
        Request dto = new Request();
        dto.runConsole();
        building.setEntranceQuantity(dto.getEntranceQuantity());
        building.setFloorQuantity(dto.getFloorQuantity());
        building.setFlatQuantityOnFloor(dto.getFlatQuantityOnFloor());
        building.getFlatInfo(dto.getApartmentNumber());

    }
}
