package xyz.sahia.ensembler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestEnsemblerApplication {

    public static void main(String[] args) {
        SpringApplication.from(EnsemblerApplication::main).with(TestEnsemblerApplication.class).run(args);
    }

}
