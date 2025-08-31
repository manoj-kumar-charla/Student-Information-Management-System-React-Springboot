package net.cgisms.ems.repository;
import net.cgisms.ems.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
