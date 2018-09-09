package com.frg0.caviar;

import com.frg0.caviar.toolkits.upload.model.FileStorageProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties({
        FileStorageProperties.class
})
public class CaviarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CaviarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        /** Permet de lancer des process quand l'appli start */
        System.out.println("Application Started");
    }
}