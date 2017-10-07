package com.saksbehandlingsystem.SaksbehandlingSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataBaseLoader implements CommandLineRunner {

    private final SakRepository repository;

    @Autowired
    public DataBaseLoader(SakRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Sak("En liten saksbeskrivelse", "En liten sakstittel", "En liten dato"));

    }
}
