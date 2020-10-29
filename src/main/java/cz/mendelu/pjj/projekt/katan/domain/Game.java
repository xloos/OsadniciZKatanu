package cz.mendelu.pjj.projekt.katan.domain;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;
public class Game {
    private static ArrayList<CountryBlock> countryBlocks = new ArrayList<CountryBlock>();
    private static ArrayList<Player> players = new ArrayList<Player>();
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
        Game hra = new Game();
        players.add(new Player(hra.zistiMeno()));
        players.add(new Player(hra.zistiMeno()));
        players.add(new Player(hra.zistiMeno()));
        players.add(new Player(hra.zistiMeno()));
        //for (Player p : players) {
          //  System.out.println(p.getName());
         //   System.out.println(p.getBrick());
       // }
        return hra;

    }
    /**
     * Metóda na zistenie mena hráča.
     * @return Meno hráča.
     * @author xloos
     * @version 1.0.0
     */
    private String zistiMeno() {
        System.out.println("Zadaj meno hráča: " );
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }


    /**
     * Metóda na hod kockou.
     * @return Hodnota z kocky.
     * @author xloos
     * @version 1.0.0
     */
    public int diceRoll(){
        int roll = (int)(Math.random() * 6 + 1) + (int)(Math.random() * 6 + 1);
        if (roll == 7) {
            return roll;
        }
        else {

            return roll;
        }
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

    public static void main(String[] args) {
        createNewGame();


    }

    public static ArrayList<CountryBlock> getCountryBlocks() {
        return countryBlocks;
    }

    public static ArrayList<Player> getPlayers() {
        return players;
    }

    public int getDice() {
        return dice;
    }

    public static void setCountryBlocks(ArrayList<CountryBlock> countryBlocks) {
        Game.countryBlocks = countryBlocks;
    }

    public static void setPlayers(ArrayList<Player> players) {
        Game.players = players;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}



