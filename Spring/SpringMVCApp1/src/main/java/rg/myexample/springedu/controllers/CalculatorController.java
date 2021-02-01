package rg.myexample.springedu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class CalculatorController {

    @GetMapping("/calculator")
    public String calculate(@RequestParam(name="a", required = false) int a,
                            @RequestParam(name="b",required = false) int b,
                            @RequestParam(name="action",required = false) String action,
                            Model model) {
        double result;
        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "division":
                result = a / b;
                break;
            default:
                result = 0;
                break;
        }

        model.addAttribute("calculation", result);
        return "first/calculator";
    }
}
