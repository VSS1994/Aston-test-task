//Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”,
// если нет, то вывести "Нет такого имени"

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        Scanner str = new Scanner(System.in);
        String check = "Вячеслав";
        if(str.nextLine().equals(check))
            System.out.print("Привет");
        else
            System.out.print("Нет такого имени");
    }
}
