package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import serviceDAO.CarServiceDAOImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarServiceDAOImpl carServiceDAO = new CarServiceDAOImpl();

    @GetMapping()
    public String printCars(@RequestParam(defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carServiceDAO.showCars(count));
        return "cars";
    }

}
