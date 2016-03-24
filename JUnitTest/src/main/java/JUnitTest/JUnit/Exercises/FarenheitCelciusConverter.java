package JUnitTest.JUnit.Exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FarenheitCelciusConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        System.out.println();

    }

    public static int toFarenheit(int c){
        return c * 32;
    }
    public static int toCelcius(int f){
        return f/32;
    }
}
