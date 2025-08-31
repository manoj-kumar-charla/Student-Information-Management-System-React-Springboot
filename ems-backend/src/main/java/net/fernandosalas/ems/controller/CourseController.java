package net.fernandosalas.ems.controller;

import lombok.AllArgsConstructor;
import net.fernandosalas.ems.dto.CourseDto;
import net.fernandosalas.ems.entity.Course;
import net.fernandosalas.ems.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    @Autowired
    private final CourseService courseService;

    @GetMapping
    public ResponseEntity<?> getAllCourseDtos(){
        List<CourseDto> courseDtos = courseService.getAllCourseDtos();
        return new ResponseEntity<>(courseDtos, HttpStatus.OK);
    }

    @GetMapping("/department/{departmentId}")
    public ResponseEntity<?> getCoursesByDepartment(@PathVariable Long departmentId) {
        List<CourseDto> courseDtoList = courseService.getCoursesByDepartment(departmentId);
        return new ResponseEntity<>(courseDtoList, HttpStatus.OK);
    }
    @GetMapping("{courseCode}")
    public ResponseEntity<?> getCourseByCourseCode(@PathVariable String courseCode){
        CourseDto courseDto = courseService.getCourseByCourseCode(courseCode);
        return new ResponseEntity<>(courseDto, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<?> addCourse(@RequestBody CourseDto courseDto){
        CourseDto savedCourse = courseService.createCourse(courseDto);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
    }
}
