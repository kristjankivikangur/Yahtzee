package ee.tthk.impls.round;

import ee.tthk.impls.die.Die;
import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IRound;

import java.util.Scanner;

/**
 * Created by Rait on 03.10.2017.
 */
public class Round implements IRound {

    private IDie[] diceInhand;
    private IPlayer currentPlayer;

    public void roll(IDie[] dice)
    {
        if (dice == null) {
            return;
        }
        if (currentPlayer == null) {
            return;
        }
        for (int i = 0; i < dice.length; i++)
        {
            dice[i].Roll();
        }
    }

    public void keepDice(IDie[] dice)
    {
        while (true) {
            System.out.print("The dice are: ");
            for (int i = 0; i < dice.length; i++) {
                System.out.print(dice[i].GetTulemus() + ", ");
            }
            System.out.print("\n");

            System.out.print("Your dice are: ");
            for (int i = 0; i < diceInhand.length; i++) {
                if (diceInhand[i] != null) {
                    System.out.print(diceInhand[i].GetTulemus() + ", ");
                }
            }
            System.out.print("\n");

            System.out.println("Options:");
            System.out.println("1 - Choose dice to keep");
            System.out.println("2 - Choose dice to return");
            System.out.println("3 - Do nothing");

            System.out.print("Enter option: ");
            Scanner in = new Scanner(System.in);
            in.useDelimiter("\\n");
            int option = in.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Choose dice to keep: ");
                    String keepLine = in.next();
                    String[] s = keepLine.split(", ");
                    int[] choices = new int[s.length];
                    for (int i = 0; i < choices.length; i++) {
                        int value = Integer.parseInt(s[i]);
                        if (value >= 1 && value <= 6) {
                            for (int j = 0; j < dice.length; j++) {
                                if (value == dice[j].GetTulemus()) {
                                    choices[i] = value;
                                    continue;
                                }
                            }
                        }
                    }

                    for (int i : choices) {
                        System.out.println("Kept: " + i);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
    }

    public void start(IPlayer player) {
        this.diceInhand = new IDie[5];
        this.currentPlayer = player;
        for (int i = 0; i < 1; i++) {
            IDie[] dice = new IDie[5];
            for (int j = 0; j < dice.length; j++) {
                dice[j] = new Die();
            }
            roll(dice);
            keepDice(dice);
        }
    }
}
