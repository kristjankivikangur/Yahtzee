/**
 * Created by opilane on 25.09.2017.
 */
public interface IScoreBoard
{
    /**
     * Kontrollib võimalikud täringukombinatsioonid läbi ning annab kasutajale valida, kuhu lahtrisse punktid panna.
     * @param line
     */
    public void UsersChoice (int line);



    /**
     * Liidab tulba ülemise poole summad kokku (Ühed, kahed, kolmed jne)
     -  Kui summa on 63 või rohkem, siis liidetakse tulemusele 35 punkti.
     -  private
     * @return
     */

    public int UpperScoreBoard ();



    /**
     * Liidab tulba ülemise poole summad kokku (Ühed, kahed, kolmed jne)
     -  Kui mängija saab mängu jooksul 2 ühe täringupildiga kombinatsiooni, liidetakse
     talle boonuseks 100 punkti.
     * @return
     */

    public int LowerScoreBoard ();



    /**
     * Liidetakse UlemineLopuSkoor ja AlumineLopuSkoor kokku
     * @return
     */

    public  int GrandTotal ();

}
