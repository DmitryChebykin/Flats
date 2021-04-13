import java.util.InputMismatchException;
import java.util.Scanner;

public class Request {

    private int onFloorFlatsNumbers;
    private int entranceNumbers;
    private int floorNumbers;
    private int apartmentNumber;

    //region Getters section
    public int getOnFloorFlatsNumbers() {
        return onFloorFlatsNumbers;
    }

    public int getEntranceNumbers() {
        return entranceNumbers;
    }

    public int getFloorNumbers() {
        return floorNumbers;
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
                entranceNumbers = sc.nextInt();
                if (entranceNumbers < 0) throw new IllegalArgumentException();
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
                floorNumbers = sc.nextInt();
                if (entranceNumbers < 0) throw new IllegalArgumentException();

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
                onFloorFlatsNumbers = sc.nextInt();
                if (onFloorFlatsNumbers < 0) throw new IllegalArgumentException();

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
