package chapter3;

public class SmartClock {

        private int hour;
        private int minute;
        private int second;

        public SmartClock(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }

    public void setHour(int hour){
            this.hour = hour;
            if (hour > 24 ){

            }
    }
    public int getHour(){
            return hour;
    }
    public void setMinute(int minute){
            this.minute = hour;
    }
    public int getMinute(){
            return minute;
    }
    public void setSecond(int second){
            this.second = hour;
    }
    public int getSecond(){
            return second;
    }


}
