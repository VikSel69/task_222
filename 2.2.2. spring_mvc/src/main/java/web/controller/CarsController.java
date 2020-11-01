package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService = new CarServiceImpl();

    @GetMapping()
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }

}
