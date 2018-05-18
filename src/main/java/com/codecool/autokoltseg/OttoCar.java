package  com.codecool.autokoltseg;
abstract class OttoCar  extends Car{
    int engineVolume;
    int cylinderCount;

    public OttoCar(String manufacturer, String model, int engineVolume, int cylinderCount) {
        super(manufacturer, model);
        this.engineVolume = engineVolume;
        this.cylinderCount=cylinderCount;
    }
}
