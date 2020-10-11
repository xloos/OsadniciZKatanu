package cz.mendelu.pjj.projekt.katan.domain;

public class Player {

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
     * Metoda provede výměnu Resources. Záměna bude v úrčitém poměru, který se předem stanový.
     * @param put Resources, které bude hráč měnit.
     * @param get Resources, které hráč chce dostat.
     * @author xpavlik
     * @version 1.0.0
     */

    public void trade(Resources put, Resources get) {

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





}
