package net.cgisms.ems.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @Column(name = "course_code")
    private String courseCode;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "course_description")
    private String courseDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    private List<Student> students;

    public Course(String courseCode, String courseName, String courseDescription) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }
}
