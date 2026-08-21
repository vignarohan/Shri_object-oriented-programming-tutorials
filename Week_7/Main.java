public class Main {

    public static void main(String[] args) {

        WashingMachine washingMachine = new WashingMachine("LG");

        washingMachine.displayBrand();
        washingMachine.turnOn();
        washingMachine.operate();
        washingMachine.turnOff();

        System.out.println();

        Refrigerator refrigerator = new Refrigerator("Panasonic");

        refrigerator.displayBrand();
        refrigerator.turnOn();
        refrigerator.operate();
        refrigerator.turnOff();
    }
}
