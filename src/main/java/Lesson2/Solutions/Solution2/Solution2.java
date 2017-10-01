package Lesson2.Solutions.Solution2;

public class Solution2 {

    String lessonStr = "Рассерженный Родион Романович раскричался: Рано радовались, размокший ремень рюкзака разорвался";

    public void setNewLetters(){
        String newStr = lessonStr.toLowerCase();
        char [] arr = newStr.toCharArray();           //преобразуем строку в массив
        String resStr = "";
        for (int i = 0; i < arr.length; i ++){        //заполняем новую строку
            if (arr[i] == 'р') {
                resStr = resStr + "*";
            } else {resStr = resStr + arr[i];}

        }

        System.out.println("Было: " + lessonStr);
        System.out.println("Стало: " + resStr);
    }

    public static void main(String[] args) {
        Solution2 example = new Solution2();
        example.setNewLetters();

    }
}
