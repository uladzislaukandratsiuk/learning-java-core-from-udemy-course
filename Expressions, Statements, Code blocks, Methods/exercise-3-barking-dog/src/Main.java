public class Main {

    public static void main(String[] args) {

        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(true, -1));
        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(true, 23));
        System.out.println("Should wake up = " + BarkingDog.shouldWakeUp(true, 24));
    }
}
