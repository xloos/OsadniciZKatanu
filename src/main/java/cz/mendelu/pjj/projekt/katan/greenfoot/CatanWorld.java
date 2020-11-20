package cz.mendelu.pjj.projekt.katan.greenfoot;

import cz.mendelu.pjj.projekt.katan.domain.*;
import cz.mendelu.pjj.projekt.katan.domain.Menu;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;

import java.awt.*;

public class CatanWorld extends World {
    boolean spustenie = false;
    PlayButton p = new PlayButton();
    Menu m = new Menu();
    ListButton l = new ListButton();
    TownButton town = new TownButton();
    VillageButton village = new VillageButton();
    RoadButton road = new RoadButton();
    TradeButton trade = new TradeButton();
    Rules pravidla = new Rules();
    DiceAlert diceAlert = new DiceAlert();
    X x= new X();
    Dice dice = new Dice();
    String pod = "pod";
    public CatanWorld() {
        //super(1456, 1154, 1) originalna velkost
        super(1198, 950, 1);
        setBackground("images/mapa2.jpg");
        Game.createNewGame();
        Game.setDice(Game.diceRoll());
        addObject(Game.countryBlocks.get(0), 365,147);
        addObject(Game.countryBlocks.get(1), 450,99);
        addObject(Game.countryBlocks.get(2), 535,147);
        addObject(Game.countryBlocks.get(3), 620,99);
        addObject(Game.countryBlocks.get(4), 705,147);
        addObject(Game.countryBlocks.get(5), 788,99);
        addObject(Game.countryBlocks.get(6), 875,147);
        addObject(Game.countryBlocks.get(7), 280,294);
        addObject(Game.countryBlocks.get(8), 365,245);
        addObject(Game.countryBlocks.get(9), 450,294);
        addObject(Game.countryBlocks.get(10), 535,245);
        addObject(Game.countryBlocks.get(11), 620,294);
        addObject(Game.countryBlocks.get(12), 705,245);
        addObject(Game.countryBlocks.get(13), 790,294);
        addObject(Game.countryBlocks.get(14), 875,245);
        addObject(Game.countryBlocks.get(15), 960,294);
        addObject(Game.countryBlocks.get(16), 195,440);
        addObject(Game.countryBlocks.get(17), 280,392);
        addObject(Game.countryBlocks.get(18), 365,440);
        addObject(Game.countryBlocks.get(19), 450,392);
        addObject(Game.countryBlocks.get(20), 536,440);
        addObject(Game.countryBlocks.get(21), 620,392);
        addObject(Game.countryBlocks.get(22), 705,440);
        addObject(Game.countryBlocks.get(23), 790,392);
        addObject(Game.countryBlocks.get(24), 875,440);
        addObject(Game.countryBlocks.get(25), 960,392);
        addObject(Game.countryBlocks.get(26), 1045,440);
        addObject(Game.countryBlocks.get(27), 195,540);
        addObject(Game.countryBlocks.get(28), 285,588);
        addObject(Game.countryBlocks.get(29), 365,540);
        addObject(Game.countryBlocks.get(30), 450,588);
        addObject(Game.countryBlocks.get(31), 536,540);
        addObject(Game.countryBlocks.get(32), 620,588);
        addObject(Game.countryBlocks.get(33), 706,540);
        addObject(Game.countryBlocks.get(34), 791,588);
        addObject(Game.countryBlocks.get(35), 876,540);
        addObject(Game.countryBlocks.get(36), 960,588);
        addObject(Game.countryBlocks.get(37), 1045,540);
        addObject(Game.countryBlocks.get(38), 280,688);
        addObject(Game.countryBlocks.get(39), 364,733);
        addObject(Game.countryBlocks.get(40), 450,688);
        addObject(Game.countryBlocks.get(41), 535,733);
        addObject(Game.countryBlocks.get(42), 620,688);
        addObject(Game.countryBlocks.get(43), 706,733);
        addObject(Game.countryBlocks.get(44), 790,688);
        addObject(Game.countryBlocks.get(45), 875,733);
        addObject(Game.countryBlocks.get(46), 960,688);
        addObject(Game.countryBlocks.get(47), 364,833);
        addObject(Game.countryBlocks.get(48), 447,880);
        addObject(Game.countryBlocks.get(49), 535,833);
        addObject(Game.countryBlocks.get(50), 619,880);
        addObject(Game.countryBlocks.get(51), 705,833);
        addObject(Game.countryBlocks.get(52), 790,880);
        addObject(Game.countryBlocks.get(53), 875,833);

        addObject(m, 597,475);
        addObject(p, 615,350);
        addObject(l, 1100,100);



    }
    /**
     * Metóda na spustenie hry
     * V prvej fáze sa spúšťa hra z menu.
     * @author xloos
     * @version 1.0.0
     */
    @Override
    public void act() {
        super.act();
        /**
         * Prvá fáza - spustenie hry z menu.
         */
        if (Greenfoot.mouseClicked(l))
        {
            addObject(pravidla, 599,475);
            addObject(x, 1100,850);

        }
        if (Greenfoot.mouseClicked(x))
        {
            removeObject(pravidla);
            removeObject(x);
        }

        if (Greenfoot.mouseClicked(p))
        {
            removeObject(p);
            removeObject(m);
            removeObject(l);
            removeObject(pravidla);
            spustenie = true;
            addObject(town, 75, 610);
            addObject(village, 75, 520);
            addObject(road, 75, 430);
            addObject(trade, 75, 340);
        }
        if (spustenie==true){
            vypisHracInfo();
            vypisKocky();
        }

    }

