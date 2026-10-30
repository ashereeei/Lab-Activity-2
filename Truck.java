public class Truck  extends Vehicle {

int numberOfWheels;

public Truck(String brand, String model,int year, int numberOfWheels) {
super(brand, model, year);
this.numberOfWheels = numberOfWheels;

}

@Override
public void moveForward() {
  System.out.println ("Yung truck umabante");
}

@Override
public void moveBackwards() {
  System.out.println("Yung truck umatras");
}

@Override
public void moveLeft() {
  System.out.println("Yung truck kumaliwa");
}

@Override
public void moveRight() {
  System.out.println("Yung truck kumanan");
}

@Override
public void displayInfo() {
  super.displayInfo();
  System.out.println("Number of Wheels: " + numberOfWheels);

}
}