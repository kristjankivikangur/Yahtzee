package ee.tthk.impls.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.*;

/**
 * Created by opilane on 03.10.2017.
 */
public class ScoreBoard implements IScoreBoard{
    private List<IScoreOption>Available;
    LinkedHashMap<String, Integer> Scores = new LinkedHashMap<String, Integer>();
    public ScoreBoard(){
        Scores.put(ScoreNames.ONES,30);
        Scores.put(ScoreNames.TWOS,30);
        Scores.put(ScoreNames.THREES,30);
        Scores.put(ScoreNames.FOURS,30);
        Scores.put(ScoreNames.FIVES,30);
        Scores.put(ScoreNames.SIXES,30);
        Scores.put(ScoreNames.THREEOFAKIND,30);
        Scores.put(ScoreNames.FOUROFAKIND,30);
        Scores.put(ScoreNames.FULLHOUSE,30);
        Scores.put(ScoreNames.SMALLSTRAIGHT,30);
        Scores.put(ScoreNames.LONGSTRAIGHT,30);
        Scores.put(ScoreNames.YAHTZEE,30);
    }



    @Override
    public List<IScoreOption> GetOptions(IDie[] Dice) {
        Available=null;
        Available.add(new ScoreOption("Ones",CalculateOnes(Dice)));

        return null;

    }

    private int CalculateOnes(IDie[] dice)
    {
        return 0;
    }

    @Override
    public void UsersChoice(int line)
    {

    }

    @Override
    public int UpperScoreBoard() {
        Integer UpperSum = 0;
        List<Integer> ScoreValueList = new ArrayList<Integer>(Scores.values());
        for(Integer i = 0; i < 6; i++){
            UpperSum+=ScoreValueList.get(i);
        }

        if (UpperSum >= 63)
        {
            UpperSum += 50;
        }
        System.out.println("Upper score: "+UpperSum);
        return UpperSum;
    }

    @Override
    public int LowerScoreBoard()
    {
        List<Integer> ScoreValueList = new ArrayList<Integer>(Scores.values());
        Integer LowerSum = 0;
        for(Integer i = 6; i < 12; i++){
            LowerSum+=ScoreValueList.get(i);
        }
        System.out.println("Lower score: "+LowerSum);
        return LowerSum;
    }

    @Override
    public int GrandTotal()
    {
        Integer TotalScore=UpperScoreBoard()+LowerScoreBoard();
        System.out.println("Total score: "+TotalScore);
        return TotalScore;
    }
}
