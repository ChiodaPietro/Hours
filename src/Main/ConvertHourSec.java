package Main;

public class ConvertHourSec extends HourSec implements Convert {
    public ConvertHourSec(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds);
    }

    @Override
    public double convert(HourSec[] hourSecs) {
        double tot =0;
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
