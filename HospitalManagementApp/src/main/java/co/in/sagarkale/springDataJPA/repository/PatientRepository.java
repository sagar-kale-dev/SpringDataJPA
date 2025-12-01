package co.in.sagarkale.springDataJPA.repository;

import co.in.sagarkale.springDataJPA.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
