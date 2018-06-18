package com.kunj.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}
	
	@RequestMapping("/topics/{id}/courses/{id}")
	public Course getCourse(@PathVariable("id") String id) {
		return courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics/{id}/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}/courses/{id}")
	public void updateCourse(@PathVariable("id") String id, @RequestBody Course course) {
		 courseService.updateCourse(id, course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		 courseService.deleteCourse(id);
	}
	
}
