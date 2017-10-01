package Lesson1.Solutions.Solution4;

import java.util.Scanner;

public class Solution4 {

    int num;                                         //переменная для введенного числа

    // Вводим число
    public void getNumberFromUser(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }

    //Преобразуем введенное число в массив и считаем сумму
    public void setArray(){
        String s = Integer.toString(num);
        char [] arr = s.toCharArray();
        int sum = 0;
        //int [] res = new int[arr.length];
        for (int i = 0;i<arr.length; i++) {
            int c = Character.getNumericValue(arr[i]);
            sum = sum + c;
        }
        System.out.println("Сумма цифр: " + sum);

    }

    public static void main(String[] args) {
        Solution4 example = new Solution4();
        example.getNumberFromUser();
        example.setArray();
    }
}
