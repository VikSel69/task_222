package dao;

import model.Car;

import java.util.List;

public class CarDAOImpl implements CarDAO {
    private final List<Car> carList;

    public CarDAOImpl(List<Car> carList) {
        this.carList = carList;
    }

    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> getCar() {
        return carList;
    }
}
