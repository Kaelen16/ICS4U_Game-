import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {
        
        /*
        Player p1 = new Player("Kaelen", "Cheung");
        Player p1 = new Player("Kaelen Cheung");
        Player p2 = new Player("Ted", "Smith");
        Player p3 = new Player("Jason", "Bourne");
        
        ArrayList<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        */

        ArrayList<Player> players = new ArrayList<Player>();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("How many players? ");
        String input = scanner.nextLine();
        int numOfPlayers = Integer.parseInt(input);  // Read user input

        for (int i=0; i<numOfPlayers; i++)
        {
            System.out.print("Enter username: ");
            String userName = scanner.nextLine();  // Read user input
            Player player = new Player(userName);
            players.add(player);
        }
        scanner.close();



        Dealer dealer = new Dealer("James", "Smith", "h4j4hj4j23k");


        dealer.shuffle();
        dealer.deal(players);

        for (Player player : players)
        {
            player.printHand();
        
        }


        int winner = dealer.determineWinner(players);
        //System.out.println("The winner = " + winner);
        Player winningPlayer = players.get(winner);
        System.out.println("Winner is " + winningPlayer.getFullName() + " with " + winningPlayer.getHand().getCardString(winningPlayer.getHand().searchCard()));
        
        System.out.println("Game Over!");
    }
}
