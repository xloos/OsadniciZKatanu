package cz.mendelu.pjj.projekt.katan.greenfoot;

import cz.mendelu.pjj.projekt.katan.domain.*;
import cz.mendelu.pjj.projekt.katan.domain.Menu;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.MouseInfo;
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
    HelpIcon helpIcon = new HelpIcon();
    HelpInfoCard helpInfoCard = new HelpInfoCard();
    Pirate pirate = new Pirate();
    Boolean pirat_posun = false;
    Arrows arrows = new Arrows();
    int vymena = 0;
    Wood wood = new Wood();
    Brick brick = new Brick();
    Stone stone = new Stone();
    Sheep sheep = new Sheep();
    Grain grain = new Grain();
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
        if (Greenfoot.mouseClicked(helpIcon))
        {
            addObject(helpInfoCard, 599,475);
            addObject(x, 600,850);


        }
        if (Greenfoot.mouseClicked(x))
        {
            removeObject(pravidla);
            removeObject(x);
            removeObject(helpInfoCard);
        }

        if (Greenfoot.mouseClicked(p))
        {
            removeObject(p);
            removeObject(m);
            removeObject(l);
            removeObject(pravidla);

            addObject(town, 75, 660);
            addObject(village, 75, 570);
            addObject(road, 75, 480);
            addObject(trade, 75, 390);
            addObject(helpIcon, 1130, 340);
            addObject(pirate, 790, 780);
            spustenie = true;
        }
        if (spustenie==true){
            vypisHracInfo();
            vypisKocky();
            presuvaniePirata();
            vymenaSurovin();
            nakupCesty();
        }


    }
    private void nakupCesty() {
        if (Greenfoot.mouseClicked(road))
        {
            Game.players.get(0).buyRoad();

        }

    }

    private void vymenaSurovin() {
        int co = 0;
        int zaco =0;
        if (vymena == 0) {
            removeObject(arrows);
            removeObject(wood);
            removeObject(grain);
            removeObject(stone);
            removeObject(brick);
            removeObject(sheep);
        }
        else if (vymena == 1){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            addObject(arrows,mouse.getX(),mouse.getY()+30);
            arrows.setLocation(mouse.getX(),mouse.getY()+30);
            arrows.setImage("images/sipka.png");
            addObject(wood,30,300);
            addObject(grain,80,300);
            addObject(stone,130,300);
            addObject(brick,180,300);
            addObject(sheep,230,300);
            if (vymena ==1 && Greenfoot.mouseClicked(wood)){
                vymena = 2;
                co = 1;
                removeObject(wood);
            }
            if (vymena ==1 && Greenfoot.mouseClicked(grain)){
                vymena = 2;
                co = 2;
                removeObject(grain);
            }
            if (vymena ==1 && Greenfoot.mouseClicked(stone)){
                vymena = 2;
                co = 3;
                removeObject(stone);
            }
            if (vymena ==1 && Greenfoot.mouseClicked(brick)){
                vymena = 2;
                co = 4;
                removeObject(brick);
            }
            if (vymena ==1 && Greenfoot.mouseClicked(sheep)){
                vymena = 2;
                co = 5;
                removeObject(sheep);
            }
        }
        else if (vymena ==2){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            addObject(arrows,mouse.getX(),mouse.getY()+30);
            arrows.setLocation(mouse.getX(),mouse.getY()+30);
            arrows.setImage("images/sipka_red.png");
            if (vymena ==2 && Greenfoot.mouseClicked(wood)){
                vymena = 0;
                zaco = 1;
            }
            if (vymena ==2 && Greenfoot.mouseClicked(grain)){
                vymena = 0;
                zaco = 2;
            }
            if (vymena ==2 && Greenfoot.mouseClicked(stone)){
                vymena = 0;
                zaco = 3;
            }
            if (vymena ==3 && Greenfoot.mouseClicked(brick)){
                vymena = 0;
                zaco = 4;
            }
            if (vymena ==4 && Greenfoot.mouseClicked(sheep)){
                vymena = 0;
                zaco = 5;
            }

        }

        if (Greenfoot.mouseClicked(trade)&& vymena==0){
            vymena =1;
        }
        else if (Greenfoot.mouseClicked(trade) && vymena==1){
            vymena =0;
        }
        else if (Greenfoot.mouseClicked(trade) && vymena==2){
            vymena =0;
        }


    }

    private void presuvaniePirata() {
        if (pirat_posun == true) {
            if (Greenfoot.mouseDragged(pirate)) {
                MouseInfo mouse = Greenfoot.getMouseInfo();
                pirate.setLocation(mouse.getX(), mouse.getY());
            }

            for (int i = 0; i < 54; i++) {
                Game.countryBlocks.get(i).setPirat(false);
                if (Math.abs(Game.countryBlocks.get(i).getX()-(pirate.getX()))<25 && Math.abs(Game.countryBlocks.get(i).getY()-(pirate.getY()))<25 && Greenfoot.mouseDragEnded(pirate)){
                    pirat_posun = false;
                    pirate.setLocation(Game.countryBlocks.get(i).getX(),Game.countryBlocks.get(i).getY());
                    Game.countryBlocks.get(i).setPirat(true);
                    Game.countryBlocks.get(i).setImage("images/x.png");

                }


            }


        }
    }


    private void vypisKocky() {
        addObject(dice, 220, 60);
        if (Greenfoot.mouseClicked(diceAlert))
        {
            removeObject(diceAlert);
        }
        if(Game.getDice()==7){
            pirat_posun = true;
            Game.setDice(0);
            addObject(diceAlert, 600, 450);
        }
        //drawImage(new GreenfootImage(""+Game.getDice(), 30, null, Color.WHITE), 200, 850);
        if (Game.getDice()==0) {
            showText("Pirat",dice.getX(), dice.getY()-10);
            showText("7",dice.getX(), dice.getY()+10);

        }else{
            showText(" ",dice.getX(),dice.getY());
            showText(""+Game.getDice(),dice.getX(), dice.getY());
        }

    }

    private void vypisHracInfo() {


        GreenfootImage wood = new GreenfootImage("drevo.png");//the image that is drawed;
        GreenfootImage grain = new GreenfootImage("obili.png");//the image that is drawed;
        GreenfootImage stone = new GreenfootImage("kamen.png");//the image that is drawed;
        GreenfootImage brick = new GreenfootImage("cihla.png");//the image that is drawed;
        GreenfootImage sheep = new GreenfootImage("ovce.png");//the image that is drawed;





        getBackground().drawImage(new GreenfootImage(Game.players.get(0).getName(), 35, Color.BLACK, Color.getHSBColor((float) 0.59, (float) 0.80, (float) 0.82)), 10, 10);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(0).getPoints(), 25, Color.BLACK, Color.getHSBColor((float) 0.59, (float) 0.80, (float) 0.82)), 10, 50);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(0).getRoad(), 25, Color.BLACK, Color.getHSBColor((float) 0.59, (float) 0.80, (float) 0.82)), 10, 80);
        getBackground().drawImage(wood, 10, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(0).getResources().get("WOOD"), 25, Color.white, Color.BLACK), 30, 130);
        getBackground().drawImage(grain, 60, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(0).getResources().get("GRAIN"), 25, Color.white, Color.BLACK), 80, 130);
        getBackground().drawImage(stone, 110, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(0).getResources().get("STONE"), 25, Color.white, Color.black), 130, 130);
        getBackground().drawImage(brick, 160, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(0).getResources().get("BRICK"), 25, Color.white, Color.BLACK), 180, 130);
        getBackground().drawImage(sheep, 210, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(0).getResources().get("SHEEP"), 25, Color.white, Color.BLACK), 230, 130);

        getBackground().drawImage(new GreenfootImage(Game.players.get(1).getName(), 35, Color.BLACK, Color.getHSBColor((float) 0.99, (float) 0.92, (float) 0.87)), 10, 760);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(1).getPoints(), 25, Color.black, Color.getHSBColor((float) 0.99, (float) 0.92, (float) 0.87)), 10, 800);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(1).getRoad(), 25, Color.black, Color.getHSBColor((float) 0.99, (float) 0.92, (float) 0.87)), 10, 830);
        getBackground().drawImage(wood, 10, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(1).getResources().get("WOOD"), 25, Color.WHITE, Color.BLACK), 30, 920);
        getBackground().drawImage(grain, 60, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(1).getResources().get("GRAIN"), 25, Color.WHITE, Color.BLACK), 80, 920);
        getBackground().drawImage(stone, 110, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(1).getResources().get("STONE"), 25, Color.WHITE, Color.BLACK), 130, 920);
        getBackground().drawImage(brick, 160, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(1).getResources().get("BRICK"), 25, Color.WHITE, Color.BLACK), 180, 920);
        getBackground().drawImage(sheep, 210, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(1).getResources().get("SHEEP"), 25, Color.WHITE, Color.BLACK), 230, 920);

        getBackground().drawImage(new GreenfootImage(Game.players.get(2).getName(), 35, Color.BLACK, Color.getHSBColor((float) 0.213, (float) 0.73, (float) 0.74)), 940, 10);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(2).getPoints(), 25, Color.BLACK, Color.getHSBColor((float) 0.213, (float) 0.73, (float) 0.74)), 940, 50);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(2).getRoad(), 25, Color.BLACK, Color.getHSBColor((float) 0.213, (float) 0.73, (float) 0.74)), 940, 80);
        getBackground().drawImage(wood, 940, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(2).getResources().get("WOOD"), 25, Color.WHITE, Color.BLACK), 960, 130);
        getBackground().drawImage(grain, 990, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(2).getResources().get("GRAIN"), 25, Color.WHITE, Color.BLACK), 1010, 130);
        getBackground().drawImage(stone, 1040, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(2).getResources().get("STONE"), 25, Color.WHITE, Color.BLACK), 1060, 130);
        getBackground().drawImage(brick, 1090, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(2).getResources().get("BRICK"), 25, Color.WHITE, Color.BLACK), 1110, 130);
        getBackground().drawImage(sheep, 1140, 150);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(2).getResources().get("SHEEP"), 25, Color.WHITE, Color.BLACK), 1160, 130);

        getBackground().drawImage(new GreenfootImage(Game.players.get(3).getName(), 35, Color.WHITE, Color.getHSBColor((float) 0.56, (float) 0.13, (float) 0.24)), 940, 760);
        getBackground().drawImage(new GreenfootImage("Pocet bodov:"+Game.players.get(3).getPoints(), 25, Color.WHITE, Color.getHSBColor((float) 0.56, (float) 0.13, (float) 0.24)), 940, 800);
        getBackground().drawImage(new GreenfootImage("Pocet ciest:"+Game.players.get(3).getRoad(), 25, Color.WHITE, Color.getHSBColor((float) 0.56, (float) 0.13, (float) 0.24)), 940, 830);
        getBackground().drawImage(wood, 940, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(3).getResources().get("WOOD"), 25, Color.WHITE, Color.BLACK), 960, 920);
        getBackground().drawImage(grain, 990, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(3).getResources().get("GRAIN"), 25, Color.WHITE, Color.BLACK), 1010, 920);
        getBackground().drawImage(stone, 1040, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(3).getResources().get("STONE"), 25, Color.WHITE, Color.BLACK), 1060, 920);
        getBackground().drawImage(brick, 1090, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(3).getResources().get("BRICK"), 25, Color.WHITE, Color.BLACK), 1110, 920);
        getBackground().drawImage(sheep, 1140, 870);
        getBackground().drawImage(new GreenfootImage(""+Game.players.get(3).getResources().get("SHEEP"), 25, Color.WHITE, Color.BLACK), 1160, 920);




    }
}
