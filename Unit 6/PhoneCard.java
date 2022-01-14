public class PhoneCard extends Card{
private int phoneNum;
public PhoneCard(String n, int num){
super(n);
phoneNum = num;
}
public void printCard(){
System.out.print(super.printName()+", Phone Number: " + phoneNum+"\n");
}
}