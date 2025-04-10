package com.xworkz.tostring.Runner;

import com.xworkz.tostring.Internal.*;


public class MainRunner {
    public static void main(String[] args) {
        System.out.println("1-------------");
        Fan fan = new Fan("Ceiling", 1500, 100);
        System.out.println("Fan Details =" + fan);
        System.out.println("the code is " + fan.hashCode());
        System.out.println("the real code is " + System.identityHashCode(fan));
        System.out.println("2---------------");

        Light light = new Light("Philips", "Tubelight", 250);
        System.out.println("Light Details =" + light);
        System.out.println("the code is " + light.hashCode());
        System.out.println("the real code is " + System.identityHashCode(light));
        System.out.println("3----------------");

        Shirt shirt = new Shirt("Allen Solly", "pink", 1299);
        System.out.println("Shirt details=" + shirt);
        System.out.println("the code is " + shirt.hashCode());
        System.out.println("the real code is " + System.identityHashCode(shirt));
        System.out.println("4-----------------");

        Pant pant = new Pant("MudWear", "Grey", 1799);
        System.out.println("Pant details=" + pant);
        System.out.println("the code is " + pant.hashCode());
        System.out.println("the real code is " + System.identityHashCode(pant));
        System.out.println("5-------------------");

        Bag bag = new Bag("SkyBags", "Black", 25);
        System.out.println("Bag details=" + bag);
        System.out.println("the code is " + bag.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bag));
        System.out.println("6-------------------");

        Book book = new Book("Classmate", 100, 100);
        System.out.println("Book Details " + book);
        System.out.println("the code is " + book.hashCode());
        System.out.println("the real code is " + System.identityHashCode(book));
        System.out.println("7--------------------");

        IceCream icecream = new IceCream("Amul", "Vanilla", 150);
        System.out.println("Icecream Details " + icecream);
        System.out.println("the code is " + icecream.hashCode());
        System.out.println("the real code is " + System.identityHashCode(icecream));
        System.out.println("8-------------------");

        Zoo zoo = new Zoo("Pilikula", "Rohan", 50);
        System.out.println("Zoo Details " + zoo);
        System.out.println("the code is " + zoo.hashCode());
        System.out.println("the real code is " + System.identityHashCode(zoo));
        System.out.println("9---------------------");

        TV tv = new TV("Sharp", 24, 15000);
        System.out.println("TV Details " + tv);
        System.out.println("the code is " + tv.hashCode());
        System.out.println("the real code is " + System.identityHashCode(tv));
        System.out.println("10----------------------");

        Cake cake = new Cake("JustBake", "ButtreScotch", 500);
        System.out.println("Cake Details " + cake);
        System.out.println("the code is " + cake.hashCode());
        System.out.println("the real code is " + System.identityHashCode(cake));
        System.out.println("11---------------------");

        Samosa samosa = new Samosa("Chat", "Traingle", 25);
        System.out.println("Samosa Details " + samosa);
        System.out.println("the code is " + samosa.hashCode());
        System.out.println("the real code is " + System.identityHashCode(samosa));
        System.out.println("12----------------------");

        Language language = new Language("Tulu", "Mangalore", 1000);
        System.out.println("Language Details " + language);
        System.out.println("the code is " + language.hashCode());
        System.out.println("the real code is " + System.identityHashCode(language));
        System.out.println("13---------------------");

