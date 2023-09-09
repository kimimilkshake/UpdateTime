    
    public static void main(String[] args) {
        AdvancedTime time = new AdvancedTime(3600); // Initialize with 1 hour (3600 seconds)
        time.displayTime12(); // Display in 12-hour format
        time.displayTime24(); // Display in 24-hour format

        time.second(); // Advance by 1 second
        time.displayTime12();
        time.displayTime24();

        time.tickByMinute(); // Advance by 1 minute
        time.displayTime12();
        time.displayTime24();

        time.tickByHour(); 
        time.displayTime12();
        time.displayTime24();

        System.out.println("Time in 12-hour format: " + time.toString());
}