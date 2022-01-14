public class IDCard extends Card{
private int idNum;
IDCard(String n, int id){
   super(n);
   idNum = id;
}
public void printCard(){
System.out.print(super.printName()+", ID Number: " + idNum+"\n");
}
}