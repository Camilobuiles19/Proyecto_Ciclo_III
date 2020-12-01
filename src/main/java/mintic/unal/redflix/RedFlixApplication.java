











package mintic.unal.redflix;

import mintic.unal.redflix.vista.Ventana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("mintic.unal.redflix")
public class RedFlixApplication {
    
	public static void main(String[] args) {
                new Ventana().setVisible(true);
	}

        public static void runSpringServer(String[] args) {
            /*
            ConfigurableApplicationContext ctx = new SpringApplicationBuilder(Application.class)
                    .headless(false).run(args);
            */
            SpringApplication.run(RedFlixApplication.class, args);
        }
            
}
