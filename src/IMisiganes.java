public interface IMisiganes {
    void Hello();
    int Count(IDie[] dice);
    void Welcome(IPlayer participant);
    boolean Finished(IScoreBoard sheet);
    void StateOfGame(IGame current);
    void RollNr(IRound current);
}
