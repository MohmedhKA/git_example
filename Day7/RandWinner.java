package Day7;

import java.util.Random;

public class RandWinner {
    public static void main(String[] args) {
        String[] Customers = { "Arun", "Bala", "Cathy", "Divya", "Eshan" };
        Random rand = new Random();
        System.out.println("Winner is: "+Customers[rand.nextInt(5)]);
    }
}
