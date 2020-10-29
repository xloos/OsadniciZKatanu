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
    public static void main(String[] args) {
        createNewGame();


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
            this.setDice(roll);
            return roll;
        }
        else {
            this.setDice(roll);
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
    /**
     * @return Metóda vracia pole krajiny
     * @version 1.0.0
     */
    public void vytvorMapu() {
        CountryBlock cb1 = new CountryBlock(1,10,1);
        CountryBlock cb2 = new CountryBlock(1,10,2);
        CountryBlock cb3 = new CountryBlock(1,10,5,6,3);
        CountryBlock cb4 = new CountryBlock(5,6,4);
        CountryBlock cb5 = new CountryBlock(5,6,3,10,5);
        CountryBlock cb6 = new CountryBlock(3,10,6);
        CountryBlock cb7 = new CountryBlock(3,10,7);
        CountryBlock cb8 = new CountryBlock(2,8,8);
        CountryBlock cb9 = new CountryBlock(2,8,1,10,9);
        CountryBlock cb10 = new CountryBlock(2,8,1,10,5,6,10);
        CountryBlock cb11 = new CountryBlock(5,6,1,10,5,6,11);
        CountryBlock cb12 = new CountryBlock(5,6,1,5,5,6,12);
        CountryBlock cb13 = new CountryBlock(3,10,1,5,5,6,13);
        CountryBlock cb14 = new CountryBlock(3,10,1,5,2,11,14);
        CountryBlock cb15 = new CountryBlock(3,10,2,11,15);
        CountryBlock cb16 = new CountryBlock(2,11,16);
        CountryBlock cb17 = new CountryBlock(1,3,17);
        CountryBlock cb18 = new CountryBlock(1,3,2,8,18);
        CountryBlock cb19 = new CountryBlock(1,3,2,8,4,9,19);
        CountryBlock cb20 = new CountryBlock(5,6,2,8,4,9,20);
        CountryBlock cb21 = new CountryBlock(5,6,5,8,4,9,21);
        CountryBlock cb22 = new CountryBlock(5,6,5,8,1,5,22);
        CountryBlock cb23 = new CountryBlock(4,12,5,8,1,5,23);
        CountryBlock cb24 = new CountryBlock(4,12,4,11,1,5,24);
        CountryBlock cb25 = new CountryBlock(4,12,4,11,2,3,25);
        CountryBlock cb26 = new CountryBlock(4,11,2,3,26);
        CountryBlock cb27 = new CountryBlock(2,3,27);
        CountryBlock cb28 = new CountryBlock(1,3,28);
        CountryBlock cb29 = new CountryBlock(1,3,1,9,29);
        CountryBlock cb30 = new CountryBlock(1,3,1,9,4,9,30);
        CountryBlock cb31 = new CountryBlock(5,2,1,9,4,9,31);
        CountryBlock cb32 = new CountryBlock(5,2,5,8,4,9,32);
        CountryBlock cb33 = new CountryBlock(5,2,5,8,2,5,33);
        CountryBlock cb34 = new CountryBlock(4,12,5,8,2,5,34);
        CountryBlock cb35 = new CountryBlock(4,12,3,11,2,5,35);
        CountryBlock cb36 = new CountryBlock(4,12,3,11,2,3,36);
        CountryBlock cb37 = new CountryBlock(3,11,2,3,37);
        CountryBlock cb38 = new CountryBlock(2,3,38);
        CountryBlock cb39 = new CountryBlock(1,9,39);
        CountryBlock cb40 = new CountryBlock(1,9,2,4,40);
        CountryBlock cb41 = new CountryBlock(1,9,2,4,5,2,41);
        CountryBlock cb42 = new CountryBlock(3,4,2,4,5,2,42);
        CountryBlock cb43 = new CountryBlock(3,4,2,5,5,2,43);
        CountryBlock cb44 = new CountryBlock(3,4,2,5,6,0,44);
        CountryBlock cb45 = new CountryBlock(3,11,2,5,6,0,45);
        CountryBlock cb46 = new CountryBlock(3,11,6,0,46);
        CountryBlock cb47 = new CountryBlock(3,11,47);
        CountryBlock cb48 = new CountryBlock(2,4,48);
        CountryBlock cb49 = new CountryBlock(2,4,49);
        CountryBlock cb50 = new CountryBlock(2,4,3,4,50);
        CountryBlock cb51 = new CountryBlock(3,4,51);
        CountryBlock cb52 = new CountryBlock(3,4,6,0,52);
        CountryBlock cb53 = new CountryBlock(6,0,53);
        CountryBlock cb54 = new CountryBlock(6,0,54);
        countryBlocks.add(cb1);
        countryBlocks.add(cb2);
        countryBlocks.add(cb3);
        countryBlocks.add(cb4);
        countryBlocks.add(cb5);
        countryBlocks.add(cb6);
        countryBlocks.add(cb7);
        countryBlocks.add(cb8);
        countryBlocks.add(cb9);
        countryBlocks.add(cb10);
        countryBlocks.add(cb11);
        countryBlocks.add(cb12);
        countryBlocks.add(cb13);
        countryBlocks.add(cb14);
        countryBlocks.add(cb15);
        countryBlocks.add(cb16);
        countryBlocks.add(cb17);
        countryBlocks.add(cb18);
        countryBlocks.add(cb19);
        countryBlocks.add(cb20);
        countryBlocks.add(cb21);
        countryBlocks.add(cb22);
        countryBlocks.add(cb23);
        countryBlocks.add(cb24);
        countryBlocks.add(cb25);
        countryBlocks.add(cb26);
        countryBlocks.add(cb27);
        countryBlocks.add(cb28);
        countryBlocks.add(cb29);
        countryBlocks.add(cb30);
        countryBlocks.add(cb31);
        countryBlocks.add(cb32);
        countryBlocks.add(cb33);
        countryBlocks.add(cb34);
        countryBlocks.add(cb35);
        countryBlocks.add(cb36);
        countryBlocks.add(cb37);
        countryBlocks.add(cb38);
        countryBlocks.add(cb39);
        countryBlocks.add(cb40);
        countryBlocks.add(cb41);
        countryBlocks.add(cb42);
        countryBlocks.add(cb43);
        countryBlocks.add(cb44);
        countryBlocks.add(cb45);
        countryBlocks.add(cb46);
        countryBlocks.add(cb47);
        countryBlocks.add(cb48);
        countryBlocks.add(cb49);
        countryBlocks.add(cb50);
        countryBlocks.add(cb51);
        countryBlocks.add(cb52);
        countryBlocks.add(cb53);
        countryBlocks.add(cb54);




    }
}



