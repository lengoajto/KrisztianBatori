public class Plant {
    String color;
    String type;
    double waterAmount;
    double absorbAmount;

    public void watering(int wateringAmount) {
        waterAmount += wateringAmount * absorbAmount;
    }
}
