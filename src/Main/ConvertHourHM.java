package Main;

import java.util.InputMismatchException;

public class ConvertHourHM extends HourHM implements Convert{
    public ConvertHourHM(int hours, int minutes) throws InputMismatchException {
        super(hours,minutes);
    }
    @Override
    public double convert(HourSec[] hourSecs){
        double tot=0;
        for (int i = 0; i < hourSecs.length; i++) {
            tot+=((hourSecs[i].getHours()*60)*60);
            tot+=(hourSecs[i].getMinutes()*60);
            tot+=hourSecs[i].getSeconds();
        }
        return tot;
    }

    @Override
    public double convert(HourHM[] hourHM) {
        double tot =0;
        for (int i = 0; i < hourHM.length; i++) {
            tot+=(hourHM[i].getHours()*60);
            tot+=(hourHM[i].getMinutes());
        }
        return tot;
    }

}
