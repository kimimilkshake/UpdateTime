public static void main(String[] args) {
        AdvancedTime time1 = new AdvancedTime(); // Midnight
        time1.displayTime12();
        time1.displayTime24();

        AdvancedTime time2 = new AdvancedTime(3600); //  1 hour 
        time2.displayTime12();
        time2.displayTime24();

        AdvancedTime time3 = new AdvancedTime(3, 30, "PM"); //  3:30 PM
        time3.displayTime12();
        time3.displayTime24();
}
