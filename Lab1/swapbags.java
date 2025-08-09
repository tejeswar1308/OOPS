package Lab1;

public class swapbags {

    public static void main(String[] args) {
        int tomBag = 3;
        int jerryBag = 5;

        System.out.println("Before Swapping:");
        System.out.println("Tom's Bag: " + tomBag + " apples");
        System.out.println("Jerry's Bag: " + jerryBag + " apples");

        int temp = tomBag;
        tomBag = jerryBag;
        jerryBag = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("Tom's Bag: " + tomBag + " apples");
        System.out.println("Jerry's Bag: " + jerryBag + " apples");
    }
}
