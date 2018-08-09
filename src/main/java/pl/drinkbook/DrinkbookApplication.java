package pl.drinkbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"pl.drinkbook"})
public class DrinkbookApplication {

  public static void main(String[] args) {
    SpringApplication.run(DrinkbookApplication.class, args);
  }
}
