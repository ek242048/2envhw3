package ru.skypro;

public class Truck extends Transport implements ServiceInterface {

    public Truck(String modelName, int wheelsCount) {
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
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем грузовой прицеп");
    }
}
