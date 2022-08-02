package cz.mendelu.pjj.projekt.katan.domain;
import greenfoot.Actor;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CountryBlock extends Actor {

    public static Object get;
    private int typ_hraca=0;
    public Map<Integer,Integer> myblock = new HashMap<Integer, Integer>();
    public int typ_krajiny[]= {0,0,0,0};
    public int cislo_policka[]= {0,0,0,0};
    private  int suradnice;
    private boolean pirat;


    private int typ_obydlia =0; //0 = nie je nic postavene, 1 = postavena dedina , 2 = postavene mesto

    public CountryBlock (int c_type_number, int c_number, int c_suradnice){
       this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
        typ_krajiny[0]=c_type_number;
        cislo_policka[0]=c_number;
        setImage("images/build2.png");
    }
    public CountryBlock (int c_type_number, int c_number,int c_type_number1, int c_number1, int c_suradnice){
        this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
        myblock.put(c_type_number1, c_number1);
        typ_krajiny[0]=c_type_number;
        cislo_policka[0]=c_number;
        typ_krajiny[1]=c_type_number1;
        cislo_policka[1]=c_number1;
        setImage("images/build2.png");
    }

    public CountryBlock (int c_type_number, int c_number,int c_type_number1, int c_number1,int c_type_number2, int c_number2, int c_suradnice){
        this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
        myblock.put(c_type_number1, c_number1);
        myblock.put(c_type_number2, c_number2);
        typ_krajiny[0]=c_type_number;
        cislo_policka[0]=c_number;
        typ_krajiny[1]=c_type_number1;
        cislo_policka[1]=c_number1;
        typ_krajiny[2]=c_type_number2;
        cislo_policka[2]=c_number2;
        setImage("images/build2.png");
    }


    public void setMyblock(Map<Integer, Integer> myblock) {
        this.myblock = myblock;
    }

    public void setSuradnice(int suradnice) {
        this.suradnice = suradnice;
    }

    public void setPirat(boolean pirat) {
        this.pirat = pirat;
    }

    public void setTyp_obydla(int typ_obydla) {
        this.typ_obydlia = typ_obydla;
    }

    public Map<Integer, Integer> getMyblock() {
        return myblock;
    }

    public int getSuradnice() {
        return suradnice;
    }

    public boolean isPirat() {
        return pirat;
    }

    public int getTyp_obydla() {
        return typ_obydlia;
    }

    public boolean hasPirate() {
        return this.pirat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CountryBlock that = (CountryBlock) o;
        return suradnice == that.suradnice &&
                pirat == that.pirat &&
                typ_obydlia == that.typ_obydlia &&
                Objects.equals(myblock, that.myblock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myblock, suradnice, pirat, typ_obydlia);
    }

    @Override
    public String toString() {
        return "CountryBlock{" +
                "myblock=" + myblock +
                ", suradnice=" + suradnice +
                ", pirat=" + pirat +
                ", typ_obydlia=" + typ_obydlia +
                '}';
    }

    @Override
    public void act() {
        super.act();
    }

    public int getTyp_hraca() {
        return typ_hraca;
    }
    public void setTyp_hraca(int typ_hraca) {
        this.typ_hraca = typ_hraca;
    }
}
