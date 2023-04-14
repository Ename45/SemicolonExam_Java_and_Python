package javaExam;

public class PrintInSeperateLines {
    public static void main(String[] args) {
        String word = "SEMICOLON";
        System.out.println(letterInSeparateLines(word));
    }

    public static String letterInSeparateLines(String word){
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i);
            result+= '\n';
        }
        return  result;
    }
}
