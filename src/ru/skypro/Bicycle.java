package ru.skypro;

public class Bicycle extends Transport implements ServiceInterface {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void check(Car car, Bicycle bicycle, Truck truck) {

    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем велосипедную покрышку");
    }


}
