package co.edu.etitc.actividad.programacion.github;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "co.edu.etitc.actividad.programacion.github")
public class App{
    public static void main( String[] args ) throws Exception {
        
        var context = new AnnotationConfigApplicationContext(App.class);
        
        var instancia = context.getBean(Greeting.class);
        instancia.greet();

        context.close();
    }
}
