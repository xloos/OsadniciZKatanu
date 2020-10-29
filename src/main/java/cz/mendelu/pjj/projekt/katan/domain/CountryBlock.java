package cz.mendelu.pjj.projekt.katan.domain;
import java.util.HashMap;
import java.util.Map;
public class CountryBlock {

    public static Object get;
    Map<Integer,Integer> myblock = new HashMap<Integer, Integer>();
    private  int suradnice;
    private boolean pirat;
    private int typ_obydlia =0; //0 = nie je nic postavene, 1 = postavena dedina , 2 = postavene mesto

    public CountryBlock (int c_type_number, int c_number, int c_suradnice){
       this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
    }
    public CountryBlock (int c_type_number, int c_number,int c_type_number1, int c_number1, int c_suradnice){
        this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
        myblock.put(c_type_number1, c_number1);
    }

    public CountryBlock (int c_type_number, int c_number,int c_type_number1, int c_number1,int c_type_number2, int c_number2, int c_suradnice){
        this.suradnice = c_suradnice;
        myblock.put(c_type_number, c_number);
        myblock.put(c_type_number1, c_number1);
        myblock.put(c_type_number2, c_number2);
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

    public void setPirate(boolean m_pirate) {
        this.pirat = m_pirate;
    }
}
