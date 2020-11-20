package cz.mendelu.pjj.projekt.katan.domain;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;
import greenfoot.World;
import java.awt.*;


public class DiceAlert extends Actor {
    public DiceAlert() {
        String text = " Zadal si 7 mozes posuvat pirata ";
        GreenfootImage inner = new GreenfootImage(text, 48, Color.black, new Color(200, 200, 200, 200));
        setImage(inner);
    }
}
