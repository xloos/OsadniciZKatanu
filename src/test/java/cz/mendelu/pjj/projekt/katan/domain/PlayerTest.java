package cz.mendelu.pjj.projekt.katan.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void createNewPlayer() {
        //when
        Player p_1 = Player.createNewPlayer("Rick");
        Player p_2 = Player.createNewPlayer("Morty");
        //then
        assertNotSame(p_1,p_2);
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void trade() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        Resources r = new Resources();
        Resources r1 = new Resources();
        //when
        p_1.trade(r,r1);
        //then
        assertNotSame(r,r1);


    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void buildRoad() {
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void buildVillage() {
    }
}