package cz.mendelu.pjj.projekt.katan.domain;

public class CountryBlock {
    int type_number;
    int number;
    boolean pirat;

    public CountryBlock (int c_type_number, int c_number){
        this.type_number = c_type_number;
        this.number = c_number;
        if (this.type_number == 5){
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
