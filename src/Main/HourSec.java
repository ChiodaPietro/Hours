package Main;

public class HourSec  extends Hour{
    private  int seconds;
   public HourSec(int hours, int minutes, int seconds){
       super(hours, minutes);
       this.seconds=seconds;
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
    public boolean equals(HourSec o) {
        if (getHours()==o.getHours()){
            if(getMinutes()==o.getMinutes()){
                if(seconds==o.getSeconds()){

                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public boolean equals(Hour o){
       if(getHours()==o.getHours()){
           return getMinutes()==o.getMinutes();
       }
       return false;
    }
    public int getSeconds(){
       return seconds;
    }
    @Override
    public String toString(){
       return super.toString()+":"+seconds;
    }
}
