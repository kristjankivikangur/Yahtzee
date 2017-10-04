package ee.tthk.impls.scoreboard;

import ee.tthk.interfaces.IDie;
import ee.tthk.interfaces.IScoreBoard;
import ee.tthk.interfaces.IScoreOption;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by opilane on 03.10.2017.
 */
public class ScoreBoard implements IScoreBoard{
    private List<IScoreOption>Available;
    Map<String,Integer> Scores=new HashMap<String,Integer>();
    public ScoreBoard(){
        Scores.put("Ones",-1);
        Scores.put("Twos",-1);
        Scores.put("Threes",-1);
        Scores.put("Fours",-1);
        Scores.put("Fives",-1);
        Scores.put("Sixes",-1);
        Scores.put("ThreeOfAKind",-1);
        Scores.put("FourOfAKind",-1);
        Scores.put("FullHouse",-1);
        Scores.put("SmallStraight",-1);
        Scores.put("LargeStraight",-1);
        Scores.put("Yahtzee",-1);
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
    public void UsersChoice(int line) {

    }

    @Override
    public int UpperScoreBoard() {
        /*int UpperScoreTemp = Ones+Twos+Threes+Fours+Fives+Sixes;
        if(UpperScoreTemp >= 63)
        {
            return UpperScoreTemp+50;
        }
        return UpperScoreTemp;*/

        Integer UpperSum = 0;
        for (Integer j : Scores.values())
        {
            UpperSum += j;
            if (UpperSum >= 63)
            {
                return UpperSum + 50;
            }
            return UpperSum;
        }
        return UpperSum;
    }

    @Override
    public int LowerScoreBoard()
    {
        Integer LowerSum = 0;
        for (Integer k : Scores.values())
        {
            LowerSum += k;
        }
        return LowerSum;
    }

    @Override
    public int GrandTotal()
    {
        return UpperScoreBoard() + LowerScoreBoard();
    }
}
