package dao;

import model.Car;

import java.util.List;

public interface CarDAO {

    void addCar(Car car);
    List<Car> getCar();
}
