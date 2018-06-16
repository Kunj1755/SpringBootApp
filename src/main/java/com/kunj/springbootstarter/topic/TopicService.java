package com.kunj.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description")				
			);
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return (Topic) topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

}