        BMTC bmtc = new BMTC("Bangalore", "Attiguppe", 12);
        System.out.println("BMTC Deatils " + bmtc);
        System.out.println("the code is " + bmtc.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bmtc));
        System.out.println("14---------------------");

        WoodenBox woodenBox = new WoodenBox("wood", "square", 1);
        System.out.println("Wooden Box Details " + woodenBox);
        System.out.println("the code is " + woodenBox.hashCode());
        System.out.println("the real code is " + System.identityHashCode(woodenBox));
        System.out.println("15----------------------");

        Bottle bottle = new Bottle("Milton", "White", 2);
        System.out.println("Bottle Details " + bottle);
        System.out.println("the code is " + bottle.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bottle));
        System.out.println("16---------------------");

        Park park = new Park("HBCS Park", "ChandraLayout", 1750);
        System.out.println("Park Details :" + park);
        System.out.println("the code is " + park.hashCode());
        System.out.println("the real code is " + System.identityHashCode(park));
        System.out.println("17-----------------------");

        Laptop laptop = new Laptop("Asus", "i7", 55000);
        System.out.println("Laptop Details " + laptop);
        System.out.println("the code is " + laptop.hashCode());
        System.out.println("the real code is " + System.identityHashCode(laptop));
        System.out.println("18------------------------");

        Mobile mobile = new Mobile("Oppo", "A37", 19900);
        System.out.println("Mobile Details " + mobile);
        System.out.println("the code is " + mobile.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mobile));
        System.out.println("19-------------------------");

        KeyBoard keyBoard = new KeyBoard("Zebronics", 108, 599);
        System.out.println("Keyboard Details " + keyBoard);
        System.out.println("the code is " + keyBoard.hashCode());
        System.out.println("the real code is " + System.identityHashCode(keyBoard));
        System.out.println("20--------------------------");

        Shoe shoe = new Shoe("WoodLand", 11, 2199);
        System.out.println("Shoe Details " + shoe);
        System.out.println("the code is " + shoe.hashCode());
        System.out.println("the real code is " + System.identityHashCode(shoe));
        System.out.println("21-------------------------");

        Console console = new Console("PS5", "Microsoft", 25000);
        System.out.println("Console Details " + console);
        System.out.println("the code is " + console.hashCode());
        System.out.println("the real code is " + System.identityHashCode(console));
        System.out.println("22------------------------");

        Bed bed = new Bed("Foldable", "sponge", 699);
        System.out.println("Bed Details " + bed);
        System.out.println("the code is " + bed.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bed));
        System.out.println("23------------------------");

        Metro metro = new Metro("bangalore", "purple", 10);
        System.out.println("Metro Details " + metro);
        System.out.println("the code is " + metro.hashCode());
        System.out.println("the real code is " + System.identityHashCode(metro));
        System.out.println("24---------------------------");

        Money money = new Money("INR", "India", 100);
        System.out.println("Money Details " + money);
        System.out.println("the code is " + money.hashCode());
        System.out.println("the real code is " + System.identityHashCode(money));
        System.out.println("25----------------------------");

        Bank bank = new Bank("Karnatak Bank", "Bangalore", 150000);
        System.out.println("Bank Details " + bank);
        System.out.println("the code is " + bank.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bank));
        System.out.println("26----------------------------");

        ATM atm = new ATM("BOB", "Mangalore", 10001);
        System.out.println("ATM Details " + atm);
        System.out.println("the code is " + atm.hashCode());
        System.out.println("the real code is " + System.identityHashCode(atm));
        System.out.println("27------------------------------");

        PetrolPump petrolPump = new PetrolPump("Pumpwell", "highPower", 101);
        System.out.println("Petrol Pump Details " + petrolPump);
        System.out.println("the code is " + petrolPump.hashCode());
        System.out.println("the real code is " + System.identityHashCode(petrolPump));
        System.out.println("28--------------------------------");

        SunGlasses sunGlasses = new SunGlasses("Vision", "black", 1299);
        System.out.println("SunGlasses Details " + sunGlasses);
        System.out.println("the code is " + sunGlasses.hashCode());
        System.out.println("the real code is " + System.identityHashCode(sunGlasses));
        System.out.println("29---------------------------------");

        Scooter scooter = new Scooter("Honda", "Activa 6g", 120000);
        System.out.println("Scooter details " + scooter);
        System.out.println("the code is " + scooter.hashCode());
        System.out.println("the real code is " + System.identityHashCode(scooter));
        System.out.println("30---------------------------------");

        Lamp lamp = new Lamp("Hanging", "yellow", 150);
        System.out.println("Lamp Details " + lamp);
        System.out.println("the code is " + lamp.hashCode());
        System.out.println("the real code is " + System.identityHashCode(lamp));
        System.out.println("31-----------------------------------");

        Stand stand = new Stand("Wooden", "brown", 1599);
        System.out.println("Stand Details " + stand);
        System.out.println("the code is " + stand.hashCode());
        System.out.println("the real code is " + System.identityHashCode(stand));
        System.out.println("32-----------------------------------");

        Remote remote = new Remote("Sony", "black", 250);
        System.out.println("Remote Details " + remote);
        System.out.println("the code is " + remote.hashCode());
        System.out.println("the real code is " + System.identityHashCode(remote));
        System.out.println("33------------------------------------");

        Battery battery = new Battery("Lithium-ion", "Duracell", 9);
        System.out.println("battery details " + battery);
        System.out.println("the code is " + battery.hashCode());
        System.out.println("the real code is " + System.identityHashCode(battery));
        System.out.println("34-----------------------------------");

        Tshirt tshirt = new Tshirt("USPOLO", "red", 1100);
        System.out.println("Tshirt Details " + tshirt);
        System.out.println("the code is " + tshirt.hashCode());
        System.out.println("the real code is " + System.identityHashCode(tshirt));
        System.out.println("35------------------------------------");

        Chess chess = new Chess("Wooden", "white", 200);
        System.out.println("Chess Details " + chess);
        System.out.println("the code is " + chess.hashCode());
        System.out.println("the real code is " + System.identityHashCode(chess));
        System.out.println("36------------------------------------");

        Pen pen = new Pen("Cello", "blue", 10);
        System.out.println("Pen details " + pen);
        System.out.println("the code is " + pen.hashCode());
        System.out.println("the real code is " + System.identityHashCode(pen));
        System.out.println("37------------------------------------");

        Pencil pencil = new Pencil("Natraj", "Penpencil", 15);
        System.out.println("Pencil Details " + pencil);
        System.out.println("the code is " + pencil.hashCode());
        System.out.println("the real code is " + System.identityHashCode(pencil));
        System.out.println("38------------------------------------");

        Chappal chappal = new Chappal("Slippers", "M", 150);
        System.out.println("Chappal Details " + chappal);
        System.out.println("the code is " + chappal.hashCode());
        System.out.println("the real code is " + System.identityHashCode(chappal));
        System.out.println("39-------------------------------------");

        Driver driver = new Driver("Vijay", "89990", 5);
        System.out.println("Driver Details " + driver);
        System.out.println("the code is " + driver.hashCode());
        System.out.println("the real code is " + System.identityHashCode(driver));
        System.out.println("40-------------------------------------");

        Table table = new Table("Round", "Plastic", 15000);
        System.out.println("Table Details " + table);
        System.out.println("the code is " + table.hashCode());
        System.out.println("the real code is " + System.identityHashCode(table));
        System.out.println("41--------------------------------------");

        Watch watch = new Watch("Titan", "casual", 9000);
        System.out.println("Watch Details " + watch);
        System.out.println("the code is " + watch.hashCode());
        System.out.println("the real code is " + System.identityHashCode(watch));
        System.out.println("42---------------------------------------");

        Oven oven = new Oven("Electric", 50, 15000);
        System.out.println("Oven Details " + oven);
        System.out.println("the code is " + oven.hashCode());
        System.out.println("the real code is " + System.identityHashCode(oven));
        System.out.println("43-----------------------------------------");

        Speaker speaker = new Speaker("JBL", "Soundbar", 399);
        System.out.println("Speaker Details " + speaker);
        System.out.println("the code is " + speaker.hashCode());
        System.out.println("the real code is " + System.identityHashCode(speaker));
        System.out.println("44-------------------------------------------");

        HeadPhone headPhone = new HeadPhone("Boat", "Earbuds", 1299);
        System.out.println("headphone details " + headPhone);
        System.out.println("the code is " + headPhone.hashCode());
        System.out.println("the real code is " + System.identityHashCode(headPhone));
        System.out.println("45---------------------------------------------");

        NoteBook noteBook = new NoteBook("Doms", 200, "Long");
        System.out.println("NoteBook Details " + noteBook);
        System.out.println("the code is " + noteBook.hashCode());
        System.out.println("the real code is " + System.identityHashCode(noteBook));
        System.out.println("46---------------------------------------------");

        Socks socks = new Socks("Jockey", "black", 80);
        System.out.println("Socks details " + socks);
        System.out.println("the code is " + socks.hashCode());
        System.out.println("the real code is " + System.identityHashCode(socks));
        System.out.println("47----------------------------------------------");

        Wallet wallet = new Wallet("Titan", "Leather", 5000);
        System.out.println("Wallet Details " + wallet);
        System.out.println("the code is " + wallet.hashCode());
        System.out.println("the real code is " + System.identityHashCode(wallet));
        System.out.println("48-----------------------------------------------");

        ToothPaste toothPaste = new ToothPaste("Colgate", "menthol", 50);
        System.out.println("Toothpaste details " + toothPaste);
        System.out.println("the code is " + toothPaste.hashCode());
        System.out.println("the real code is " + System.identityHashCode(toothPaste));
        System.out.println("49------------------------------------------------");

        Soap soap = new Soap("Santoor", "BarSaop", 35);
        System.out.println("Soap Details " + soap);
        System.out.println("the code is " + soap.hashCode());
        System.out.println("the real code is " + System.identityHashCode(soap));
        System.out.println("50------------------------------------------------");

        Drone drone = new Drone("Samsung", "HD", 19000);
        System.out.println("Drone Details " + drone);
        System.out.println("the code is " + drone.hashCode());
        System.out.println("the real code is " + System.identityHashCode(drone));
        System.out.println("51------------------------------------------------");

        Belt belt = new Belt("Leather", "Large", 500);
        System.out.println("Belt Details " + belt);
        System.out.println("the code is " + belt.hashCode());
        System.out.println("the real code is " + System.identityHashCode(belt));
        System.out.println("52-------------------------------------------------");

        Torch torch = new Torch("Nippon", 300, 250);
        System.out.println("Torch Details " + torch);
        System.out.println("the code is " + torch.hashCode());
        System.out.println("the real code is " + System.identityHashCode(torch));
        System.out.println("53-------------------------------------------------");

        PowerBank powerBank = new PowerBank("Vivo", 20000, 1799);
        System.out.println("PowerBan Details " + powerBank);
        System.out.println("the code is " + powerBank.hashCode());
        System.out.println("the real code is " + System.identityHashCode(powerBank));
        System.out.println("54--------------------------------------------------");

        IronBox ironBox = new IronBox("Philips", 20, 990);
        System.out.println("Iron Box Details " + ironBox);
        System.out.println("the code is " + ironBox.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ironBox));
        System.out.println("55---------------------------------------------------");

        Clock clock = new Clock("Sonata", "Fashion", 660);
        System.out.println("Clock Details " + clock);
        System.out.println("the code is " + clock.hashCode());
        System.out.println("the real code is " + System.identityHashCode(clock));
        System.out.println("56----------------------------------------------------");

        Ticket ticket = new Ticket("MCStan Concert", "25/4", 2000);
        System.out.println("Ticket Details " + ticket);
        System.out.println("the code is " + ticket.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ticket));
        System.out.println("57-----------------------------------------------------");

        Coin coin = new Coin("Pice", "Gold", 1902);
        System.out.println("Coin Details " + coin);
        System.out.println("the code is " + coin.hashCode());
        System.out.println("the real code is " + System.identityHashCode(coin));
        System.out.println("58-----------------------------------------------------");

        Pharmacy pharmacy = new Pharmacy("Mediplus", "Nayandalli", 4);
        System.out.println("Pharamacy Details " + pharmacy);
        System.out.println("the code is " + pharmacy.hashCode());
        System.out.println("the real code is " + System.identityHashCode(pharmacy));
        System.out.println("59------------------------------------------------------");

        Mouse mouse = new Mouse("Artic Fox", "Wired", 249);
        System.out.println("Mouse Details " + mouse);
        System.out.println("the code is " + mouse.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mouse));
        System.out.println("60--------------------------------------------------------");

        Fridge fridge = new Fridge("LG", 30, 50000);
        System.out.println("Fridge Details " + fridge);
        System.out.println("the code is " + fridge.hashCode());
        System.out.println("the real code is " + System.identityHashCode(fridge));
        System.out.println("61----------------------------------------------------------");

        Towel towel = new Towel("Cotton", "White", 150);
        System.out.println("Towel details " + towel);
        System.out.println("the code is " + towel.hashCode());
        System.out.println("the real code is " + System.identityHashCode(towel));
        System.out.println("62------------------------------------------------------------");

        USB usb = new USB("SanDisk", 64, "USB 3.0");
        System.out.println("USB Details " + usb);
        System.out.println("the code is " + usb.hashCode());
        System.out.println("the real code is " + System.identityHashCode(usb));
        System.out.println("63------------------------------------------------------------");

        Wire wire = new Wire("Copper", 10, "Red");
        System.out.println("Wire details " + wire);
        System.out.println("the code is " + wire.hashCode());
        System.out.println("the real code is " + System.identityHashCode(wire));
        System.out.println("64------------------------------------------------------------");

        Shampoo shampoo = new Shampoo("Head & Shoulders", 180, "Mint");
        System.out.println("Shampoo Details " + shampoo);
        System.out.println("the code is " + shampoo.hashCode());
        System.out.println("the real code is " + System.identityHashCode(shampoo));
        System.out.println("65------------------------------------------------------------");

        Helmet helmet = new Helmet("Vega", "M", "Red");
        System.out.println("Helmat Details " + helmet);
        System.out.println("the code is " + helmet.hashCode());
        System.out.println("the real code is " + System.identityHashCode(helmet));
        System.out.println("66-------------------------------------------------------------");

        Printer printer = new Printer("HP", true, 20);
        System.out.println("Printer Details " + printer);
        System.out.println("the code is " + printer.hashCode());
        System.out.println("the real code is " + System.identityHashCode(printer));
        System.out.println("67------------------------------------------------------------");

        Camera camera = new Camera("Canon", 24, true);
        System.out.println("Camera Details " + camera);
        System.out.println("the code is " + camera.hashCode());
        System.out.println("the real code is " + System.identityHashCode(camera));
        System.out.println("68-------------------------------------------------------------");

        Mat mat = new Mat("Rubber", "Rectangle", 5);
        System.out.println("Mat Details " + mat);
        System.out.println("the code is " + mat.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mat));
        System.out.println("69--------------------------------------------------------------");

        Dustbin bin = new Dustbin("Plastic", 15, "Green");
        System.out.println("Dustbin details "+bin);
        System.out.println("the code is " + bin.hashCode());
        System.out.println("the real code is " + System.identityHashCode(bin));
        System.out.println("70---------------------------------------------------------------");

        Mixer mixer = new Mixer("Preethi", 3, 3200);
        System.out.println("Mixer Details "+mixer);
        System.out.println("the code is " + mixer.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mixer));
        System.out.println("71---------------------------------------------------------------");

        LunchBox box = new LunchBox("Cello", 3, 600);
        System.out.println("LunchBox Details "+box);
        System.out.println("the code is " + box.hashCode());
        System.out.println("the real code is " + System.identityHashCode(box));
        System.out.println("72-----------------------------------------------------------------");

        Calender calender = new Calender("2025", "Nature", 150);
        System.out.println("Calender Details "+calender);
        System.out.println("the code is " + calender.hashCode());
        System.out.println("the real code is " + System.identityHashCode(calender));
        System.out.println("73------------------------------------------------------------------");

        Mug mug = new Mug("Ceramic", "Blue", 250);
        System.out.println("Mug Details "+mug);
        System.out.println("the code is " + mug.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mug));
        System.out.println("74----------------------------------------------------------------");

        Mirror mirror = new Mirror("Oval", 60, 900);
        System.out.println("Mirror Details "+mirror);
        System.out.println("the code is " + mirror.hashCode());
        System.out.println("the real code is " + System.identityHashCode(mirror));
        System.out.println("75----------------------------------------------------------------");

        Plate plate = new Plate("Steel", 28, 120);
        System.out.println("Plate Details "+plate);
        System.out.println("the code is " + plate.hashCode());
        System.out.println("the real code is " + System.identityHashCode(plate));
        System.out.println("76-----------------------------------------------------------------");

        Stapler stapler = new Stapler("Kangaroo", 100, 90);
        System.out.println("Stapler Details "+stapler);
        System.out.println("the code is " + stapler.hashCode());
        System.out.println("the real code is " + System.identityHashCode(stapler));
        System.out.println("77-----------------------------------------------------------------");

        Cap cap = new Cap("Black", "Puma", 500);
        System.out.println("Cap Details "+cap);
        System.out.println("the code is " + cap.hashCode());
        System.out.println("the real code is " + System.identityHashCode(cap));
        System.out.println("78-------------------------------------------------------------------");

        Umbrella umbrella = new Umbrella("Blue", 60, 350);
        System.out.println("Umbrella Details "+umbrella);
        System.out.println("the code is " + umbrella.hashCode());
        System.out.println("the real code is " + System.identityHashCode(umbrella));
        System.out.println("78---------------------------------------------------------------------");

        Charger ch = new Charger("Samsung", 25, 1200);
        System.out.println("Charger Details "+ch);
        System.out.println("the code is " + ch.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ch));
        System.out.println("79--------------------------------------------------------------------");

        Marker marker = new Marker("Blue", "Faber-Castell", 30);
        System.out.println("Marker details"+marker);
        System.out.println("the code is " + marker.hashCode());
        System.out.println("the real code is " + System.identityHashCode(marker));
        System.out.println("80----------------------------------------------------------------------");

        Sofa sofa = new Sofa("Leather", 3, 9500);
        System.out.println("Sofa Details "+sofa);
        System.out.println("the code is " + sofa.hashCode());
        System.out.println("the real code is " + System.identityHashCode(sofa));
        System.out.println("81-----------------------------------------------------------------------");

        Tripod tripod = new Tripod("Aluminum", 150, 1200);
        System.out.println("Tripod Details "+tripod);
        System.out.println("the code is " + tripod.hashCode());
        System.out.println("the real code is " + System.identityHashCode(tripod));
        System.out.println("82----------------------------------------------------------------------");

        Guitar guitar = new Guitar("Rock", "Yamaha", 4500);
        System.out.println("Guitar Details "+guitar);
        System.out.println("the code is " + guitar.hashCode());
        System.out.println("the real code is " + System.identityHashCode(guitar));
        System.out.println("83---------------------------------------------------------------------");

        ToyCar toyCar = new ToyCar("Blue", "HotWheels", 150);
        System.out.println("ToyCar"+toyCar);
        System.out.println("the code is " + toyCar.hashCode());
        System.out.println("the real code is " + System.identityHashCode(toyCar));
        System.out.println("84----------------------------------------------------------------------");

        Ruler ruler = new Ruler(30, "Plastic", 20);
        System.out.println("Ruler Details "+ruler);
        System.out.println("the code is " + ruler.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ruler));
        System.out.println("85-----------------------------------------------------------------------");

        Candle candle = new Candle("Lavender", 150, 299);
        System.out.println("Candle Details "+candle);
        System.out.println("the code is " + candle.hashCode());
        System.out.println("the real code is " + System.identityHashCode(candle));
        System.out.println("86------------------------------------------------------------------------");

        Door door = new Door("Wood", 210, 5500);
        System.out.println("Door Details "+door);
        System.out.println("the code is " + door.hashCode());
        System.out.println("the real code is " + System.identityHashCode(door));
        System.out.println("87------------------------------------------------------------------------");

        DiningTable diningTable= new DiningTable("Round", 4, 8900);
        System.out.println("Dining Table details "+diningTable);
        System.out.println("the code is " + diningTable.hashCode());
        System.out.println("the real code is " + System.identityHashCode(diningTable));
        System.out.println("88--------------------------------------------------------------------");

        Facewash facewash = new Facewash("Himalaya", 100, 150);
        System.out.println("Face Wash Details "+facewash);
        System.out.println("the code is " + facewash.hashCode());
        System.out.println("the real code is " + System.identityHashCode(facewash));
        System.out.println("89---------------------------------------------------------------------");

        Ipl ipl = new Ipl("Chennai Super Kings", "MS Dhoni", 5);
        System.out.println("IPL details "+ipl);
        System.out.println("the code is " + ipl.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ipl));
        System.out.println("90----------------------------------------------------------------------");

        CreditCard creditCard = new CreditCard("HDFC", 12345678, 150000);
        System.out.println("Card details"+creditCard);
        System.out.println("the code is " + creditCard.hashCode());
        System.out.println("the real code is " + System.identityHashCode(creditCard));
        System.out.println("91------------------------------------------------------------------------");

        Rice rice = new Rice("Basmati", 5, 450);
        System.out.println("Rice details "+rice);
        System.out.println("the code is " + rice.hashCode());
        System.out.println("the real code is " + System.identityHashCode(rice));
        System.out.println("92---------------------------------------------------------------------");

        Chapati chapati = new Chapati("Wheat", 10, 50);
        System.out.println(chapati);
        System.out.println("the code is " + chapati.hashCode());
        System.out.println("the real code is " + System.identityHashCode(chapati));
        System.out.println("93-----------------------------------------------------------------------");

        Milk milk = new Milk("Nandini", 500, 25);
        System.out.println("Milk details "+milk);
        System.out.println("the code is " + milk.hashCode());
        System.out.println("the real code is " + System.identityHashCode(milk));
        System.out.println("94-----------------------------------------------------------------------");

        Apple apple = new Apple("Fuji", 200, 35);
        System.out.println("Apple details "+apple);
        System.out.println("the code is " + apple.hashCode());
        System.out.println("the real code is " + System.identityHashCode(apple));
        System.out.println("95---------------------------------------------------------------------");

        Browser browser = new Browser("Chrome", "123.4", 2024);
        System.out.println("Browser Details "+browser);
        System.out.println("the code is " + browser.hashCode());
        System.out.println("the real code is " + System.identityHashCode(browser));
        System.out.println("96-------------------------------------------------------------------");

        Port port = new Port("USB", 3, 400);
        System.out.println("Port details "+port);
        System.out.println("the code is " + port.hashCode());
        System.out.println("the real code is " + System.identityHashCode(port));
        System.out.println("97---------------------------------------------------------------------");

        Adapter adapter = new Adapter("Lenovo", 65, 1200);
        System.out.println("Adapter details "+adapter);
        System.out.println("the code is " + adapter.hashCode());
        System.out.println("the real code is " + System.identityHashCode(adapter));
        System.out.println("98------------------------------------------------------------------");

        Jet jet = new Jet("F-22 Raptor", 2410, 1);
        System.out.println("Jet Details "+jet);
        System.out.println("the code is " + jet.hashCode());
        System.out.println("the real code is " + System.identityHashCode(jet));
        System.out.println("99---------------------------------------------------------------------");

        Star star = new Star("Sirius", 9940, 8);
        System.out.println("Star details " +star);
        System.out.println("the code is " + star.hashCode());
        System.out.println("the real code is " + System.identityHashCode(star));
        System.out.println("100---------------------------------------------------------------------");

        Ocean ocean = new Ocean("Pacific", 10911, 168723000);
        System.out.println("Ocean Details "+ocean);
        System.out.println("the code is " + ocean.hashCode());
        System.out.println("the real code is " + System.identityHashCode(ocean));

    }
}
