import java.util.Scanner;

public class Request {
    private int flatsQuantityOnFloor;
    private int entrancesQuantity;
    private int floorsQuantity;
    private int flatNumber;

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

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public void runConsole() {
        entrancesQuantity = getNumber("Введите количество подъездов:", "Неверный ввод. Для задания подъездов введите положительное целое число.");
        floorsQuantity = getNumber("Введите количество этажей:", "Неверный ввод. Для задания этажей введите положительное целое число.");
        flatsQuantityOnFloor = getNumber("Введите количество квартир на площадке:", "Неверный ввод. Для задания количества квартир на площадке введите положительное целое число.");
        flatNumber = getNumber("Введите номер квартиры:", "Неверный ввод. Для задания номера квартиры введите положительное целое число.");
    }

    private int getNumber(String inputMessage, String errorMessage) {
        boolean isRightInput = false;

        Scanner scanner = new Scanner(System.in);

        int inputNumber = 0;

        while (!isRightInput) {
            System.out.println(inputMessage);

            if (scanner.hasNextInt()) {
                inputNumber = scanner.nextInt();

                if (inputNumber <= 0) {
                    System.out.println(errorMessage);
                    continue;
                }

                isRightInput = true;
            } else {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }

        return inputNumber;
    }
}