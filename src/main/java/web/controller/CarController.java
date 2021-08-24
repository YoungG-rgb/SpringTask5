package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;
import java.util.List;

@Controller
public class CarController {
    CarService carService = new CarService();
    List <Car> carList = carService.getCarList();

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(value = "count", required = false) Integer amount, ModelMap modelCar) {
        modelCar.addAttribute("carList",carService.getCertainNumOfCars(carList,amount));
        return "cars";
    }
}
