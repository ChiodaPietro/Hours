package Main;

import java.sql.Struct;
import java.util.InputMismatchException;

public class HourHM  extends  Hour{

    public HourHM(int hours, int minutes) {
        super(hours, minutes);
    }

    @Override
    public int compareTo(Hour o) {
        int tot=(super.getHours()*60)+super.getMinutes();
        if(tot>((o.getHours()*60)+o.getMinutes())){
            return tot-((o.getHours()*60)+o.getMinutes());
        }else
            return ((o.getHours()*60)+o.getMinutes())-tot;
    }

    @Override
    public boolean equals(Hour o) {
        if (super.getHours()==o.getHours()){
            if(super.getMinutes()==o.getMinutes()){
                return true;
            }
        }
        return false;
    }
}
