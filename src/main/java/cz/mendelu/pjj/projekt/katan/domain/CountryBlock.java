package cz.mendelu.pjj.projekt.katan.domain;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CountryBlock {

    Map<Integer,Integer> myblock = new HashMap<Integer, Integer>();
    List<Map<Integer , Integer>> myMap  = new ArrayList<Map<Integer,Integer>>();

    private int type;
   private int number;
   private boolean pirat;
   private Buildings buildings;

    public CountryBlock (int c_type_number, int c_number){
        this.type = c_type_number;
        this.number = c_number;
        if (this.type == 5){
            this.pirat = true;
        }
        else{
            this.pirat = false;
        }


    }

    public boolean hasPirate() {
        return this.pirat;
    }

    public void setPirate(boolean m_pirate) {
        this.pirat = m_pirate;
    }
}
