package co.edu.etitc.actividad.programacion.github;

import org.springframework.stereotype.Component;

@Component
public class greeting {    
    public void greet() {
        System.out.println("Hola mundo desde Spring!");
    }
}