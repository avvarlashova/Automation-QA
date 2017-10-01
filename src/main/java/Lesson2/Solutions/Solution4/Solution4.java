package Lesson2.Solutions.Solution4;

import java.util.Arrays;

public class Solution4 {

    String basicStr = "Я у мамы программистка";

    public String getSortArrFronStr() {                        //Метод для сортировки  и выпиливания элементов
        String newStr = basicStr.toLowerCase();                //Приводим к строчному регистру
        newStr = newStr.replace(" ", "");    //Удаляем пробелы
        char[] arr = newStr.toCharArray();

        for (int i = 0; i < arr.length; i++) {           //Сортируем массив выбором
            char min = arr[i];
            int pos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }

        char [] sortedArr = new char[arr.length];         //создаем новый массив, чтобы записывать уникальные элементы
        sortedArr[0] = arr[0];
        int j = 0;                                        //счетчик элементов для нового массива
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] != arr[i-1]){
                sortedArr[j+1] = arr[i];
                j++;
            }
        }

        String arrString = Arrays.toString(arr);               //переводим массивы в строки и печатаем их
        String sortArrStr = Arrays.toString(sortedArr);
        System.out.println(arrString);
        System.out.println(sortArrStr);
        return arrString;
    }


    public static void main(String[] args) {
        Solution4 example = new Solution4();
        example.getSortArrFronStr();
    }


}
