import java.util.ArrayList;
import java.util.Collections;

public class Hand
{
    private ArrayList<Integer> cards;

    
    public Hand()
    {
        this.cards = new ArrayList<Integer>();
    }

    public void add(int cardNum)
    {
        cards.add(cardNum);
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
    
    public void print()
    {
        System.out.print("[");
        for (int i=0; i <cards.size(); i++)
        {
            System.out.print(getCardString(cards.get(i)) + ", ");
        }
        System.out.println("]");
    }

    public int highCard()
    {

        ArrayList<Integer> cardNumbers = new ArrayList<Integer>();

        for (int i=0; i<5; i++)
        {
            cardNumbers.add(cards.get(i)%13);
        }

        Collections.sort(cardNumbers);
        
        return cardNumbers.get(4);
    }
    
    public int searchCard()
    {
        int cardPosition = 0;
        for (int i=0; i<5; i++)
            {
               if(cards.get(i)%13 == highCard())
               { 
               cardPosition = i;
               }
            }
        return cards.get(cardPosition);
    
    }
    
}
