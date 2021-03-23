package co.edu.utp.isc.gia.hello;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dfch1
 */
@SpringBootApplication
@RestController
@RequestMapping("calc")
public class CalculadoraController {

    @GetMapping("/*")
    public String multiplicacion(
            @RequestParam("num1") String num1,
            @RequestParam("num2") String num2) {
        return String.format("Resultado de la multiplicacion entre %s y %s es = %d", num1, num2, Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    @GetMapping("/+")
    public String suma(
            @RequestParam("num1") String num1,
            @RequestParam("num2") String num2) {
        return String.format("Resultado de la suma entre %s y %s es = %d", num1, num2, Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    @GetMapping("/-")
    public String resta(
            @RequestParam("num1") String num1,
            @RequestParam("num2") String num2) {
        return String.format("Resultado de la resta entre %s y %s es = %d", num1, num2, Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    @GetMapping("//")
    public String division(
            @RequestParam("num1") String num1,
            @RequestParam("num2") String num2) {
        return String.format("Resultado de la division entre %s y %s es = %.3f", num1, num2, Float.parseFloat(num1) / Float.parseFloat(num2));
    }

}
