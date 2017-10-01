package Lesson1.Solutions.Solution1;

public class Solution1 {

    int n = 17;
    int j = 3;

    public void getDevisionResult(){
        System.out.println(n + "/" + j + " = " + n/j + " и " + n%j + " в остатке");
    }

    public static void main(String[] args) {
        Solution1 example = new Solution1();
        example.getDevisionResult();
    }
}
