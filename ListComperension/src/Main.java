import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cümleyi Giriniz : ");
        String cumle = scanner.nextLine();
        String cumle1 = cumle.trim();
        Map<Character,Integer> frekans = new TreeMap<>();

        for (int i =0; i<cumle1.length();i++){
            char c = cumle1.charAt(i);

            if (frekans.containsKey(c))
                frekans.replace(c, frekans.get(c)+1);

            else
                frekans.put(c,1);
        }

        for (Map.Entry<Character,Integer> entry: frekans.entrySet())
            System.out.println("Karakter: "+ entry.getKey() +" "+ entry.getValue() + " kadar geçiyor...");













    }
}