import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Integer> cards;

    public Deck()
    {
        cards = new ArrayList<Integer>();
        for (int i=0; i<52; i++)
        {
            cards.add(i);
        }
    }

    public String getCardString(int cardNum)
    {
        String suitString;
        String cardString;

        int suitNumber = cardNum / 13;
        int cardNumber = cardNum % 13;

        switch(suitNumber)
        {
            case 0:
                suitString = "Spades";
                break;
            case 1:
                suitString = "Clubs";
                break;
            case 2:
                suitString = "Hearts";
                break;
            default:
                suitString = "Diamonds";
            
        }


        switch(cardNumber)
        {
            case 0:
                cardString = "Ace";
                break;
            case 1:
                cardString = "Deuce";
                break;
            case 2:
                cardString = "Three";
                break;
            case 3:
                cardString = "Four";
                break;
            case 4:
                cardString = "Five";
                break;
            case 5:
                cardString = "Six";
                break;
            case 6:
                cardString = "Seven";
                break;
            case 7:
                cardString = "Eight";
                break;
            case 8:
                cardString = "Nine";
                break;
            case 9:
                cardString = "Ten";
                break;
            case 10:
                cardString = "Jack";
                break;
            case 11:
                cardString = "Queen";
                break;
            default:
                cardString = "King";
            
        }

        return cardString + " of " + suitString;


    }

    public void shuffle()
    {
        Random random = new Random();
        for (int i=0; i< 100; i++)
        {
            // first random number
            int rand1 = random.nextInt(52);
            int card1 = cards.get(rand1);
            //System.out.println(("rand1 = " + rand1 + " card = " + getCardString(card1)));

            // second random number
            int rand2 = random.nextInt(52);
            //System.out.println(("rand2 = " + rand2));
            int card2 = cards.get(rand2);
            //System.out.println(("rand2 = " + rand2 + " card = " + getCardString(card2)));

            // swap
            int temp = card1;
            cards.set(rand1, card2);
            cards.set(rand2, temp);
        }

        //print();
    }

    public int nextCard()
    {
        return cards.remove(cards.size()-1);
    }

    public void print()
    {
        //for (int i=cards.size()-1; i >= 0; i--)
        System.out.print("[");
        for (int i=0; i <cards.size(); i++)
        {
            System.out.print(getCardString(cards.get(i)) + ", ");
        }
        System.out.println("]");
    }

    
    
}
   