package Lesson2.Solutions.Solution1;

public class Solution1 {

    String lessonStr = "Рассерженный Родион Романович раскричался: Рано радовались, размокший ремень рюкзака разорвался";

    public void setNewLetters(){
        String newStr = lessonStr.toLowerCase();
        String resStr = newStr.replaceAll("р", "*");
        System.out.println("Было: " + lessonStr);
        System.out.println("Стало: " + resStr);
    }

    public static void main(String[] args) {
        Solution1 example = new Solution1();
        example.setNewLetters();

    }
}
