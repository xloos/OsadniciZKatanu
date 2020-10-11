package cz.mendelu.pjj.projekt.katan.domain;

public class Resources {
    int wood;
    int grain;
    int stone;
    int brick;
    int sheep;

    public Resources() {
        this.wood = 1;
        this.grain = 1;
        this.stone = 1;
        this.brick = 1;
        this.sheep = 1;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public void setGrain(int grain) {
        this.grain = grain;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public void setBrick(int brick) {
        this.brick = brick;
    }

    public void setSheep(int sheep) {
        this.sheep = sheep;
    }

    public int getWood() {
        return wood;
    }

    public int getGrain() {
        return grain;
    }

    public int getStone() {
        return stone;
    }

    public int getBrick() {
        return brick;
    }

    public int getSheep() {
        return sheep;
    }
}

