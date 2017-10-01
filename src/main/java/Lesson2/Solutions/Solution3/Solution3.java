package Lesson2.Solutions.Solution3;

import java.util.Arrays;

public class Solution3 {

    // получаем рандомное число из интервала [5;155]
    public int getRandomNum(){
        int a = 5;
        int b = 155;

        int num = a + (int) (Math.random() * b);
        System.out.println("Случайное число от 5-ти до 155-ти: " + num);
        return num;
    }

    //проверяем, попало ли число в интервал (25;100)
    public void checkNum(int num23){
        if (num23 > 25 && num23 < 100){
            System.out.println("Число " + num23 + " содержится в интервале (25,100)");
        } else {
            System.out.println("Число " + num23 + " не содержится в интервале (25,100)");
        }

    }

    public static void main(String[] args) {
        Solution3 example = new Solution3();
        int randNum = example.getRandomNum();
        example.checkNum(randNum);

    }

}
