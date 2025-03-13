class Laptop {
    public static void turnOn() { System.out.println("Laptop is turning on."); }
    public static void turnOff() { System.out.println("Laptop is shutting down."); }
    public static void openBrowser() { System.out.println("Browser is opened."); }
    public static void playMusic() { System.out.println("Playing music."); }
    public static void runProgram() { System.out.println("Running a program."); }

    public static void batteryStatus() { checkBattery(); }
    public static void checkBattery() { System.out.println("Battery at 80%"); }
    public static void connectToWiFi() { System.out.println("Connected to WiFi."); }
    public static void showSpecs() { System.out.println("Intel i7, 16GB RAM, 512GB SSD."); }
    public static void openFile() { System.out.println("Opening a file."); }
}
