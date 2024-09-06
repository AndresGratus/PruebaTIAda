package com.example.demo.serive;

import org.springframework.stereotype.Service;
import  java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

@Service
public class CalculadoraService {

    private  static  final MathContext MATH_CONTEXT = new MathContext(10, RoundingMode.HALF_UP);

    //Metodo principal selecion de operaciones

    public BigDecimal calculate(BigDecimal num1, String opr, BigDecimal num2){
        switch (opr){
            case "+":
                return num1.add(num2);
            case "-":
                return num1.subtract(num2);
            case "*":
                return num1.multiply(num2);
            case "/":
                if (num2.compareTo(BigDecimal.ZERO) == 0){
                    throw new ArithmeticException("Division por Zero");
                }
                return num1.divide(num2);
            case "sqrt":
                if (num1.compareTo(BigDecimal.ZERO) < 0){
                    throw new ArithmeticException("Numero Negativo");
                }
                return new BigDecimal(Math.sqrt(num1.doubleValue()));
            case "^":
            case "'":
                return num1.pow(num2.intValueExact());
            default:
                throw new IllegalArgumentException("Esta operacion no existe. ERROR!!!!");
        }
    }
}
