package com.bridgelabz.springbootstarter.topic;

import java.awt.List;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
       private  java.util.List<Topic> topics= Arrays.asList(
			new Topic("Spring" ,"Spring Framework" ,"Spring Framework Desciption"),
			new Topic("Java" , "Java Framework", "Java Framework Description"),
			new Topic("Mysql", "Mysql Framework", "Mysql Framework Description")
			);
       
       public java.util.List<Topic> getAllTopic()
   	   {
   		  return topics;
       }
       
       public Topic getTopic(String id) {
    	   return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
       }
       
       public Topic addTopic(Topic topic)
       {
		  topics.add(topic);
		return topic;
       }
}
