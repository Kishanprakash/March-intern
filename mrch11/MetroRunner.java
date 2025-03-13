class MetroRunner{
public static void main(String [] values)
{
Metro met = new Metro ();
System.out.println("These are all Default values");
System.out.println("\n"+met.line);
System.out.println("\n"+met.noOfstations);
System.out.println("\n"+met.securityIncharge);
System.out.println("\n"+met.LineVoltage);


Metro metro =new Metro();
metro.line="purple and green";
metro.noOfstations = 10;
metro.securityIncharge ="jayaraj";
metro.LineVoltage =250;
System.out.println("this is first");

System.out.println(metro.line);
System.out.println(metro.noOfstations);
System.out.println(metro.securityIncharge);
System.out.println(metro.LineVoltage);





}
}