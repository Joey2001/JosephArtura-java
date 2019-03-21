import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> cards;
    private int deckSize;

    Deck(String[] rank, String[] suit, int[] value){
        this.cards = new ArrayList<Card>();
        for(int pos = 0; pos < rank.length; pos++){
            Card aCard = new Card(rank[pos], suit[pos], value[pos]);
            this.cards.add(aCard);
        }
        this.deckSize = this.cards.size();
    }

    boolean isEmpty(){
        return cards.size() == 0;
    }

    int size(){
        return this.cards.size();
    }

    Card deal(){
        this.deckSize = this.size() - 1;
        if(this.deckSize > 0){
            return this.cards.get(this.deckSize);
        }
        return null;
    }

    @Override
    public String toString(){
        String rtn = "size = " + deckSize + "\nUndealt cards: \n";

        for (int i = deckSize - 1; i >= 0; i--) {
            rtn += cards.get(i);
            if (i != 0) {
                rtn += ", ";
            }
            if ((deckSize - i) % 2 == 0) {
                rtn += "\n";
            }
        }

        rtn += "\nDealt cards: \n";
        for (int i = cards.size() - 1; i >= deckSize; i--) {
            if(i >= 0) {
                rtn += cards.get(i);
            }
            if (i != deckSize) {
                rtn += ", ";
            }
            if ((i - cards.size()) % 2 == 0) {
                rtn += "\n";
            }
        }

        rtn += "\n";
        return rtn;
    }
}
