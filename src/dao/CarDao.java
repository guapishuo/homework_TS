package dao;

import java.awt.print.Book;
import java.util.List;
import entity.Car;

public interface CarDao {
    List<Car> listAll();
    Car getCarById(int id);
    List<Car> getCarById(String name);
    boolean update(Car car);
    boolean delete(int id);
    Car add(Car car);
}
