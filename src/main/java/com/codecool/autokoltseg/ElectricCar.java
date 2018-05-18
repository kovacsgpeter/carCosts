package  com.codecool.autokoltseg;
public class ElectricCar extends Car {
    private int accuCap;
    private int performance;

    /*
    • a jármű kötelező biztosítási díja = 1000 + akkumulátorkapacitás,
    • a jármű egység-fogyasztása = teljesítmény * 2,
    • a jármű karbantartási költsége = 500.
     */

    public ElectricCar(String manufacturer, String model, int accuCap, int performance) {
        super(manufacturer, model);
        this.accuCap=accuCap;
        this.performance=performance;

    }




    @Override
    int calculateInsuranceCost() {
        return 1000+this.accuCap;
    }

    @Override
    int calculateMaintenanceCost() {
        return 500;
    }

    @Override
    int calculateConsumptionUnit() {
        return this.performance*2;
    }
}
