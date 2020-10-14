package com.bootcamp.assesment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arithmatic")
public class CalculatorController {

    @GetMapping("/incrementBy")
    public Result increment(@RequestParam String number1,
                            @RequestParam String number2){

        try {
            return new Result(Integer.toString(Integer.parseInt(number1 + number2)));
        }catch(Exception e){
            return new Result(e.toString());
        }
    }
}
