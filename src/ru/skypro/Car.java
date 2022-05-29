package ru.skypro;

public class Car extends Transport implements Service {


    public Car(String modelName, int wheelsCount) {
      super(modelName, wheelsCount);
    }


    @Override
    public void check() {
            System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();

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
