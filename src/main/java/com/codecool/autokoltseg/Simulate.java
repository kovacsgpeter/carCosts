package  com.codecool.autokoltseg;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulate {
    List<Car> cars = new ArrayList<>();

    private void init(){
        Car corolla = new GasCar("Toyota", "Corolla",  1600, 4, 6000);
        Car tesla = new ElectricCar("Tesla", "model S",  400, 250);
        cars.add(corolla);
        cars.add(tesla);

    }

    private void Simulation(int nMonth){
        for (int i= 0; i<nMonth; i++){
            int month = i+1;
            System.out.println("month: " + month);
            for (Car car: cars){
                car.calculateCostsperMonth(150+new Random().nextInt(250));
            }
        }

    }

    public static void main(String[] args) {
        Simulate first = new Simulate();
        first.init();
        first.Simulation(12);

    }
}
