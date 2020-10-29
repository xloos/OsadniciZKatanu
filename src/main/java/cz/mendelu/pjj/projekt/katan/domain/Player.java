package cz.mendelu.pjj.projekt.katan.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Player{

    private String name;
    private HashMap<String, Integer> resources;
    private ArrayList<CountryBlock> blocks = new ArrayList<CountryBlock>();

    /**
     * Metoda provede výstavbu nové vesnice, pokud má daný hráč dostatek suroviny na výstavbu.
     * @author xpavlik
     * @version 1.0.0
     */
    public void buildVillage(int cisloCountryBlocku) {

        for (CountryBlock c : Game.getCountryBlocks()) {
            if(c.getSuradnice() == cisloCountryBlocku) {
                c.setTyp_obydla(1);
            }
        }

    }
    public void buildTown(int cisloCountryBlocku) {

        for (CountryBlock c : Game.getCountryBlocks()) {
            if(c.getSuradnice() == cisloCountryBlocku) {
                c.setTyp_obydla(2);
            }
        }

    }




    public Player(String name) {

        this.name = name;

        resources = new HashMap<String, Integer>(5);
        resources.put("WOOD",1);
        resources.put("GRAIN",1);
        resources.put("STONE",1);
        resources.put("BRICK",1);
        resources.put("SHEEP",1);
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

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Player p1 = new Player("Jirka");
        Player p2 = new Player("Pepa");
        Player p3 = new Player("Jirka");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

}
