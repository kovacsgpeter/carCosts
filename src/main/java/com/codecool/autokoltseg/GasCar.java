package  com.codecool.autokoltseg;
public class GasCar extends OttoCar{


    /*
        • a jármű kötelező biztosítási díja = 1500 + lökettérfogat / 2 +
    hengerszám / 10 egészrésze,
    • a jármű egység-fogyasztása = maximális fordulatszám +
    hengerszám * 10 + lökettérfogat,
    • a jármű karbantartási költsége = maximális fordulatszám +
    hengerszám * 10.
     */

    private int maxRpm;

    public GasCar(String manufacturer, String model,  int engineVolume, int cylinderCount, int maxRpm) {
        super(manufacturer, model,  engineVolume, cylinderCount);
        this.maxRpm=maxRpm;
    }

    @Override
    int calculateInsuranceCost() {
        return 1500+this.engineVolume/(2+this.cylinderCount%10);
    }

    @Override
    int calculateMaintenanceCost() {
        return this.maxRpm+this.cylinderCount*10;
    }

    @Override
    int calculateConsumptionUnit() {
        return this.maxRpm+this.cylinderCount*10+this.engineVolume;
    }
}
