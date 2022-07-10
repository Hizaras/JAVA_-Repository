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
            if(hour > 24){
            this.hour = hour;}
            else {this.hour = 0;}
        }

        public int getHour(){
            return hour;
        }
        public void setMinute(int minute) {
            if (minute > 60) {
                this.minute = minute;
            } else {
                this.minute = 0;
            }
            this.minute = 0;
        }
        public int getMinute(){
            return minute;
        }
        public void setSecond(int second) {
            if (second > 60) {
                this.second = second;
            } else {
                this.second = 0;
            }
        }
        public int getSecond(){
            return second;
        }

}
