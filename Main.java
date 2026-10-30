public class Main {


public static void printDetails(Vehicle vehicle) {
vehicle.displayInfo();
}

public static void main(String[] args) {
//Truck
Vehicle vehicle = new Truck("Scania", "G410 XT", 2022, 8);
vehicle.displayInfo();

System.out.println();

//Car
vehicle = new Car("Corvet", "Z06",2025, 4);
vehicle.displayInfo();
System.out.println();


//Motorcycle
vehicle = new Motorcycle("Honda", "Click v2",2023, "125cc");
vehicle.displayInfo();
System.out.println();


//DEMO2
System.out.println("--Method Parameter--");
Truck truck = new Truck("Isuzu", "QLR77E", 2026, 4);
printDetails(truck);
System.out.println();

Car car = new Car("Toyota", "Vios",2023, 4);
printDetails(car);
System.out.println();

Motorcycle motor = new Motorcycle("Honda", "Beat v3",2023, "125cc");
printDetails(motor);
System.out.println();

//DEMO3 
System.out.println("--Polymorphic Array--");
Vehicle[] vehicles = {
    new Truck("Hyundai", "HD78 GT", 2026, 6),
    new Car("Toyota", "Corolla",2024, 4),
    new Motorcycle("Honda", "Navi",2023, "125cc")
  };
  
  for(Vehicle currentVehicle: vehicles) {
  printDetails(currentVehicle);
  currentVehicle.moveForward();
  currentVehicle.moveBackwards();
  currentVehicle.moveLeft();
  currentVehicle.moveRight();
  System.out.println();
}
}
}





