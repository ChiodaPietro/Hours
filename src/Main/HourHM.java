package Main;

import java.util.InputMismatchException;

public class HourHM extends Hour {
    private int hours;
    private  int minutes;
    public HourHM( int hours, int minutes)throws InputMismatchException {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public int getHours(){
        return hours;
    }
    @Override
    public int getMinutes(){
        return minutes;
    }
    @Override
    public int compareTo(Hour o) {
        return 0;
    }

    @Override
    public boolean equals(Hour o) {
        return false;
    }
}
