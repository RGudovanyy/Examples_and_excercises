package JUnitTest.JUnit.Exercises.TDD;

import java.util.ArrayList;
import java.util.List;

public class Regex {


    private String string;

    public Regex(String input) {
        this.string = input;
    }

    public String getString() {
        return string;
    }

    public String checkNumbers(String string) {
        char[] array = string.toCharArray();
        List<String> list = new ArrayList<String>();
        String a = "";
        for(int i = 0; i < array.length-2;i++){
            if(Character.isDigit(array[i])){
                a += array[i];
                if(Character.isDigit(array[i+1])){
                    a += array[i+1];
                    if(Character.isDigit(array[i+2])){
                        a += array[i+2];
                        list.add(a);

                    }
                }a = "";
            }
        }
        String out = "";
        for(String s : list)
            out += s + " ";
        return out.trim();
    }


    public static void main(String[] args) {
        Regex rx = new Regex("cdefg 345 12bbb33 678tt");
        String output = rx.checkNumbers(rx.getString());
        System.out.println(output);

    }
}
