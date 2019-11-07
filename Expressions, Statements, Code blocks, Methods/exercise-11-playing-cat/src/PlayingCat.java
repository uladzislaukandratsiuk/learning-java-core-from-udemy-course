public class PlayingCat {

    public static void main(String[] args) {

        System.out.println("Should be false = " + isCatPlaying(true, 10));
        System.out.println("Should be false = " + isCatPlaying(false, 36));
        System.out.println("Should be false = " + isCatPlaying(true, 46));
        System.out.println("Should be true = " + isCatPlaying(false, 35));
        System.out.println("Should be true = " + isCatPlaying(false, 26));
    }

    private static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else return !summer && temperature >= 25 && temperature <= 35;
    }
}
