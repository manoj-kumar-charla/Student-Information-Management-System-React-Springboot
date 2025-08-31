package net.cgisms.ems.repository;

import net.cgisms.ems.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    List<Course> findByDepartmentId(Long departmentId);
}
