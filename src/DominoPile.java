import java.util.ArrayList;
import java.util.Random;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public void newStack6() {
        pile.clear();
        for (int i = 0; i <= 6; i++) {
            for (int j = i; j <= 6; j++) {
                pile.add(new Domino(i, j));
            }
        }
    }


    public void shuffle() {

        ArrayList<Domino> newPile = new ArrayList<>();
        Random random = new Random();

        while (!pile.isEmpty()) {
            int index = random.nextInt(pile.size());
            newPile.add(pile.remove(index));
        }



        pile = newPile;
    }

    public ArrayList<Domino> getPile() {
        return pile;
    }
}