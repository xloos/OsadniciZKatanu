package cz.mendelu.pjj.projekt.katan.domain;

import bh.greenfoot.runner.GreenfootRunner;
import cz.mendelu.pjj.projekt.katan.greenfoot.CatanWorld;
import greenfoot.Greenfoot;
import greenfoot.World;

public class Runner extends GreenfootRunner {

    static {
        bootstrap(Runner.class,
                Configuration.forWorld(CatanWorld.class)
                .projectName("CATAN"));

       // .hideControls(false)); zatail necham zapnute controls

    }

    public static void main(String[] args) {

        GreenfootRunner.main(args);
        //Game.createNewGame();



    }





}
