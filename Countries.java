class Countries{
  public static boolean getcountry(String countryname)
  {
  int length = countryName.length();
  if (countryName.chartAt(0)=='A' ||
  countryName.chartAt(0)=='a'&& 
  countryName.chartAt(length-1)=='a'||
  countryName.chartAt(length-1)=='A')
  {
	  return true;
  }
  return false;
  }
}