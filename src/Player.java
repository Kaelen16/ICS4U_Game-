public class Player extends Person
{
    private Hand hand;

    public Player(String fullName)
    {

        super(fullName);
        hand = new Hand();
    }

    public Player(String fName, String lName)
    {
        super(fName, lName);
        hand = new Hand();
    }

    public Hand getHand()
    {
        return hand;
    }

    public void clearHand()
    {
        hand = new Hand();
    }

    public void dealCard(int cardNumber)
    {
        hand.add(cardNumber);
    }

    public void printHand()
    {
        System.out.print(getFirstName() + ": ");
        hand.print();
    }
}