# PRUEBA JAVA PARA CANDIDATOS SENIOR

 ## Caracteristicas 

- Base de Datos: H2 en memoria, accesible desde la consola en http://localhost:8080/h2-console/ (contraseña password).
- Calculadora: Soporte para operaciones matemáticas básicas y avanzadas como suma, resta, multiplicación, división, raíces cuadradas y potencias.
- Generador de Palabras: Creación de palabras a partir de un array de caracteres.
- Controladores REST: Interfaz para interactuar con la calculadora, el generador de palabras y la entidad Company.
  ![image](https://github.com/user-attachments/assets/692b52fc-e844-41a0-b9bc-bd996e3aeccc)

### Requisitos Previos 
  - Java 22
  - H2 Database
  - Gladle

## Arquitectura del Proyecto
* El proyecto sigue una arquitectura basada en servicios. Cada funcionalidad principal está encapsulada en su propio servicio y controlador. Las solicitudes y respuestas están optimizadas para su uso a través de métodos HTTP.
Además, se hace uso de Mermaid para la representación de diagramas que describen el flujo de datos dentro de la aplicación.
![image](https://github.com/user-attachments/assets/205e6388-e396-4e01-9098-09424d4031a3)

graph TD;
    A[User Request] --> B[API Controller];
    B --> C[Service Layer];
    C --> D[Database H2];

# Calculadora
 * Metodo HHTP GET
 * URL Base http://localhost:8080/api/calculadora/calculate
 * Parametros num1, opr,num2
### caracter url 
* Suma (+): %2B
* Resta (-): %2D
* Multiplicación (*): %2A
* División (/): %2F
* Potencia (^): %5E
* Raíz cuadrada (sqrt)

### Consultas
 * Suma GET http://localhost:8080/api/calculadora/calculate?num1=10&opr=*&num2=5
 * http://localhost:8080/api/calculadora/calculate?num1=10&opr=sqrt&num2=5

# WordGeneration
### Consulta
 * http://localhost:8080/api/words/generate?chars=w,e,r,f,b,h,j,l,u,y,t,r,e,d,f,g,u,t,r,e,s,d,f,g,y,u,i,o,l,k,m,n,b,v,f,r,e,w,s,x,f,g,y,u,i,k,m,n,b,v,f,r,e,w,w,r,t,y,u,i,o,k,m,n,b,v,d,w,s,x,c,f,g,h,u,i,o,p,l,k,n,b,v,f,d,e,w,a,z,x,c,g,h,u,i,o,p,u,y,t,r,e,w,q,s,d,f,g,k,j,b,v,c,x&length=5
 * 
### Clonacion del repositorio
```bash
git clone https://github.com/AndresGratus/PruebaTIAda.git
cd PruebaTIAda
PruebaTIApplication -> Run/Debug
