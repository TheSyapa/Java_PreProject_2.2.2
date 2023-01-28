package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(defaultValue = "5") String count, Model model) {
        List<Car> cars = carService.showCars(Integer.parseInt(count));

        model.addAttribute("cars", cars);
        return "cars";
    }
}