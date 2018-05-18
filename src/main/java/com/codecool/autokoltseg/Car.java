package  com.codecool.autokoltseg;

 abstract class Car {

    private String manufacturer;
    private String model;


    private int distanceTraveled;

    Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;

    }

     public String getManufacturer() {
         return manufacturer;
     }

     abstract int calculateInsuranceCost();
    abstract int calculateMaintenanceCost();
    abstract int calculateConsumptionUnit();

    int calculateCostsperMonth(int distanceTraveled){
        this.distanceTraveled=distanceTraveled;
        int consCost = this.distanceTraveled*calculateConsumptionUnit()/100;
        int insCost = calculateInsuranceCost()/12;
        int mainCost = calculateMaintenanceCost();
        int allCost = (mainCost+insCost+consCost);
        System.out.println(this.distanceTraveled+ " hh"+this.manufacturer + " " + this.model + " distance travelled: "+ this.distanceTraveled +", costs: " + allCost);
        System.out.println(this.distanceTraveled+ " IC: "+insCost+", MC: "+mainCost+", CC: " + consCost + "\n");
        return (calculateMaintenanceCost()+calculateInsuranceCost()/12+this.distanceTraveled*calculateConsumptionUnit()/100);


    }





}
