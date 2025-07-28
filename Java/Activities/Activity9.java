package Activity;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Eve");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("3rd name: " + myList.get(2));

        System.out.println("Contains 'Bob'? " + myList.contains("Bob"));

        System.out.println("Size: " + myList.size());

        myList.remove("Charlie");

        System.out.println("Size after removal: " + myList.size());
    }
}

