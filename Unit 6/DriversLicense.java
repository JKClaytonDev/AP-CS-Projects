public class DriversLicense extends Card{
private int licenseNum;
private int expirationyear;
public DriversLicense(String n, int lNum, int eYear){
super(n);
licenseNum = lNum;
expirationyear = eYear;
}
public void printCard(){
System.out.print(super.printName()+", License Number: " + licenseNum + ", Expiration year " + expirationyear+"\n");
}
public boolean isExpired(int year){
return (year >= expirationyear);
}
}