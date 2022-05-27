package ru.skypro;

public class Car extends Transport implements ServiceInterface {


    public Car(String modelName, int wheelsCount) {
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
        System.out.println("Меняем автомобильную покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель легкового автомобиля");
    }

}
