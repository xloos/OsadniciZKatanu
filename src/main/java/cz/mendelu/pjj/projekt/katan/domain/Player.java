package cz.mendelu.pjj.projekt.katan.domain;

public class Player {

    String name;
    int wood;
    int grain;
    int stone;
    int brick;
    int sheep;
    int points;

    /**
     * Tovární metoda na vytvoření hráče.
     * Metoda vytvoří nového hráče a nastaví atributy resources, buildings a points.
     * @param name si daný hráč zvolí jméno.
     * @return Nového hráče.
     * @author xpavlik
     * @version 1.0.0
     */

    public static Player createNewPlayer(String name){




        throw new UnsupportedOperationException("Not implemented yet.");

    }

    /**
     * Metoda provede výměnu hráčových surovin. Záměna bude v úrčitém poměru, který se předem stanový.
     * @param put surovina, kterou bude hráč měnit.
     * @param get surovina, kterou hráč chce dostat.
     * @throws IndexOutOfBoundsException
     * @author xpavlik
     * @version 1.0.0
     */

    public void trade(String put, String get) {

        throw new UnsupportedOperationException("Not implemented yet.");

    }

    /**
     * Metoda provede výstavbu nové cesty a zjistí zda má daný hráč dostatek surovin na stavbu.
     * @return Metoda vrátí true pokud má hráč všechny potřebné suroviny pro stavbu cesty.
     * @author xpavlik
     * @version 1.0.0
     */

    public boolean buildRoad() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }

    /**
     * Metoda provede výstavbu nové vesnice, pokud má daný hráč dostatek suroviny na výstavbu.
     * @return Metoda vrátí true pokud má hráč všechny potřebné suroviny pro stavbu nové vesnice.
     * @author xpavlik
     * @version 1.0.0
     */
    public boolean buildVillage() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }
    /**
     * Metoda na smazání hráče
     * @return vrátí true pokud byl hráč smazán.
     * @author xpavlik
     * @version 1.0.0
     */

    public boolean deletePlayer() {
        throw new UnsupportedOperationException("Not implemented yet.");

    }




}
