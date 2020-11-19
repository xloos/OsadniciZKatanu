package cz.mendelu.pjj.projekt.katan.greenfoot;

import cz.mendelu.pjj.projekt.katan.domain.*;
import greenfoot.Greenfoot;
import greenfoot.World;

public class CatanWorld extends World {

    PlayButton p = new PlayButton();
    Menu m = new Menu();
    ListButton l = new ListButton();
    Rules pravidla = new Rules();

    public CatanWorld() {
        //super(1456, 1154, 1) originalna velkost
        super(1198, 950, 1);
        setBackground("images/mapa2.jpg");
        Game.createNewGame();
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
        addObject(pravidla, 599,475);

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
        if (Greenfoot.mouseClicked(p))
        {
            removeObject(p);
            removeObject(m);
            removeObject(l);
            removeObject(pravidla);
            Game.createNewGame();
        }

    }
}
