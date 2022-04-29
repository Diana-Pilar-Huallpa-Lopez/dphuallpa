package edu.ilp.dhuallpa.dao;

import edu.ilp.dhuallpa.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
