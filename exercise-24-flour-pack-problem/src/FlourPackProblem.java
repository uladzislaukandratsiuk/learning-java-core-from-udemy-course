public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println("Can pack 1 (big bag of 5 kilos), if goal is 4 kilos? "
                + canPack(1, 0, 4));
        System.out.println("Can pack 1 (big bag of 5 kilos), if goal is 5 kilos? "
                + canPack(1, 0, 5));
        System.out.println("Can pack 5 (small bags of 1 kilos), if goal is 4 kilos? "
                + canPack(0, 5, 4));
        System.out.println("Can pack 5 (small bags of 1 kilos), if goal is 6 kilos? "
                + canPack(0, 5, 6));
        System.out.println("Can pack 2 (big bags of 5 kilos) and 1 (small bags of 1 kilos)" +
                ", if goal is 12 kilos? " + canPack(2, 1, 12));
        System.out.println("Can pack 2 (big bags of 5 kilos) and 1 (small bags of 1 kilos)" +
                ", if goal is 5 kilos? " + canPack(2, 1, 5));
        System.out.println("Can pack -3 (big bags of 5 kilos) and 2 (small bags of 1 kilos)" +
                ", if goal is 12 kilos? " + canPack(-3, 2, 12));
    }

    private static boolean canPack(int bigCount, int smallCount, int goal) {

        int sum = bigCount * 5 + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0 || sum < goal) {
            return false;
        } else if (goal == (bigCount * 5)) {
            return true;
        }

        return goal % 5 <= smallCount;
    }
}
