package com.example.API_DEMO_1000.controller;


import org.springframework.web.bind.annotation.*;

//1 Esta clase completa se va a manejar mediante protocolo http
@RestController
//2" Ruta base para acceder a mi api
@RequestMapping("/api/v1/controlador")
public class OperacionesController {

    //3Agregar un saludo de bienvenida
    @GetMapping("/saludo")
    public String saludo(){
        return "Bienvenido a mi API DEMO 1000";
    }

    //4 - Saludar recibiendo un parametro mediante la url
    @GetMapping("/hello/{nombre}")
    public String saludoDinamico(@PathVariable String nombre){
        return "Hola a todos mi nombre es: " +nombre;
    }

    //5 Operacion suma
    @GetMapping("/suma")
    public String suma(){
        int resultado = 5 + 3;
        return "El resultado de la suma es: "+resultado;
    }
    //6 Operacion resta
    @GetMapping("/resta")
    public String resta(){
        int resultado = 5 - 3;
        return "El resultado de la resta es: "+resultado;
    }

    //7 Operacion multiplicacion
    @GetMapping("/multiplicacion")
    public String multiplicacion(){
        int resultado = 5 * 3;
        return "El resultado de la multiplicación es: "+resultado;
    }

    //8 Operacion división
    @GetMapping("/division")
    public String division(){

        int resultado = 5 / 3;
        return "El resultado de la división es: "+resultado;
    }

    //9 suma recibiendo parametros
    @GetMapping("/suma/{a}/{b}")
    public String sumaConParametros(@PathVariable int a, @PathVariable int b){
        return "El resultado de la suma "+ a + " + "+ b + " es: " + (a+b);
    }

    //10 resta recibiendo parametros
    @GetMapping("/resta/{a}/{b}")
    public String restaConParametros(@PathVariable int a, @PathVariable int b){
        return "El resultado de la resta "+ a + " - "+ b + " es: " + (a-b);
    }

    //11 suma recibiendo parametros
    @GetMapping("/multiplicacion/{a}/{b}")
    public String multiplicacionConParametros(@PathVariable int a, @PathVariable int b){
        return "El resultado de la multiplicacion "+ a + " * "+ b + " es: " + (a*b);
    }

    //12 division recibiendo parametros
    @GetMapping("/division/{a}/{b}")
    public String divisionConParametros(@PathVariable int a, @PathVariable int b){
        if (b==0){
            return "No se puede dividir por cerito.";
        }
        return "El resultado de la división "+ a + " / "+ b + " es: " + (a/b);
    }

    // 13 Ejemplo de uso de encabezados HTTP para obtener informacion del cliente(Navegador)
    @GetMapping("/uso-agente")
    public String obtenerInfoAgente(@RequestHeader(value= "User-Agent", defaultValue = "Desconocido no se") String userAgent){
        return "La información mediante la cabecera de head es: "+userAgent;
    }




}
