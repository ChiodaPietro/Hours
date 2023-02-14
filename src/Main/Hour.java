package Main;

public abstract class Hour {
    private int hours;
    private int minutes;
    public Hour(int hours, int minutes){
        this.hours=controlHH(hours);
        this.minutes=controlMM(minutes);
    }

    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    private int controlHH(int hours){
        if(hours<0||hours>23){
            return 0;
        }
        return hours;
    }
    private int controlMM(int minutes){
        if(minutes<0|| minutes>59){
            return 0;
        }
        return minutes;
    }
    public void setHours(int hours){
        this.hours=hours;
    }
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public String toString(){
        return hours+ ":"+minutes;
    }
    public abstract int compareTo(Hour o);
    public abstract boolean equals(Hour o);
    public abstract boolean equals(HourSec o);
}
