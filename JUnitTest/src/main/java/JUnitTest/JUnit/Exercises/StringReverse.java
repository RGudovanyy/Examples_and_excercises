package JUnitTest.JUnit.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringReverse {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String output = reader.readLine();
        System.out.println(reverse(output));
    }

    public static String reverse(String s){
        List<String> tempArray = new ArrayList<String>(s.length());
        for(int i = 0; i < s.length(); i++)
            tempArray.add(s.substring(i, i+1));

        StringBuilder reversedString = new StringBuilder(s.length());
        for(int i = tempArray.size() -1; i >= 0; i--)
            reversedString.append(tempArray.get(i));
        return reversedString.toString();
    }


}
