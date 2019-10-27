public class MethodsChallenge {
    public static void main(String[] args) {

        int playerScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Jon", playerScore);

        playerScore = calculateHighScorePosition(900);
        displayHighScorePosition("Ben", playerScore);

        playerScore = calculateHighScorePosition(400);
        displayHighScorePosition("Rick", playerScore);

        playerScore = calculateHighScorePosition(50);
        displayHighScorePosition("Norman", playerScore);

        playerScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Bob", playerScore);

        playerScore = calculateHighScorePosition(500);
        displayHighScorePosition("Greg", playerScore);

        playerScore = calculateHighScorePosition(100);
        displayHighScorePosition("Phil", playerScore);
    }

    private static void displayHighScorePosition(String playerName, int playerPosition) {

        System.out.println(playerName + " manage to get into position # " + playerPosition
                + " on the high score table!");
    }

    private static int calculateHighScorePosition(int playerScore) {

        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
