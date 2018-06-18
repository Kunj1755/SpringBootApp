package com.kunj.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description")				
			));*/
	
	public List<Course> getAllCourses(){
		//return topics;
		List<Course> topics = new ArrayList<>();
		courseRepository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	//	return (Topic) topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addCourse(Course topic) {
		courseRepository.save(topic);
		//topics.add(topic);
	}

	public void updateCourse(String id, Course topic) {
		courseRepository.save(topic);
		
		/*for(int i=0; i<topics.size(); i++) {
			Topic t  = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
		//topics.removeIf(t -> t.getId().equals(id));
		
	}

}
