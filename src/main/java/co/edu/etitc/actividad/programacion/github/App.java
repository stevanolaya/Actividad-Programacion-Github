package co.edu.etitc.actividad.programacion.github;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App{
    public static void main( String[] args ) throws Exception {
        
        var context = new AnnotationConfigApplicationContext();
        context.register(greeting.class);
        context.refresh();

        var instancia = context.getBean(greeting.class);
        instancia.greet();

        context.close();
    }
}
