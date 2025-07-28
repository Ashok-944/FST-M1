package Activity;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Elderberry");
        hs.add("Fig");

        System.out.println("Size of HashSet: " + hs.size());

        hs.remove("Date");

        hs.remove("Grape");

        System.out.println("Contains 'Apple'? " + hs.contains("Apple"));

        System.out.println("Updated set: " + hs);
    }
}

