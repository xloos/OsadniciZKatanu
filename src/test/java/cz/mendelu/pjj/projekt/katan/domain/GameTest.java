package cz.mendelu.pjj.projekt.katan.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void createNewGame() {
        //when
        Game game = Game.createNewGame();
        ArrayList<CountryBlock> countryBlocks_1 = game.getCountryBlocks();
        //then
        CountryBlock cb46 = new CountryBlock(5,7,46);
        countryBlocks_1.add(cb46);
        CountryBlock cb16 = new CountryBlock(2,11,16);
        countryBlocks_1.add(cb16);
        assertTrue(cb46.hasPirate());
        assertFalse(cb16.hasPirate());


    }
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void createNewGame_duplicity() {
        //when
        Game game_1 = Game.createNewGame();
        Game game_2 = Game.createNewGame();
        //then
        assertNotSame(game_1,game_2);


    }

    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void diceRoll_outofrange() {
        //when
        Game game_1 = Game.createNewGame();
        Player player = Player.createNewPlayer("Joe");
        //then
        assertNotEquals(game_1.diceRoll(),1);
    }
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void diceRoll() {
        //when
        Game game_1 = Game.createNewGame();
        Player player = Player.createNewPlayer("Joe");
        //then
        assertEquals(game_1.diceRoll(),6);
    }


    /**
     * @author xloos
     * @version 1.0.1
     */
    @Test
    void piratMove_desert() {
        //setup
        Game game = Game.createNewGame();
        ArrayList<CountryBlock> countryBlocks_1 = game.getCountryBlocks();
        CountryBlock cb16 = new CountryBlock(2,11,16);
        countryBlocks_1.add(cb16);
        CountryBlock cb17 = new CountryBlock(2,11,16);
        countryBlocks_1.add(cb17);
        //when
        ArrayList<CountryBlock> countryBlock_2 = game.getCountryBlocks();
        game.piratMove(cb16);

        //then
        assertNotSame(cb16,cb17);

    }

    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void endGame() {
        //when
        Game game = Game.createNewGame();
        assertEquals(game.endGame(),1);

    }

    /**
     * @author xpavlik
     * @version 1.0.0
     */
    @Test
    void endGame_duplicity() {
        //setup
        Game game = Game.createNewGame();
        //when
        game.endGame();
        //then
        assertTrue(game.endGame());
    }


    /**
     * @author xloos
     * @version 1.0.1
     */
    @Test
    void getCountryBlock_block_exist() {
        //setup
        Game game = Game.createNewGame();
        ArrayList<CountryBlock> countryBlocks_1 = game.getCountryBlocks();
        //when
        CountryBlock cb25 = new CountryBlock(2,11,54);
        //then
        assertNull(cb25);
    }
    /**
     * @author xloos
     * @version 1.0.1
     */
    @Test
    void getCountryBlock_outofrange_type() {
        //setup
        Game game = Game.createNewGame();
        ArrayList<CountryBlock> countryBlocks_1 = game.getCountryBlocks();
        //when
        CountryBlock cb10 = new CountryBlock(12,5,12);
        //then
        assertNotNull(cb10);
    }
    /**
     * @author xloos
     * @version 1.0.1
     */
    @Test
    void getCountryBlock_outofrange_number() {
        //setup
        Game game = Game.createNewGame();
        ArrayList<CountryBlock> countryBlocks_1 = game.getCountryBlocks();
        //when
        CountryBlock cb5 = new CountryBlock(2,25,22);
        //then
        assertNotNull(cb5);
    }
}