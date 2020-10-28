package cz.mendelu.pjj.projekt.katan.domain;


public class Game {
    private CountryBlock country_block;
    private int dice;
    /**
     * Továrenska metóda na vytvorenie novej hry.
     * Metóda vytvorý hracie pole a rozmiestni typy krajín.
     * Metóda neskor dovolí postaviť hráčom štartovné dediny a cesty.
     * @return Hracie pole.
     * @author xloos
     * @version 1.0.0
     */
    public static Game createNewGame(){

        throw new UnsupportedOperationException("Not implemented yet.");
    }



    /**
     * Metóda na hod kockou.
     * @param player je hráč, ktorý kockou hádže.
     * @return Hodnota z kocky.
     * @author xloos
     * @version 1.0.0
     */
    public int diceRoll(Player player){

        throw new UnsupportedOperationException("Not implemented yet.");
    }



    /**
     * Metóda na presun piráta a zablokovanie ziskávania surovín z hracieho bloku.
     * @param block ,ktorý bude zablokovaný.
     * @author xloos
     * @version 1.0.0
     */
    public void piratMove(CountryBlock block){
        throw new UnsupportedOperationException("Not implemented yet.");
    }


    /**
     * Metóda na ukončenie hry.
     * Spočíta sa počet získaných bodov.
     * @return Metóda vracia true pokial bola ukončená korektne .
     * @author xloos
     * @version 1.0.0
     */
    public boolean endGame(){

        throw new UnsupportedOperationException("Not implemented yet.");
    }
    /**
     * @return Metóda vracia pole krajiny
     * @version 1.0.0
     */
    public CountryBlock getCountryBlock(int c_type_number, int c_number) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}



