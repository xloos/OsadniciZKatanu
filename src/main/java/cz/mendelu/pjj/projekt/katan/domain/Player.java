package cz.mendelu.pjj.projekt.katan.domain;

import cz.mendelu.pjj.projekt.katan.greenfoot.CatanWorld;
import greenfoot.Actor;

import java.util.*;

public class Player extends Actor {

    private String name;
    private int road = 4;
    private int points = 0;
    public HashMap<String, Integer> resources;


    public Player(String name) {

        this.name = name;
        resources = new HashMap<String, Integer>(5);
        resources.put("WOOD",2);
        resources.put("GRAIN",2);
        resources.put("STONE",2);
        resources.put("BRICK",2);
        resources.put("SHEEP",2);
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
        return Objects.hash(name, road, resources);
    }

    /**
     * Metody pro výstavbu nové vesnice nebo města, pokud má daný hráč dostatek suroviny na výstavbu.
     * @param cisloCountryBlocku ,daný blok na kterém bude město nebo vesnice vystavěna.
     * @author xpavlik
     * @version 1.0.0
     */
    public boolean buildVillage(int cisloCountryBlocku, int hrac) {
        if(resources.get("WOOD") < 1 || resources.get("GRAIN") <1 || resources.get("BRICK") <1 || resources.get("SHEEP") <1 || road < 2) {
            if(road < 2) {
                CatanWorld.oznam("Nemas koupene 2 cesty na stavbu vesnice");
                return false;
            }
            else if (resources.get("WOOD") < 1 || resources.get("GRAIN") <1 || resources.get("BRICK") <1 || resources.get("SHEEP") <1){
                CatanWorld.oznam("Nemas dostatek surovin na stavbu vesnice");
                return false;
            }
        }
        else if (resources.get("WOOD") >=1&& resources.get("GRAIN")>=1 && resources.get("BRICK") >=1 && resources.get("SHEEP") >=1 && road >= 2){


            for (int i = 0; i < 54; i++) {
                if(Game.countryBlocks.get(i).getSuradnice() == cisloCountryBlocku) {
                    if(Game.countryBlocks.get(i).getTyp_obydla()<1) {
                        Game.countryBlocks.get(i).setTyp_obydla(1);
                        Game.countryBlocks.get(i).setTyp_hraca(hrac);
                        resources.put("WOOD", resources.get("WOOD") - 1);
                        resources.put("GRAIN", resources.get("GRAIN") - 1);
                        resources.put("BRICK", resources.get("BRICK") - 1);
                        resources.put("SHEEP", resources.get("SHEEP") - 1);
                        setRoad(-2);
                        setPoints(1);
                        CatanWorld.oznam("Vesnice byla postavena");
                        if (Game.endGame() == true){
                            CatanWorld.oznam("Konec hry !\n Vyhral hrac " + hrac);
                        }
                        return true;
                    }
                    else {
                        CatanWorld.oznam("Zde ma postaveno jiny hrac");
                    }
                }
            }

        }else{
            CatanWorld.oznam("Ani jedna podmienka nepresla");
            return false;

        }
        return false;
    }

    public boolean buildTown(int cisloCountryBlocku, int hrac) {

        if (resources.get("GRAIN") >= 2 & resources.get("STONE") >= 3 ) {

            for (CountryBlock c : Game.getCountryBlocks()) {
                if (c.getSuradnice() == cisloCountryBlocku) {
                    if(c.getTyp_obydla()==1 && c.getTyp_hraca()==hrac) {
                        c.setTyp_obydla(2);
                        resources.put("GRAIN", resources.get("GRAIN") - 2);
                        resources.put("STONE", resources.get("STONE") - 3);


                        setPoints(1);
                        CatanWorld.oznam("Mesto bylo postaveno");
                        if (Game.endGame() == true){
                            CatanWorld.oznam("Konec hry !\n Vyhral hrac " + hrac);
                        }
                        return true;
                    }
                    else if (c.getTyp_obydla()==2){
                        CatanWorld.oznam("Zde uz je postavene mesto");
                        return false;
                    }
                    else {
                        CatanWorld.oznam("Potrebujes zde postavit prvni vesnici");
                        return false;
                    }
                }
            }

        }
        else{
            CatanWorld.oznam("Nemas dostatek surovin na stavbu mesta");
            return false;
        }
        return false;
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
            CatanWorld.oznam("Koupil si cestu !");
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
                CatanWorld.oznam("Zadal si cislo mimo rozsah");
        }

        switch(getSurovina) {
            case 1:
                if(resources.get("WOOD")>=4 ) {
                    resources.put("WOOD", resources.get("WOOD") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);

                    CatanWorld.oznam("Vymenil si suroviny");
                }
                else
                    CatanWorld.oznam("Nemas dostatek dreva na vymenu");

                break;
            case 2:
                if(resources.get("GRAIN")>=4 ) {
                    resources.put("GRAIN", resources.get("GRAIN") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);

                    CatanWorld.oznam("Vymenil si suroviny");
                }
                else
                    CatanWorld.oznam("Nemas dostatek obilí na vymenu");
                break;
            case 3:
                if(resources.get("STONE")>=4 ) {
                    resources.put("STONE", resources.get("STONE") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);

                    CatanWorld.oznam("Vymenil si suroviny");
                }
                else
                CatanWorld.oznam("Nemas dostatek kamene na vymenu");
                break;
            case 4:
                if(resources.get("BRICK")>=4 ) {
                    resources.put("BRICK", resources.get("BRICK") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);

                    CatanWorld.oznam("Vymenil si suroviny");
                }
                else
                    CatanWorld.oznam("Nemas dostatek cihel na vymenu");
                break;
            case 5:
                if(resources.get("SHEEP")>=4 ) {
                    resources.put("SHEEP", resources.get("SHEEP") - 4);
                    resources.put(surovina, resources.get(surovina) + 1);

                    CatanWorld.oznam("Vymenil si suroviny");
                }
                else
                    CatanWorld.oznam("Nemas dostatek ovci na vymenu");
                break;
            default:
                CatanWorld.oznam("Zadal si číslo mimo rozsah");

        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", road=" + road +
                ", resources=" + resources +
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




}
