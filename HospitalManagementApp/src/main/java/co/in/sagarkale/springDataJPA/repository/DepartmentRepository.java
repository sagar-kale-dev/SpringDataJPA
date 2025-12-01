package co.in.sagarkale.springDataJPA.repository;

import co.in.sagarkale.springDataJPA.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}