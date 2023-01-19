package advanceacademyfundamentals.homework05Arrays;

public class Car {

    public String carBrand;
    public String carModel;
    public int carYearManufacture;
    public String carPlate;
    public String carColor;
    public double carPrice;

    public Car (String carBrand, String carModel, int carYearManufacture, String carPlate, String carColor,
                double carPrice) { // Конструкторът
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYearManufacture = carYearManufacture;
        this.carPlate = carPlate;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public Car (String carBrand, String carModel, String carColor, String carPlate, double carPrice) { // Конструкторът
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carPlate = carPlate;
        this.carPrice = carPrice;
    }

    public void printCarInfo() {
        System.out.printf("Brand: %s %n", carBrand);
        System.out.printf("Model: %s %n", carModel);
        System.out.printf("Year: %s %n", carYearManufacture);
        System.out.printf("PlateNo: %s %n", carPlate);
        System.out.printf("Color: %s %n", carColor);
        System.out.printf("Price in EUR: %.2f %n", carPrice);

    }
    public void printCarInfoMini() {
        System.out.printf("Brand: %s %n", carBrand);
        System.out.printf("Model: %s %n", carModel);
        System.out.printf("Price in EUR: %.2f %n", carPrice);

    }

    public String toString() {
        return this.carPlate;
    }

}
