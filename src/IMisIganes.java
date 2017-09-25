/**
 * Created by opilane on 25.09.2017.
 */
public interface IMisIganes {
    void Hello();
    int Count(IDie[] dice);
    void Welcome(IPlayer participant);
    boolean Finished(IScoreBoard sheet);
    void StateOfGame(IGame current);
    void RollNr(IRound current);

}
