class BottleMain{
public static void main (String [] args)
{
Bottle bot = new Bottle();
bot.litre = 45;
bot.brand = "Tupperware";
bot.Shape = "cylinder";
bot.size = 'm';

System.out.println(bot.litre);
System.out.println(bot.brand);
System.out.println(bot.Shape);
System.out.println(bot.size);

Bottle boy =new Bottle();
boy.litre = 10;
boy.brand="cello";
boy.Shape ="round";
boy.size ='L';

System.out.println(boy.litre);
System.out.println(boy.brand);
System.out.println(boy.Shape);
System.out.println(boy.size);
}
}