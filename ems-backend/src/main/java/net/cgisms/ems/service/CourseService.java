package net.cgisms.ems.service;

import net.cgisms.ems.dto.CourseDto;

import java.util.List;

public interface CourseService {

    List<CourseDto> getCoursesByDepartment(Long departmentId);

    CourseDto createCourse(CourseDto courseDto);

    List<CourseDto> getAllCourseDtos();

    CourseDto getCourseByCourseCode(String courseCode);
}
