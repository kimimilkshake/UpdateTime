public class Main {

    public static void main(String[] args) {
        Time t1 = new Time(09,0,0);

        t1.displayTime24();
        t1.displayTime12();

        t1.tickBySecond();

        t1.displayTime24();
        t1.displayTime12();

        t1.tickByMinute();

        t1.displayTime24();
        t1.displayTime12();

        t1.tickByHour();

        t1.displayTime24();
        t1.displayTime12();
    }

}