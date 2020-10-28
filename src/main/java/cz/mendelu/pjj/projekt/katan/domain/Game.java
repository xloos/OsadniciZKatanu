package cz.mendelu.pjj.projekt.katan.domain;

import java.util.Objects;

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
        Game game = null;
        game.diceRoll();
        Player player = Player.createNewPlayer(game.zistiMeno());
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    private String zistiMeno() {
        return "Vlado";
    }


    /**
     * Metóda na hod kockou.
     * @return Hodnota z kocky.
     * @author xloos
     * @version 1.0.0
     */
    public int diceRoll(){
        return (int) ((Math.random() * (12 - 2)) + 2);
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
    @Override
    public String toString() {
        return "Game{" +
                "country_block=" + country_block +
                ", dice=" + dice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return dice == game.dice &&
                Objects.equals(country_block, game.country_block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country_block, dice);
    }

//    public static void main(String[] args) {
//
//        System.out.print(this.dice);
//
//    }
}



