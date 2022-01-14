public class cardTester{
public static void main (String[] args){
Card card = new Card("Default");
IDCard id = new IDCard("ID Test", 1482875);
PhoneCard phone = new PhoneCard("Phone", 123456);
DriversLicense license = new DriversLicense("License", 316989, 2022);
card.print();
id.printCard();
phone.printCard();
license.printCard();
}
}