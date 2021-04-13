public class Program {
    public static void main(String[] args) {
        Building building = new Building();
        Request dto = new Request();
        dto.runConsole();
        building.setEntranceNumbers(dto.getEntranceNumbers());
        building.setFloorNumbers(dto.getFloorNumbers());
        building.setOnFloorFlatsNumbers(dto.getOnFloorFlatsNumbers());
        building.getFlatInfo(dto.getApartmentNumber());

    }
}
