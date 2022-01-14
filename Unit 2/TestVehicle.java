public class TestVehicle{
public static void main (String[] args){
   Car slowCar = new Car();
   Car fastCar = new Car("Red", 100);
   System.out.println("\n\tslowCar\n");
   System.out.println("slowCar's speed is: " + slowCar.getSpeed());
   System.out.println("slowCar's color is: " + slowCar.getColor());
   slowCar.setSpeed(45);
   slowCar.setColor("Green");
   System.out.println("slowCar's speed is: " + slowCar.getSpeed());
   System.out.println("slowCar's color is: " + slowCar.getColor());
   System.out.println(slowCar);
   slowCar.go();
   slowCar.go(50);
   slowCar.stop();
   System.out.println("\n\tfastCar\n");
   System.out.println("fastCar's speed is: " + fastCar.getSpeed());
   System.out.println("fastCar's color is: " + fastCar.getColor());
   fastCar.setSpeed(0);
   fastCar.setColor("Yellow");
   System.out.println("fastCar's speed is: " + fastCar.getSpeed());
   System.out.println("fastCar's color is: " + fastCar.getColor());
   System.out.println(fastCar);
   fastCar.go();
   fastCar.go(120);
   fastCar.stop();
}
}