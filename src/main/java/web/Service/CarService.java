package web.Service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> carList = new ArrayList<>();

    public List<Car> getCarList(){
        carList.add(new Car("BMW","coupe",420));
        carList.add(new Car("Lexus","rx300",2002));
        carList.add(new Car("Audi","a6",2020));
        carList.add(new Car("Honda","Integra",2021));
        carList.add(new Car("Toyota","rav4",2021));
        return carList;
    }
    public List<Car> getCertainNumOfCars(List <Car> list, Integer num) {
        if (num == null || num >= 5) {
            return list;
        } else {
            return list.stream().limit(num).toList();
        }
    }
}
