package cz.mendelu.pjj.projekt.katan.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
        //then
        assertTrue(game.getCountryBlock(5,7).hasPirate());
        assertFalse(game.getCountryBlock(4,8).hasPirate());


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
        assertNotEquals(game_1.diceRoll(player),1);
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
        assertEquals(game_1.diceRoll(player),6);
    }


    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void piratMove_desert() {
        //setup
        Game game = Game.createNewGame();
        CountryBlock countryBlock_1 = game.getCountryBlock(2,2);
        //when
        CountryBlock countryBlock_2 = game.getCountryBlock(5,7);
        game.piratMove(countryBlock_1);
        //then
        assertNotSame(countryBlock_1,countryBlock_2);

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
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void getCountryBlock_block_exist() {
        //setup
        Game game = Game.createNewGame();
        //when
        CountryBlock countryBlock = game.getCountryBlock(1,2);
        //then
        assertNotNull(countryBlock);
    }
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void getCountryBlock_outofrange_type() {
        //setup
        Game game = Game.createNewGame();
        //when
        CountryBlock countryBlock = game.getCountryBlock(6,2);
        //then
        assertNull(countryBlock);
    }
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void getCountryBlock_outofrange_number() {
        //setup
        Game game = Game.createNewGame();
        //when
        CountryBlock countryBlock = game.getCountryBlock(1,13);
        //then
        assertNull(countryBlock);
    }
    /**
     * @author xloos
     * @version 1.0.0
     */
    @Test
    void getCountryBlock_pirate_number() {
        //setup
        Game game = Game.createNewGame();
        //when
        CountryBlock countryBlock = game.getCountryBlock(5,8);
        //then
        assertNull(countryBlock);
    }
}