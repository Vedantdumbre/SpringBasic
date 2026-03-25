package car.example.autowire.constructor;


public class Car {
        private final Specification specification;

    public Car(Specification specification) { // for a autowire we need a constructor not a setter
        this.specification = specification;
    }

    public void displayDetails(){
            System.out.println("Car Details: "+ specification.toString());
        }

}
