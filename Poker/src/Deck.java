import java.util.ArrayList;

public class Deck {
    private static String[][] printCard;
    private ArrayList<Card> cards;
    private int deckSize;

    Deck(String[] rank, String[] suit, int[] value){
        this.cards = new ArrayList<>();

        for(int j = 0; j < rank.length; j++){
            for (String aSuit : suit) {
                Card aCard = new Card(rank[j], aSuit, value[j]);
                this.cards.add(aCard);
            }
        }
        this.deckSize = this.cards.size();
        printCard = CardMaker.constructCard();
        Shuffle();
    }

    boolean isEmpty(){
        return cards.size() == 0;
    }

    int size(){
        return this.cards.size();
    }

    Card deal(){
        if(this.deckSize > 0){
            this.deckSize--;
            return this.cards.get(this.deckSize);
        }
        return null;
    }

    private void Shuffle(){
        for(int k = cards.size() - 1; k >= 0; k--) {
            int r = (int)(Math.random() * k);
            Card tempCard = cards.get(r);
            cards.set(r, cards.get(k));
            cards.set(k, tempCard);

            String[] tempPrn = printCard[r];
            printCard[r] = printCard[k];
            printCard[k] = tempPrn;
        }
    }

    static String[][] giveShuffle(){
        return printCard;
    }

    @Override
    public String toString(){
        StringBuilder rtn = new StringBuilder("size = " + deckSize + "\nCards not dealt: \n");

        for (int i = deckSize - 1; i >= 0; i--) {
            rtn.append(cards.get(i));
            if (i != 0) {
                rtn.append(", ");
            }
            if ((deckSize - i) % 2 == 0) {
                rtn.append("\n");
            }
        }

        rtn.append("\nDealt cards: \n");
        for (int i = cards.size() - 1; i >= deckSize; i--) {
            if(i >= 0) {
                rtn.append(cards.get(i));
            }
            if (i != deckSize) {
                rtn.append(", ");
            }
            if ((i - cards.size()) % 2 == 0) {
                rtn.append("\n");
            }
        }

        rtn.append("\n");
        return rtn.toString();
    }
}