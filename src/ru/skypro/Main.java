package ru.skypro;

public class Main {

    public static void main(String[] args) {
                Car car = new Car("BMW X6",4);
                Car car2 = new Car("AudiA8",4);

                Truck truck = new Truck("Газель",6);
                Truck truck2 = new Truck("MAN",8);

                Bicycle bicycle = new Bicycle("STELLS",2);
                Bicycle bicycle2 = new Bicycle("Corratec",2);


                ServiceStation station = new ServiceStation();
                station.check(car, null, null);
                station.check(car2, null, null);
                station.check(null, bicycle, null);
                station.check(null, bicycle2, null);
                station.check(null, null, truck);
                station.check(null, null, truck2);



    }
}
