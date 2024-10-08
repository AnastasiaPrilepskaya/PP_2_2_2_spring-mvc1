package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars/{numberOfCars}")
    public String printCarsList(ModelMap model, @PathVariable int numberOfCars) {
        List<Car> cars = carService.getCars(numberOfCars);
        model.addAttribute("carsList", cars);
        return "cars";
    }
}
