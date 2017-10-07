package com.saksbehandlingsystem.SaksbehandlingSystem;

import org.springframework.data.repository.CrudRepository;

/**
 * Repository extends Spring Data Common crudrepository that plugs in the type of the domain object
 * and its primary key.
 */
public interface SakRepository extends CrudRepository<Sak,Long> {
}
