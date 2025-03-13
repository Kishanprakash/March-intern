class CountryRunner{
  
  public static void main(String[] args)
  {
  String [] name={"America","London","London","africa"};
   for (String ref :name)
   
   {
   if(Countries.getcountry(ref))
   {
   System.out.println("yes,its a valid country name :" +ref};
   }
   else
   
   {
    System.out.println("not a valid name: "+ref);
	
	}
	}
	}
	}