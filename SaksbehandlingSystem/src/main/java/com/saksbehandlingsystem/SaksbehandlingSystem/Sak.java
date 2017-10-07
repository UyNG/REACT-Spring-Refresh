package com.saksbehandlingsystem.SaksbehandlingSystem;

import lombok.Data;
import lombok.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 *  @Data is used, as it is a annotation given to us by Lombok (see pom.xml). It autogenerates getters, setters, constructors, toString, hash,
 *  equals etc and other things.
 *  @Entity is a JPA annotation that denotes the class for storage later in a relational table.
 *  @Id and @GeneratedValue are JPA annotations. It's to note the primary key and is automatically generated when needed.
 */
@Data
@Entity
public class Sak {

    private @Id @GeneratedValue Long saksId;
    private String saksBeskrivelse;
    private String saksTittel;
    private String saksDato;

    private Sak() {}

    public Sak(String saksBeskrivelse, String saksTittel, String saksDato) {
        this.saksBeskrivelse = saksBeskrivelse;
        this.saksTittel = saksTittel;
        this.saksDato = saksDato;
    }

    public Long getSaksId() {
        return saksId;
    }

    public String getSaksBeskrivelse() {
        return saksBeskrivelse;
    }

    public String getSaksTittel() {
        return saksTittel;
    }

    public String getSaksDato() {
        return saksDato;
    }
}
