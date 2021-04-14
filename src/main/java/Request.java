import java.util.InputMismatchException;
import java.util.Scanner;

public class Request {

    private int flatsQuantityOnFloor;
    private int entranceQuantity;
    private int floorQuantity;
    private int apartmentNumber;

    //region Getters section
    public int getFlatsQuantityOnFloor() {
        return flatsQuantityOnFloor;
    }

    public int getEntranceQuantity() {
        return entranceQuantity;
    }

    public int getFloorQuantity() {
        return floorQuantity;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }
    //endregion

    public void runConsole() {
        boolean rightInput = true;

        //region Handling entrance input
        while (rightInput) {
            System.out.println("Введите количество подъездов:");
            try {
                Scanner sc = new Scanner(System.in);
                entranceQuantity = sc.nextInt();
                if (entranceQuantity < 0) throw new IllegalArgumentException();
                rightInput = false;

            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Неверный ввод. Для задания подъездов введите положительное целое число.");
            }
        }
        //endregion
        rightInput = true;
        //region Handling floors input
        while (rightInput) {
            System.out.println("Введите количество этажей:");
            try {
                Scanner sc = new Scanner(System.in);
                floorQuantity = sc.nextInt();
                if (entranceQuantity < 0) throw new IllegalArgumentException();

                rightInput = false;

            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Неверный ввод. Для задания этажей введите положительное целое число.");
            }
        }
        //endregion
        rightInput = true;
        //region Handling flats on the floor input
        while (rightInput) {
            System.out.println("Введите количество квартир на площадке:");
            try {
                Scanner sc = new Scanner(System.in);
                flatsQuantityOnFloor = sc.nextInt();
                if (flatsQuantityOnFloor < 0) throw new IllegalArgumentException();

                rightInput = false;

            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Неверный ввод. Для задания количества квартир на площадке введите положительное целое число.");
            }
        }
        //endregion
        rightInput = true;
        //region Handling flats on the floor input
        while (rightInput) {
            System.out.println("Введите номер квартиры:");
            try {
                Scanner sc = new Scanner(System.in);
                apartmentNumber = sc.nextInt();
                if (apartmentNumber < 0) throw new IllegalArgumentException();

                rightInput = false;

            } catch (IllegalArgumentException | InputMismatchException e) {
                System.out.println("Неверный ввод. Для задания количества квартир на площадке введите положительное целое число.");
            }
        }
        //endregion

    }
}
