public class Motorcycle extends Vehicle {

String engineType;

public Motorcycle(String brand, String model,int year, String engineType) {
super(brand, model, year);
this.engineType = engineType;

}
@Override 
public void moveForward() {
  System.out.println ("Ang motor ni sutoyg padagan");
}

@Override
public void moveBackwards() {
  System.out.println("Ang motor ni atras");
}

@Override
public void moveLeft() {
  System.out.println("Ang motor ni liko sa wala");
}

@Override 
public void moveRight() {
  System.out.println("Ang motor ni liko sa tuo");
}

@Override
public void displayInfo() {
   super.displayInfo();
   System.out.println("Engine Type: " + engineType);
   
 }
}