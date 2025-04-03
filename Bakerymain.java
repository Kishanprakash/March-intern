class Bakerymain
{
   public static void main(String []args){
	   
   
    int quantityy =50;
	String itemnamee ="bread";
	Bakery.buy(itemnamee,quantityy);
	
	boolean yesorno = true;
    Bakery.open(yesorno); 
	
	boolean trueorfalse = false;
	Bakery.close(trueorfalse);
	
	String naame= "Rakesh";
	Bakery.owner(naame);
	
	String naam ="john wick";
	Bakery.cashier(naam);
}
}