package cz.mendelu.pjj.projekt.katan.domain;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.*;

public class Player{

    private String name;
    private int road = 0;
    private HashMap<String, Integer> resources;
    private ArrayList<CountryBlock> blocks = new ArrayList<CountryBlock>();

    public Player(String name) {

        this.name = name;
        resources = new HashMap<String, Integer>(5);
        resources.put("WOOD",5);
        resources.put("GRAIN",5);
        resources.put("STONE",5);
        resources.put("BRICK",5);
        resources.put("SHEEP",5);
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
    /**
     * Metoda provede výstavbu nové cesty a zjistí zda má daný hráč dostatek surovin na stavbu.
     * @author xpavlik
     * @version 1.0.0
     */

    public void buyRoad() {
        this.road +=1;

    }
    public void vypisPocetSurovin(){
        Set<String> klice = resources.keySet();
        for (String klic : klice){
            System.out.println(klic+"\t"+resources.get(klic));
        }
    }
    /**
     * Metoda provede výměnu hráčových surovin. Záměna bude v úrčitém poměru, který se předem stanový.
     * @throws IndexOutOfBoundsException
     * @author xpavlik
     * @version 1.0.0
     */

    public void trade() {
        System.out.println("Mění se vždy v poměru 1:4 ! Musíš mít min. 4 stejné suroviny, aby si získal jinou !");
        System.out.println("-----------------------------------------------------------------------------------");

        System.out.println("Napiš číslo suroviny, kterou chceš měnit: ");
        System.out.println( " [1] - WOOD\n [2] - GRAIN\n [3] - STONE\n [4] - BRICK\n [5] - SHEEP\n");
        Scanner sc = new Scanner(System.in);
        int getSurovina = sc.nextInt();

        System.out.println("Napiš číslo suroviny, kterou chceš dostat: ");
        System.out.println( " [1] - WOOD\n [2] - GRAIN\n [3] - STONE\n [4] - BRICK\n [5] - SHEEP\n");
        int putSurovina = sc.nextInt();
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





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoad(int road) {
        this.road = road;
    }

    public int getRoad() {
        return road;
    }

    public static void main(String[] args) {
        Player p1 = new Player("Jirka");
        Player p2 = new Player("Pepa");
        Player p3 = new Player("Jirka");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        p1.vypisPocetSurovin();
        p1.trade();
        p1.vypisPocetSurovin();
        p1.trade();
        p1.vypisPocetSurovin();
    }

}
