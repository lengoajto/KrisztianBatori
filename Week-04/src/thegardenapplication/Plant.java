package thegardenapplication;

public class Plant {
    String color;
    double waterAmount;
    double absorbAmount;

    public void watering(int wateringAmount) {
        wateringAmount += wateringAmount * absorbAmount;
    }
}