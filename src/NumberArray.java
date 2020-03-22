import java.util.Scanner;

public class NumberArray {
    public static int[] removeElement(int[] array, int value) {
        int position = array.length - 1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                position = index;
            }
        }

        for (int index = position; index < array.length - 1; index++) {
            array[index] = array[index + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static boolean validate(int[] array, int value) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == value) {
                return true;
            }
        }
        return false;
    }

    public static void displayElement(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] demoArray = {10, 4, 6, 7, 8, 6};

        System.out.println("We have a sample array: \n");
        displayElement(demoArray);
        System.out.println();

        System.out.print("Enter a number you want to check: ");
        int input = scanner.nextInt();
        System.out.println();

        if (validate(demoArray, input)) {
            System.out.println("This number is within the array!");
            System.out.print("Do you want to delete it ? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'y') {
                int[] resultArray = removeElement(demoArray, input);
                System.out.println("The array after delete is: ");
                displayElement(resultArray);
            } else if (choice == 'n') {
                System.out.println("Exit the program");
                System.exit(0);
            } else {
                System.out.println("Invalid Input!. Exit the program!");
                System.exit(0);
            }
        } else {
            System.out.println("This number is not within the array!");
            System.out.println("Exit the program!");
            System.exit(0);
        }
    }
}
