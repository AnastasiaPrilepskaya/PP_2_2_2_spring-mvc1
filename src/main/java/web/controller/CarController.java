package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;


    @GetMapping(value = "/cars/{i}")
    public String printCarsList(ModelMap model, @PathVariable int i) {
        List<Car> cars = carService.getCars(i);
        model.addAttribute("carsList", cars);
        return "cars";
    }
}
