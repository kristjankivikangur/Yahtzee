package ee.tthk.impls.round;

import ee.tthk.impls.die.Die;
import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IPlayer;
import ee.tthk.interfaces.IRound;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Rait on 03.10.2017.
 */
public class Round implements IRound {

    private List<IDie> diceInhand;
    private IPlayer currentPlayer;

    public void roll(List<IDie> dice)
    {
        if (dice == null) {
            return;
        }
        if (currentPlayer == null) {
            return;
        }
        for (int i = 0; i < dice.size(); i++)
        {
            dice.get(i).Roll();
        }
    }

    public void keepDice(List<IDie> dice)
    {
        boolean inProgress = true;
        while (inProgress) {
            System.out.print("The dice are: ");
            for (int i = 0; i < dice.size(); i++) {
                System.out.print(dice.get(i).GetTulemus() + ", ");
            }
            System.out.print("\n");

            System.out.print("Your dice are: ");
            for (int i = 0; i < diceInhand.size(); i++) {
                if (diceInhand.get(i) != null) {
                    System.out.print(diceInhand.get(i).GetTulemus() + ", ");
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
                    String[] s = keepLine.split(",");
                    test: for (int i = 0; i < s.length; i++) {
                        int value = Integer.parseInt(s[i].trim());
                        if (value >= 1 && value <= 6) {
                            for (int j = 0; j < dice.size(); j++) {
                                IDie die = dice.get(j);
                                if (value == die.GetTulemus()) {
                                    diceInhand.add(die);
                                    dice.remove(die);
                                    continue test;
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.print("Choose dice to return: ");
                    String returnLine = in.next();
                    String[] s2 = returnLine.split(",");
                    for (int i = 0; i < s2.length; i++) {
                        int value = Integer.parseInt(s2[i].trim());
                        if (value >= 1 && value <= 6) {
                            for (int j = 0; j < diceInhand.size(); j++) {
                                IDie die = diceInhand.get(j);
                                if (value == die.GetTulemus()) {
                                    dice.add(die);
                                    diceInhand.remove(die);
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    /*List<IDie> allDice = new ArrayList<>();
                    allDice.addAll(dice);
                    allDice.addAll(diceInhand);

                    IDie[] allDiceArray = new IDie[dice.size() + diceInhand.size()];
                    allDice.toArray(allDiceArray);

                    currentPlayer.GetScoreBoard().GetOptions(allDiceArray);*/
                    inProgress = false;
                    break;
            }
            System.out.println(" ");
        }
    }

    public void start(IPlayer player) {
        this.diceInhand = new ArrayList<>();
        this.currentPlayer = player;
        List<IDie> dice = new ArrayList<>();
        for (int j = 0; j < 5; j++) {
            dice.add(new Die());
        }
        for (int i = 0; i < 3; i++) {
            roll(dice);
            keepDice(dice);
        }
    }
}
