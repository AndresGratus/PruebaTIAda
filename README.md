# PRUEBA JAVA PARA CANDIDATOS SENIOR

 ## Caracteristicas 

 -Creacion de Aquiteturta SQL, en este caso usamos H2 para un usolo local de la DB
 - Se implemetan varias funcionalidad y diferente manejos de datos

## Intalacion 

- PruebaTIApplication -> Run/Debug

### Requisitos Previos 
  - Java 22
  - H2 Database
  - Gladle

# Calculadora
 * Metodo HHTP GET
 * URL Base http://localhost:8080/api/calculadora/calculate
 * Parametros num1, opr,num2
### caracter url 
 - (+)	%2B
 - (-)	%2D
 - (*)	%2A
 - (/)	%2F
 - (')	%27
### Consultas
 * Suma GET http://localhost:8080/api/calculadora/calculate?num1=10&opr=*&num2=5
 * http://localhost:8080/api/calculadora/calculate?num1=10&opr=sqrt&num2=5
 
### Clonacion del repositorio
```bash
git clone https://github.com/AndresGratus/PruebaTIAda.git
cd PruebaTIAda
