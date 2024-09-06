package com.example.demo.controller;

import com.example.demo.serive.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/calculate")
    public ResponseEntity<?> calculate(
            @RequestParam(value = "num1") String num1Str,
            @RequestParam(value = "opr") String opr,
            @RequestParam(value = "num2") String num2Str) {
        try {
            BigDecimal num1 = new BigDecimal(num1Str);
            BigDecimal num2 = new BigDecimal(num2Str);
            BigDecimal result = calculadoraService.calculate(num1, opr, num2);
            return ResponseEntity.ok(result);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Invalid number format");
        } catch (ArithmeticException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/sqrt")
    public BigDecimal calculateSqrt(@RequestParam BigDecimal num){
        return calculadoraService.calculate(num, "sqrt", BigDecimal.ZERO);
    }
}
