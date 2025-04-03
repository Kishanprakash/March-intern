class Wallet {
    public static void open() { System.out.println("Opening wallet."); }
    public static void close() { System.out.println("Closing wallet."); }
    public static void pay() { Currency.convert(); } 
    public static void secure() { Bitcoin.store(); } 
}
