package Activity;

interface Addable {
    int add(int num1, int num2);
}

public class Activity12 {
    public static void main(String[] args) {
        Addable ad1 = (num1, num2) -> num1 + num2;
        Addable ad2 = (num1, num2) -> { return num1 + num2; };
        System.out.println("ad1: " + ad1.add(5, 6));
        System.out.println("ad2: " + ad2.add(10, 30));
    }
}
