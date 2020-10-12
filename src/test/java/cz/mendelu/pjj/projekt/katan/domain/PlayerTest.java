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
        p_1.trade("Wood","Stone");
        //then
        assertEquals("Wood","Stone");
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
                () -> p_1.trade("Gold", "Iron"));
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void buildRoad() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        //when
        p_1.buildRoad();
        //then
        assertTrue(p_1.buildRoad());
    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void buildVillage() {
        //setup
        Player p_1 = Player.createNewPlayer("Rick");
        //when
        p_1.buildVillage();
        //then
        assertTrue(p_1.buildVillage());
    }


    @Test
    void deletePlayer() {
        //when
        Player p_1 = Player.createNewPlayer("Rick");
        assertEquals(p_1.deletePlayer(),1);

    }
}