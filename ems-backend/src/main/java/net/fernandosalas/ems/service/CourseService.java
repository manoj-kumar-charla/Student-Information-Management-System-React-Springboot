package net.fernandosalas.ems.service;

import net.fernandosalas.ems.dto.CourseDto;

import java.util.List;

public interface CourseService {

    List<CourseDto> getCoursesByDepartment(Long departmentId);

    CourseDto createCourse(CourseDto courseDto);

    List<CourseDto> getAllCourseDtos();

    CourseDto getCourseByCourseCode(String courseCode);
}
