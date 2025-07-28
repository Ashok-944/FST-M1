package Activity;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1, "red");
        colours.put(2, "blue");
        colours.put(3, "yellow");
        colours.put(4, "green");
        colours.put(5, "purple");

        System.out.println("Map: " + colours);

        colours.remove(3);

        System.out.println("Map after removal: " + colours);

        System.out.println("Contains 'green'? " + colours.containsValue("green"));

        System.out.println("Map size: " + colours.size());
    }
}

