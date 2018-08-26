package dao;

import entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarIn implements CarDao {
    public static  List<Car> CarDB = new ArrayList<>();

    static {
        Car car1 = new Car(1,"中型车","五菱宏光",100000);
        Car car2 = new Car(2,"小轿车","奔驰",2000000);
        Car car3 = new Car(3,"小型车","雪佛兰",300000);
        Car car4 = new Car(4,"中型车","悍马",300000);
        Car car5 = new Car(5,"小型车","本田",150000);

        CarDB.add(car1);
        CarDB.add(car2);
        CarDB.add(car3);
        CarDB.add(car4);
        CarDB.add(car5);

    }
    @Override
    public List<Car> listAll() {
        return CarDB;
    }

    @Override
    public Car getCarById(int id) {
        for (Car car:CarDB){
            if (car.getId() == id) {
                return car;
            }
        }return null;
    }

    @Override
    public List<Car> getCarById(String name) {
        ArrayList<Car>cars = new ArrayList<>();
        for (Car car : CarDB){
            String carName = car.getName().toLowerCase();
            if(carName.contains(name.toLowerCase())){
                cars.add(car);
            }
        }return cars;
    }

    @Override
    public boolean update(Car car) {
        for (Car CarNew : CarDB){
            if(CarNew.getId() == car.getId()){
                CarNew.setBrand(car.getBrand());
                CarNew.setName(car.getName());
                CarNew.setPrice(car.getPrice());
                return true;
            }
        }return false;
    }

    @Override
    public boolean delete(int id) {
        for(Car car:CarDB){
            if (car.getId()==id){
                return  CarDB.remove(car);
            }
        }return false;
    }

    @Override
    public Car add(Car car) {
       if(CarDB.add(car)){
           return car;
       }return null;
    }
}
