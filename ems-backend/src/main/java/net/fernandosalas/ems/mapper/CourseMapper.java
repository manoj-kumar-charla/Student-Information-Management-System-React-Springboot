package net.fernandosalas.ems.mapper;

import net.fernandosalas.ems.dto.CourseDto;
import net.fernandosalas.ems.entity.Course;

public class CourseMapper {
    public static CourseDto mapToCourseDto(Course course){
        return new CourseDto(
                course.getCourseCode(),
                course.getCourseName(),
                course.getCourseDescription(),
                course.getDepartment().getId()
        );
    }
    public static Course mapToCourse(CourseDto courseDto){
        return new Course(
                courseDto.getCourseCode(),
                courseDto.getCourseName(),
                courseDto.getCourseDescription()
        );
    }
}
