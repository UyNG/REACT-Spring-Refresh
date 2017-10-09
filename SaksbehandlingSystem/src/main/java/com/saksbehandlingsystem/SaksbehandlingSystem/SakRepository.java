package com.saksbehandlingsystem.SaksbehandlingSystem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repository extends Spring Data Common crudrepository that plugs in the type of the domain object
 * and its primary key.
 */

@RepositoryRestResource
public interface SakRepository extends CrudRepository<Sak,Long> {
}
