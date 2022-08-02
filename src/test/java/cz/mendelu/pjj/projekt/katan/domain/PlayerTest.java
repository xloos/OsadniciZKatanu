package cz.mendelu.pjj.projekt.katan.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Resources;

import java.util.ArrayList;
import java.util.HashMap;

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
        assertNotSame(p_1, p_2);
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void createNewPlayer_duplicity() {
        //when
        Player p_1 = Player.createNewPlayer("Rick");
        //then
        assertNotNull(p_1);
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void trade() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        //when
        p_1.trade(1,1);
        //then
        assertEquals("Wood", "Stone");
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void trade_outOfTrade_string() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        //when + then
        assertThrows(
                IndexOutOfBoundsException.class,
                () -> p_1.trade(1,1));
    }

    /**
     * @author xpavlik
     * @version 1.0.1
     */
    @Test
    void getBlocks_outofrange_type() {
        //setup
        Player p1 = Player.createNewPlayer("Rick");
       // ArrayList<CountryBlock> countryBlocks_1 = p1.getBlocks();
        //when
        CountryBlock cb7 = new CountryBlock(9,3,11);
        //then
        assertNotNull(cb7);
    }
    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void setPoints() {
        Player p1 = Player.createNewPlayer("Rick");
        p1.setPoints(1);
        assertEquals(1, p1.getPoints());
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
   void buydRoad() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        //when
        p_1.buyRoad();
        //then
        assertEquals(1, p_1.getRoad());
    }


}