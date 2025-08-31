package net.cgisms.ems.mapper;

import net.cgisms.ems.dto.CourseDto;
import net.cgisms.ems.entity.Course;

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
