import java.util.ArrayList;

public class Dealer extends Person
{
    private Deck deck;

    private String id;
    

    public Dealer(String fullName, String id)
    {
        super(fullName);
        this.id = id;
        this.deck = new Deck();
        //this.deck.print();
    }

    public Dealer(String fName, String lName, String id)
    {
        super(fName, lName);
        this.id = id;
        this.deck = new Deck();
        //this.deck.print();
    }

    public void deal(ArrayList<Player> players)
    {
        
        int numOfHands = players.size();

        for (int i=0; i<numOfHands; i++)
        {
            Player player = players.get(i);
            player.clearHand();
        }

        for (int i=0; i<numOfHands * 7; i++)
        {     
            
            int cardNum = deck.nextCard();
            Player player = players.get(i%numOfHands);
            player.dealCard(cardNum);

            
        }

    }

    public void shuffle()
    {
        deck.shuffle();
    }

    public int determineWinner(ArrayList<Player> players)
    {
        int winner = 0;

        int maxCard = 0;
        //ArrayList<Integer> highCard = new ArrayList<Integer>();
        for (int i=0; i< players.size(); i++)
        {
            Player player = players.get(i); 
            Hand hand = player.getHand();
            int highCard = hand.highCard();
            System.out.println("high card for "+ player.getFirstName() + " is " + hand.getCardString(hand.searchCard()));
            if (highCard > maxCard)
            {
                maxCard = highCard;
                winner = i;
            }
        }

        return winner;
    }
    
}
