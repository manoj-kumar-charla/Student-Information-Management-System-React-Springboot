package net.fernandosalas.ems.service.implementation;

import lombok.AllArgsConstructor;
import net.fernandosalas.ems.dto.CourseDto;
import net.fernandosalas.ems.entity.Course;
import net.fernandosalas.ems.entity.Department;
import net.fernandosalas.ems.entity.Student;
import net.fernandosalas.ems.exception.ResourceNotFoundException;
import net.fernandosalas.ems.mapper.CourseMapper;
import net.fernandosalas.ems.repository.CourseRepository;
import net.fernandosalas.ems.repository.DepartmentRepository;
import net.fernandosalas.ems.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplementation implements CourseService {
    @Autowired
    private CourseRepository courseRepo;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<CourseDto> getAllCourseDtos(){
        List<Course> courses = courseRepo.findAll();
        return courses.stream()
                .map(CourseMapper::mapToCourseDto)
                .toList();
    }

    @Override
    public CourseDto getCourseByCourseCode(String courseCode) {
        Course course = courseRepo.findById(courseCode).orElseThrow(() -> new ResourceNotFoundException("Course not found with code : " + courseCode));
        return CourseMapper.mapToCourseDto(course);
    }

    @Override
    public  List<CourseDto> getCoursesByDepartment(Long departmentId){
        List<Course> coursesList = courseRepo.findByDepartmentId(departmentId);
        return coursesList.stream()
                .map(CourseMapper::mapToCourseDto)
                .toList();
    }
    @Override
    public CourseDto createCourse(CourseDto courseDto){
        Course course = CourseMapper.mapToCourse(courseDto);
        Department department = departmentRepository.findById(courseDto.getDepartmentId())
                .orElseThrow(() -> new ResourceNotFoundException("Department not found with id : "  + courseDto.getDepartmentId()));
        course.setDepartment(department);
        Course savedCourse = courseRepo.save(course);
        return CourseMapper.mapToCourseDto(savedCourse);
    }
}
