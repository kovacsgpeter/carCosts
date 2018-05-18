package  com.codecool.autokoltseg;
public class DieselCar extends OttoCar {


    /*
    • a jármű kötelező biztosítási díja = 1700 + hengerszám / 10 egészrésze,
    • a jármű egység-fogyasztása = lökettérfogat,
    • a jármű karbantartási költsége = 250 + hengerszám * 7
     */

    public DieselCar(String manufacturer, String model,  int engineVolume, int cylinderCount) {
        super(manufacturer, model, engineVolume, cylinderCount);
    }

    @Override
    int calculateInsuranceCost() {
        return 1700 + this.cylinderCount%10;
    }

    @Override
    int calculateMaintenanceCost() {
        return 250+this.cylinderCount*7;
    }

    @Override
    int calculateConsumptionUnit() {
        return this.cylinderCount;
    }
}
