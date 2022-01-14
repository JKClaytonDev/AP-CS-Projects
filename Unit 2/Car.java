public class Car{
private String color;
private double speed;
public Car(String inColor, double inSpeed){
   color = inColor;
   speed = inSpeed;
}
public Car(){
   color = "black";
   speed = 0.0;
}
public double getSpeed(){
   return speed;
}
public String getColor(){
   return color;
}
public void setSpeed(double inSpeed){
   speed = inSpeed;
   }
public void setColor(String inColor){
   color =  inColor;
   }
public void go(){
   speed = 60;
   System.out.println("The car is moving with speed "+speed);
}
public void go(double inSpeed){
   speed = inSpeed;
   System.out.println("The car is moving with speed "+speed);
}
public void stop(){
   speed = 0;
   System.out.println("The car is not moving. The speed is "+speed);
}
public String toString(){
   return("I am a car with speed "+speed+" and color "+color);
   }
}