    private void vypisKocky() {
        addObject(dice, 200, 850);
        if(Game.getDice()==7){
            addObject(diceAlert, 300, 450);
            if (Greenfoot.mouseClicked(diceAlert))
            {
                removeObject(diceAlert);
                Game.setDice(0);

            }
        }
        //drawImage(new GreenfootImage(""+Game.getDice(), 40, null, Color.WHITE), 200, 850);
        showText(""+Game.getDice(),200, 850);
    }

    private void vypisHracInfo() {


        GreenfootImage drawedImage = new GreenfootImage("iconRoad.png");//the image that is drawed;

        getBackground().drawImage(drawedImage, 100, 100);


        getBackground().drawImage(new GreenfootImage(Game.players.get(0).getName(), 25, Color.BLUE, Color.WHITE), 40, 30);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(0).getPoints(), 25, Color.BLUE, Color.WHITE), 40, 60);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(0).getRoad(), 25, Color.BLUE, Color.WHITE), 40, 90);
        getBackground().drawImage(new GreenfootImage("Drevo:"+Game.players.get(0).getResources().get("WOOD"), 25, Color.BLUE, Color.WHITE), 40, 120);
        getBackground().drawImage(new GreenfootImage("Obilie:"+Game.players.get(0).getResources().get("GRAIN"), 25, Color.BLUE, Color.WHITE), 40, 150);
        getBackground().drawImage(new GreenfootImage("Kamen:"+Game.players.get(0).getResources().get("STONE"), 25, Color.BLUE, Color.WHITE), 40, 180);
        getBackground().drawImage(new GreenfootImage("Tehla:"+Game.players.get(0).getResources().get("BRICK"), 25, Color.BLUE, Color.WHITE), 40, 210);
        getBackground().drawImage(new GreenfootImage("Ovce:"+Game.players.get(0).getResources().get("SHEEP"), 25, Color.BLUE, Color.WHITE), 40, 240);

        getBackground().drawImage(new GreenfootImage(Game.players.get(1).getName(), 25, Color.RED, Color.WHITE), 40, 700);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(1).getPoints(), 25, Color.RED, Color.WHITE), 40, 730);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(1).getRoad(), 25, Color.RED, Color.WHITE), 40, 760);
        getBackground().drawImage(new GreenfootImage("Drevo:"+Game.players.get(1).getResources().get("WOOD"), 25, Color.RED, Color.WHITE), 40, 790);
        getBackground().drawImage(new GreenfootImage("Obilie:"+Game.players.get(1).getResources().get("GRAIN"), 25, Color.RED, Color.WHITE), 40, 820);
        getBackground().drawImage(new GreenfootImage("Kamen:"+Game.players.get(1).getResources().get("STONE"), 25, Color.RED, Color.WHITE), 40, 850);
        getBackground().drawImage(new GreenfootImage("Tehla:"+Game.players.get(1).getResources().get("BRICK"), 25, Color.RED, Color.WHITE), 40, 880);
        getBackground().drawImage(new GreenfootImage("Ovce:"+Game.players.get(1).getResources().get("SHEEP"), 25, Color.RED, Color.WHITE), 40, 910);

        getBackground().drawImage(new GreenfootImage(Game.players.get(2).getName(), 25, Color.GREEN, Color.WHITE), 1050, 30);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(2).getPoints(), 25, Color.GREEN, Color.WHITE), 1050, 60);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(2).getRoad(), 25, Color.GREEN, Color.WHITE), 1050, 90);
        getBackground().drawImage(new GreenfootImage("Drevo:"+Game.players.get(2).getResources().get("WOOD"), 25, Color.GREEN, Color.WHITE), 1050, 120);
        getBackground().drawImage(new GreenfootImage("Obilie:"+Game.players.get(2).getResources().get("GRAIN"), 25, Color.GREEN, Color.WHITE), 1050, 150);
        getBackground().drawImage(new GreenfootImage("Kamen:"+Game.players.get(2).getResources().get("STONE"), 25, Color.GREEN, Color.WHITE), 1050, 180);
        getBackground().drawImage(new GreenfootImage("Tehla:"+Game.players.get(2).getResources().get("BRICK"), 25, Color.GREEN, Color.WHITE), 1050, 210);
        getBackground().drawImage(new GreenfootImage("Ovce:"+Game.players.get(2).getResources().get("SHEEP"), 25, Color.GREEN, Color.WHITE), 1050, 240);

        getBackground().drawImage(new GreenfootImage(Game.players.get(3).getName(), 25, null, Color.WHITE), 1050, 700);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(3).getPoints(), 25, null, Color.WHITE), 1050, 730);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(3).getRoad(), 25, null, Color.WHITE), 1050, 760);
        getBackground().drawImage(new GreenfootImage("Drevo:"+Game.players.get(3).getResources().get("WOOD")+" Obilie:"+Game.players.get(3).getResources().get("GRAIN")+" Kamen:"+Game.players.get(3).getResources().get("STONE")+" Tehla:"+Game.players.get(3).getResources().get("BRICK")+" Ovce:"+Game.players.get(3).getResources().get("SHEEP"), 25, null, Color.WHITE), 800, 890);
//        getBackground().drawImage(new GreenfootImage("Obilie:"+Game.players.get(3).getResources().get("GRAIN"), 25, null, Color.WHITE), 1050, 820);
//        getBackground().drawImage(new GreenfootImage("Kamen:"+Game.players.get(3).getResources().get("STONE"), 25, null, Color.WHITE), 1050, 850);
//        getBackground().drawImage(new GreenfootImage("Tehla:"+Game.players.get(3).getResources().get("BRICK"), 25, null, Color.WHITE), 1050, 880);
//        getBackground().drawImage(new GreenfootImage("Ovce:"+Game.players.get(3).getResources().get("SHEEP"), 25, null, Color.WHITE), 1050, 910);


    }
}
