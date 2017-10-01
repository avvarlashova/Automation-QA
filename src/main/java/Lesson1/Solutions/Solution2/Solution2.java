package Lesson1.Solutions.Solution2;

public class Solution2 {

    double n = 7.27;

    public void roundDoble(){
        System.out.println("Исходное сисло: " + n + ". Результат округления: " + Math.round(n));
    }

    public static void main(String[] args) {
        Solution2 example = new Solution2();
        example.roundDoble();
    }
}
