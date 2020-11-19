package cz.mendelu.pjj.projekt.katan.domain;

import greenfoot.Actor;
import greenfoot.Greenfoot;
import greenfoot.GreenfootImage;

import java.awt.*;


public class PlayerProfile extends Actor {
    public PlayerProfile() {
        GreenfootImage start = getImage();
        start.setFont(new java.awt.Font("Helvetica", Font.PLAIN, 72));
        start.drawString("Start", 11, 34);
        setImage(start);

    }
}
