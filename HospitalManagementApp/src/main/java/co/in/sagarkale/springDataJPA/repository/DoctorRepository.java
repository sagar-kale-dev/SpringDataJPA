package co.in.sagarkale.springDataJPA.repository;

import co.in.sagarkale.springDataJPA.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}