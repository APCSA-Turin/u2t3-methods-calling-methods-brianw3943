package U2T3_ModifyingObjectState;

public class Test {
    public static void main(String[] args) {
        Game game = new Game("Game", 6);
        System.out.println("Score: " + game.getScore());
        game.increaseScore(5);
        System.out.println("Score: " + game.getScore());
        game.multiplyScore(2);
        System.out.println("Score: " + game.getScore());
        game.decreaseScore(4);
        System.out.println("Score: " + game.getScore());
    }
}
