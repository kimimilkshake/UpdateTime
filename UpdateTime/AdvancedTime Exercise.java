public class AdvancedTime {
    private int seconds;
    private int minute;
    private int hours;
    private String amPm;

    public AdvancedTime() {
        this.seconds = 0;
        updateFields();
    }

    public AdvancedTime(int seconds) {
        this.seconds = seconds;
        updateFields();
    }

    public AdvancedTime(int hours, int minutes, String amPm) {
        this.hours = hours;
        this.minute = minutes;
        this.amPm = amPm;
        updateSeconds();
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
        updateFields();
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
        updateSeconds();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        updateSeconds();
    }

    public String getAmPm() {
        return amPm;
    }

    public void setAmPm(String amPm) {
        this.amPm = amPm;
        updateSeconds();
    }

    public void second() {
        seconds++;
        updateFields();
    }

    public void tickByMinute() {
        seconds += 60;
        updateFields();
    }

    public void tickByHour() {
        seconds += 3600;
        updateFields();
    }

    public void displayTime12() {
        System.out.printf("%02d:%02d %s%n", hours, minute, amPm);
    }

    public void displayTime24() {
        System.out.printf("%02d:%02d%n", hours, minute);
    }

    public String toString() {
        return String.format("%02d:%02d %s", hours, minute, amPm);
    }

    private void updateFields() {
        hours = (seconds / 3600) % 12;
        minute = (seconds % 3600) / 60;
        amPm = (seconds / 3600) < 12 ? "AM" : "PM";
    }

    private void updateSeconds() {
        seconds = (hours % 12) * 3600 + minute * 60 + (amPm.equals("PM") ? 12 * 3600 : 0);
    }

}
