//Составить алгоритм: если введенное число больше 7, то вывести “Привет”

import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner numb = new Scanner(System.in);
        int check = 7;
        if(numb.nextInt() > check)
            System.out.print("Привет");
    }
}
