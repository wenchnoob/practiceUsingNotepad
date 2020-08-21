import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class IOPractice {
     public static void main(String[] args) {
         new BufferedReader(new InputStreamReader(System.in))
         .lines()
         .forEach(line -> System.out.println(line)); //One Line Revision Works But Not Best
    }
}