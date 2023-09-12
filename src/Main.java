import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, String> Persons = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = scanner.next();
            String p = scanner.next();
            if (Persons.containsKey(s)){
                Persons.put(s,Persons.get(s)+" "+p);
            }
            else {
                Persons.put(s,p);
            }
        }
        Persons.entrySet().stream().sorted(Map.Entry.<String, String>comparingByValue().reversed()).forEach(System.out::println);
        System.out.println(Persons);

    }
}