package ee.tthk.interfaces;

/**
 * Created by opilane on 25.09.2017.
 */
public interface IScoreBoard
{
    /**
     * Kontrollib võimalikud täringukombinatsioonid läbi ning annab kasutajale valida, kuhu lahtrisse punktid panna.
     * @param line - reanumben, mille kasutaja valis tabelisse kandmiseks
     */
    void UsersChoice (int line);



    /**
     * Liidab tulba ülemise poole summad kokku (Ühed, kahed, kolmed jne)
     -  Kui summa on 63 või rohkem, siis liidetakse tulemusele 35 punkti.
     -  private
     * @return - tagastab ülemise skoori summa
     */

    int UpperScoreBoard ();



    /**
     * Liidab tulba ülemise poole summad kokku (Ühed, kahed, kolmed jne)
     -  Kui mängija saab mängu jooksul 2 ühe täringupildiga kombinatsiooni, liidetakse
     talle boonuseks 100 punkti.
     * @return - tagastab alumise skoori summa
     */

    int LowerScoreBoard ();



    /**
     * Liidetakse UlemineLopuSkoor ja AlumineLopuSkoor kokku
     * @return - tagastab kogusumma.
     */

     int GrandTotal ();

}