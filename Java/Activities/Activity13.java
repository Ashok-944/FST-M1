package Activity;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        System.out.println("Enter integer values (type any non-integer to stop):");
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        if (nums.length == 0) {
            System.out.println("No integers were entered.");
            return;
        }

        int randomIndex = indexGen.nextInt(nums.length);
        System.out.println("Random index: " + randomIndex);
        System.out.println("Value at random index: " + nums[randomIndex]);
    }
}
