package xyz.sahia.ensembler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import xyz.sahia.ensembler.domain.EnsembleService;
import xyz.sahia.ensembler.domain.InMemoryEnsembleRepository;

@SpringBootApplication
public class EnsemblerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnsemblerApplication.class, args);
    }
    @Bean
    public EnsembleService createEnsembleService(){

        return new EnsembleService(new InMemoryEnsembleRepository());
    }
}
