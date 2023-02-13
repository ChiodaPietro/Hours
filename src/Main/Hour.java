package Main;

public abstract class Hour {
    private int hours;
    private int minutes;
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public void setHours(int hours){
        this.hours=hours;
    }
    public void setMinutes(int minutes){
        this.minutes=minutes;
    }
    public String toString(){
        return "hours:"+hours+ "  minutes:"+minutes;
    }
    public abstract int compareTo(Hour o);
    public abstract boolean equals(Hour o);
}
