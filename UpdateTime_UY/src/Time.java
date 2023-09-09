import org.w3c.dom.ls.LSOutput;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds < 60 ? seconds : -1;
        this.minutes = minutes < 60 ? minutes : -1;
        this.hours = hours < 24 ? hours : -1;
        this.meridian = this.hours < 12;

        if(this.seconds == -1 || this.minutes == -1 || this.hours == -1) {
            System.out.println("Invalid input");
        }
    }

    public void advanceTime(int seconds) {
        this.seconds = (this.seconds + seconds) % 60;
    }

    public void tickBySecond() {
        this.seconds = (this.seconds + 1) % 60;

        if(this.seconds == 0) {
            this.minutes = (this.minutes + 1);
        }

        if(this.minutes == 60) {
            this.hours = (this.hours + 1) % 24;
        }

        this.minutes = this.minutes % 60;
    }

    public void tickByMinute() {
        this.minutes = (this.minutes + 1) % 60;

        if(this.minutes == 0) {
            this.hours = (this.hours + 1) % 24;
        }
    }

    public void tickByHour() {
        this.hours = (this.hours + 1) % 24;
    }

    public void displayTime12() {
        if(this.hours >= 12) {
            this.meridian = false; // PM
            System.out.println(this.hours - 12 + ":" + this.minutes + ":" + this.seconds + " " + "PM");
        } else {
            this.meridian = true; // AM
            System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds + " " + "AM");
        }
    }

    public void displayTime24() {
        System.out.println(this.hours + ":" + this.minutes + ":" + this.seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public boolean isMeridian() {
        return meridian;
    }
}
