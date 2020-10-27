package serviceDAO;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceDAOImpl implements CarServiceDAO{
    private static int CARS_ID;
    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++CARS_ID, "Subaru Impreza WRX", 2006));
        carList.add(new Car(++CARS_ID, "Mazda CX-7", 2010));
        carList.add(new Car(++CARS_ID, "Peugeot 308", 2012));
        carList.add(new Car(++CARS_ID, "Honda Pilot", 2003));
        carList.add(new Car(++CARS_ID, "LADA Granta", 2018));
    }

    @Override
    public List<Car> showCars(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
