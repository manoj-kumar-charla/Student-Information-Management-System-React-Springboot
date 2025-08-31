import axios from "axios";

const REST_API_URL = "http://localhost:8080/api/courses";

export const listCourses = () => {
  return axios.get(REST_API_URL);
};

export const createCourse = (course) => {
  return axios.post(REST_API_URL, course);
};

export const getCourseBycourseCode = (courseCode) => {
  return axios.get(REST_API_URL + "/" + courseCode);
};

export const getCourseByDepartmentId = (departmentId) => {
    return axios.get(REST_API_URL + "/department/" + departmentId);
}

export const updateCourse = (courseCode, course) => {
  return axios.put(REST_API_URL + "/" + courseCode, course);
};

export const deleteCourse = (courseCode) => {
  return axios.delete(REST_API_URL + "/" + courseCode);
};
