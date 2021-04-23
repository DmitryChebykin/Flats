public class Program {
    public static void main(String[] args) {
        Request request = new Request();
        request.runConsole();
        Building building = new Building(request.getFlatsQuantityOnFloor(), request.getEntrancesQuantity(), request.getFloorsQuantity());
        building.printFlatInfo(request.getFlatNumber());
    }
}