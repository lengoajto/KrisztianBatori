import java.util.ArrayList;

public class Garden {
    ArrayList<Plant> plants;

    Garden(ArrayList<Plant> plants) {
        this.plants = plants;
    }

    public void getNeedyPlants() {
        for (int i = 0; i < plants.size(); i++) {
            String plantType = plants.get(i).type;
            if (plantType.equals("Flower") && plants.get(i).waterAmount < 5) {
                System.out.println("The " + plants.get(i).color + " Flower needs water");
            }
            else if (plantType.equals("Flower")) {
                System.out.println("The " + plants.get(i).color + " Flower doesn't need water");
            }
        }

        for (int i = 0; i < plants.size(); i++) {
            String plantType = plants.get(i).type;
            if (plantType.equals("Tree") && plants.get(i).waterAmount < 10) {
                System.out.println("The " + plants.get(i).color + " Tree needs water");
            }
            else if (plantType.equals("Tree")) {
                System.out.println("The " + plants.get(i).color + " Tree doesn't need water");
            }
        }
    }

    public void waterPlants(int waterAmount) {
        System.out.println("Watering with " + waterAmount);
        int plantsNeededWaterCount = (int)plants.stream()
                                        .filter(plant -> plant.type.equals("Tree") && plant.waterAmount < 10)
                                        .count();
        plantsNeededWaterCount += (int)plants.stream()
                                        .filter(plant -> plant.type.equals("Flower") && plant.waterAmount < 5)
                                        .count();

        waterAmount /= plantsNeededWaterCount;

        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).watering(waterAmount);
        }
    }

}
