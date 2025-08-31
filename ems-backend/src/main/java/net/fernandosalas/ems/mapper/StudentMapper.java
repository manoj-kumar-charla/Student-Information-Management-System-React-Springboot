package net.fernandosalas.ems.mapper;
import net.fernandosalas.ems.dto.StudentDto;
import net.fernandosalas.ems.entity.Course;
import net.fernandosalas.ems.entity.Student;
import net.fernandosalas.ems.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMapper {
    @Autowired
    private CourseRepository courseRepository;
    public static StudentDto mapToStudentDto(Student student) {
        return new StudentDto(
          student.getId(),
          student.getFirstName(),
          student.getLastName(),
          student.getEmail(),
          student.getDepartment().getId(),
          student.getCourses().stream().map(Course::getCourseCode).toList()
        );
    }

    public static Student mapToStudent(StudentDto studentDto) {
//        return new Student(
//          studentDto.getId(),
//          studentDto.getFirstName(),
//          studentDto.getLastName(),
//          studentDto.getEmail()
//        );
        Student student = new Student();
        student.setId(studentDto.getId());
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        student.setEmail(studentDto.getEmail());
//        student.setCourses(studentDto.getCourseCodes().stream().map(courseRepository::findById).toList());
        return student;
    }
}
