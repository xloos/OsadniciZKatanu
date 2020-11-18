package cz.mendelu.pjj.projekt.katan.greenfoot;

import cz.mendelu.pjj.projekt.katan.domain.Game;
import greenfoot.World;
import java.util.ArrayList;

public class CatanWorld extends World {

    public CatanWorld() {
        //super(1456, 1154, 1) originalna velkost
        super(1198, 950, 1);
        setBackground("images/mapa2.jpg");
        Game.createNewGame();
        addObject(Game.countryBlocks.get(0), 365,147);
        addObject(Game.countryBlocks.get(1), 450,99);
        addObject(Game.countryBlocks.get(2), 535,147);


    }
}
