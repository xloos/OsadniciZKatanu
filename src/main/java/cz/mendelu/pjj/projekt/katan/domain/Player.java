package cz.mendelu.pjj.projekt.katan.domain;

import java.util.Objects;

public class Player {

    private String name;
    private int wood;
    private int grain;
    private int stone;
    private int brick;
    private int sheep;
    private int points;

    public Player(String name) {
        this.name = name;
        this.wood = 1;
        this.grain = 1;
        this.stone = 1;
        this.brick = 1;
        this.sheep = 1;
        this.points = 0;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", wood=" + wood +
                ", grain=" + grain +
                ", stone=" + stone +
                ", brick=" + brick +
                ", sheep=" + sheep +
                ", points=" + points +
                '}';
    }

    /**
     * Tovární metoda na vytvoření hráče.
     * Metoda vytvoří nového hráče a nastaví atributy resources, buildings a points.
     * @param name si daný hráč zvolí jméno.
     * @return Nového hráče.
     * @author xpavlik
     * @version 1.0.0
     */


    public static Player createNewPlayer(String name){

        Player p = new Player(name);
        return p;
    }
    //equals
    public boolean equals(Object obj) {
        if(obj instanceof Player) {
            Player p = (Player) obj;
            return (this.name == p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wood, grain, stone, brick, sheep, points);
    }

    /**
     * Metoda provede výměnu hráčových surovin. Záměna bude v úrčitém poměru, který se předem stanový.
     * @param put surovina, kterou bude hráč měnit.
     * @param get surovina, kterou hráč chce dostat.
     * @throws IndexOutOfBoundsException
     * @author xpavlik
     * @version 1.0.0
     */

    public void trade(String put, String get) {

        throw new UnsupportedOperationException("Not implemented yet.");

    }

    /**
     * Metoda provede výstavbu nové cesty a zjistí zda má daný hráč dostatek surovin na stavbu.
     * @return Metoda vrátí true pokud má hráč všechny potřebné suroviny pro stavbu cesty.
     * @author xpavlik
     * @version 1.0.0
     */

    public boolean buildRoad() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    /**
     * Metoda provede výstavbu nové vesnice, pokud má daný hráč dostatek suroviny na výstavbu.
     * @return Metoda vrátí true pokud má hráč všechny potřebné suroviny pro stavbu nové vesnice.
     * @author xpavlik
     * @version 1.0.0
     */
    public boolean buildVillage() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }
    /**
     * Metoda na smazání hráče
     * @return vrátí true pokud byl hráč smazán.
     * @author xpavlik
     * @version 1.0.0
     */

    public boolean deletePlayer() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    public String getName() {
        return name;
    }

    public int getWood() {
        return wood;
    }

    public int getGrain() {
        return grain;
    }

    public int getStone() {
        return stone;
    }

    public int getBrick() {
        return brick;
    }

    public int getSheep() {
        return sheep;
    }

    public int getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void setGrain(int grain) {
        this.grain = grain;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void setBrick(int brick) {
        this.brick = brick;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public static void main(String[] args) {
        Player p1 = new Player("Jirka");
        Player p2 = new Player("Pepa");
        Player p3 = new Player("Jirka");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
