package cz.mendelu.pjj.projekt.katan.domain;

import greenfoot.Actor;
import cz.mendelu.pjj.projekt.katan.greenfoot.CatanWorld;
import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Player extends Actor {

    private String name;
    private int road = 4;
    private int points = 0;
    private HashMap<String, Integer> resources;
    private ArrayList<CountryBlock> blocks;

    public Player(String name) {

        this.name = name;
        resources = new HashMap<String, Integer>(5);
        blocks = new ArrayList<CountryBlock>();
        resources.put("WOOD",5);
        resources.put("GRAIN",5);
        resources.put("STONE",5);
        resources.put("BRICK",5);
        resources.put("SHEEP",5);
    }

    /**
     * Tovární metoda na vytvoření hráče.
     * Metoda vytvoří nového hráče a nastaví atributy resources, road a points a coutnry block.
     * @param name si daný hráč zvolí jméno.
     * @return Nového hráče.
     * @author xpavlik
     * @version 1.0.0
     */

    public static Player createNewPlayer(String name){

        Player p = new Player(name);
        return p;
    }

    /**
     * Metoda na porovnání dvou hráčů.
     * Metoda porovná hráče na základě jmen.
     * @return True or false, podle toho zda mají hráči stejné jméno.
     * @author xpavlik
     * @version 1.0.0
     */

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Player) {
            Player p = (Player) obj;
            return (this.name == p.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, road, resources, blocks);
    }

    /**
     * Metody pro výstavbu nové vesnice nebo města, pokud má daný hráč dostatek suroviny na výstavbu.
     * @param cisloCountryBlocku ,daný blok na kterém bude město nebo vesnice vystavěna.
     * @author xpavlik
     * @version 1.0.0
     */
    public void buildVillage(int cisloCountryBlocku) {
        if(resources.get("WOOD") >= 1 & resources.get("GRAIN") >=1 & resources.get("BRICK") >=1 & resources.get("SHEEP") >=1 & road < 2) {

            for (CountryBlock c : Game.getCountryBlocks()) {
                if(c.getSuradnice() == cisloCountryBlocku) {
                    if(c.getTyp_obydla()<1) {
                        c.setTyp_obydla(1);

                        resources.put("WOOD", resources.get("WOOD") - 1);
                        resources.put("GRAIN", resources.get("GRAIN") - 1);
                        resources.put("BRICK", resources.get("BRICK") - 1);
                        resources.put("SHEEP", resources.get("SHEEP") - 1);
                        setRoad(-2);

                        setPoints(1);
                        if (Game.endGame() == true){
                            System.out.println("Konec hry");
                        }

                    }
                    else {
                        System.out.println("Toto misto je již obsazene");
                    }
                    }
            }
        }
        else
            if(road < 2) {
                System.out.println("Nemáš koupené 2 cesty na stavbu vesnice");
            }
            else
            System.out.println("Nemáš dostatek surovin na stavbu vesnice");



    }

    public boolean termVillage(int cisloCountryBlocku) {

        if (resources.get("WOOD") >= 1 & resources.get("GRAIN") >= 1 & resources.get("BRICK") >= 1 & resources.get("SHEEP") >= 1 & road < 2) {

            for (CountryBlock c : Game.getCountryBlocks()) {
                if (c.getSuradnice() == cisloCountryBlocku) {
                    if (c.getTyp_obydla() < 1) {
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        else {
            return false;
        }
        return true;
    }

    public void buildTown(int cisloCountryBlocku) {

        if (resources.get("GRAIN") >= 2 & resources.get("STONE") >= 3 ) {

            for (CountryBlock c : Game.getCountryBlocks()) {
                if (c.getSuradnice() == cisloCountryBlocku) {
                    if(c.getTyp_obydla()==1) {
                        c.setTyp_obydla(2);

                        resources.put("GRAIN", resources.get("GRAIN") - 2);
                        resources.put("STONE", resources.get("STONE") - 3);


                        setPoints(2);
                        if (Game.endGame() == true){
                            System.out.println("Konec hry");
                        }
                    }
                    else if (c.getTyp_obydla()==2){
                        System.out.println("Zde už je postavene mesto");
                    }
                    else {
                        System.out.println("Potřebuješ zde postavit prvni vesnici");
                    }
                }
            }

        }
        else
            System.out.println("Nemáš dostatek surovin na stavbu města");
    }

    /**
     * Metoda provede nákup nové cesty a zjistí zda má daný hráč dostatek surovin pro nákpu.
     * @author xpavlik
     * @version 1.0.0
     */

    public void buyRoad() {
        if (resources.get("WOOD") >= 1 & resources.get("BRICK") >= 1) {

            resources.put("WOOD", resources.get("WOOD") - 1);
            resources.put("BRICK", resources.get("BRICK") - 1);
            setRoad(1);
        }
        else
            CatanWorld.oznam("Nemas dostatek surovin na koupi cesty");
    }

    /**
     * Metoda vypise počet surovin daného hráče.
     * @author xpavlik
     * @version 1.0.0
     */
    public void vypisPocetSurovin(){
        Set<String> klice = resources.keySet();
        for (String klic : klice){
            System.out.println(klic+"\t"+resources.get(klic));
        }
    }
    /**
     * Metoda provede výměnu hráčových surovin. Záměna bude v úrčitém poměru, který se předem stanový.
     * @author xpavlik
     * @version 1.0.0
     */

    public void trade(int daj_surovinu,int ziskaj_surovinu) {

        int getSurovina = ziskaj_surovinu;

        int putSurovina = daj_surovinu;
        String surovina = null;
        switch (putSurovina){
            case 1: surovina = "WOOD";
            break;
            case 2: surovina = "GRAIN";
                break;
            case 3: surovina = "STONE";
                break;
            case 4: surovina = "BRICK";
                break;
            case 5: surovina = "SHEEP";
                break;
            default:
                System.out.println("Zadal si číslo mimo rozsah");
        }

        switch(getSurovina) {
            case 1:
                if(resources.get("WOOD")>=4 ) {
                    resources.put("WOOD", resources.get("WOOD") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);
                }
                else
                    System.out.println("Nemas dostatek dreva na vymenu");

                break;
            case 2:
                if(resources.get("GRAIN")>=4 ) {
                    resources.put("GRAIN", resources.get("GRAIN") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);
                }
                else
                    System.out.println("Nemas dostatek obilí na vymenu");
                break;
            case 3:
                if(resources.get("STONE")>=4 ) {
                    resources.put("STONE", resources.get("STONE") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);
                }
                else
                    System.out.println("Nemas dostatek kamene na vymenu");
                break;
            case 4:
                if(resources.get("BRICK")>=4 ) {
                    resources.put("BRICK", resources.get("BRICK") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);
                }
                else
                    System.out.println("Nemas dostatek cihel na vymenu");
                break;
            case 5:
                if(resources.get("SHEEP")>=4 ) {
                    resources.put("SHEEP", resources.get("SHEEP") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);
                }
                else
                    System.out.println("Nemas dostatek ovcí na vymenu");
                break;
            default:
                System.out.println("Zadal si číslo mimo rozsah");
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", road=" + road +
                ", resources=" + resources +
                ", blocks=" + blocks +
                '}';
    }
    /**
     * Všechny potřebné gettery a settery
     * @author xpavlik
     * @version 1.0.0
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoad(int road) {
        this.road += road;
    }

    public int getRoad() {
        return road;
    }

    public void setPoints(int points) {
        this.points += points;
    }

    public int getPoints() {
        return points;
    }

    public HashMap<String, Integer> getResources() {
        return resources;
    }

    public ArrayList<CountryBlock> getBlocks() {
        return blocks;
    }

    public static void main(String[] args) {
        Player p1 = new Player("Jirka");
        Player p2 = new Player("Pepa");
        Player p3 = new Player("Jirka");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }


}
