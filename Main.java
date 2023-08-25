import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set1= new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        Set<String> set3 = new TreeSet<>();
        //HashSet
        set1.add("Java");
        set1.add("Python");
        set1.add("C++");
        set1.add("JavaScript");
        set1.add("PHP");
        set1.add("PHP");
        //LinkedHashSet
        set2.add("Java");
        set2.add("Python");
        set2.add("C++");
        set2.add("JavaScript");
        set2.add("PHP");
        set2.add("PHP");
        //TreeSet
        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("PHP");
        set3.add("PHP");
        for (int i =0;i<set1.size();i++){
            System.out.println(set1);
        }
        for (int i =0;i<set2.size();i++){
            System.out.println(set2);
        }
        for (int i =0;i<set3.size();i++){
            System.out.println(set3);
        }


        System.out.println(set1.contains("Java"));
        System.out.println(set1.contains("a"));




















    }
}