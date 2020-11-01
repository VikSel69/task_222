package service;

import dao.CarDAO;
import dao.CarDAOImpl;
import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    private int CARS_ID;
    private final CarDAO carDAO;

    {
        carDAO = new CarDAOImpl(new ArrayList<>());
        carDAO.addCar(new Car(++CARS_ID, "Subaru Impreza WRX", 2006));
        carDAO.addCar(new Car(++CARS_ID, "Mazda CX-7", 2010));
        carDAO.addCar(new Car(++CARS_ID, "Peugeot 308", 2012));
        carDAO.addCar(new Car(++CARS_ID, "Honda Pilot", 2003));
        carDAO.addCar(new Car(++CARS_ID, "LADA Granta", 2018));
    }

    @Override
    public List<Car> showCars(int quantityShowCars) {
        return carDAO.getCar().stream().limit(quantityShowCars).collect(Collectors.toList());
    }
}
