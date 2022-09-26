//Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0)
                System.out.print(array[j]);
        }
    }
}
