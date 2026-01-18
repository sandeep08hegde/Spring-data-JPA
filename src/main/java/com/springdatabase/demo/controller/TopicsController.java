package com.springdatabase.demo.controller;

import com.springdatabase.demo.model.Topics;
import com.springdatabase.demo.services.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicsController {

    @Autowired
    private TopicServices topicServices;

    @RequestMapping("/topics")
    public List<Topics> getAllTopics() {
        return topicServices.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Topics getTopic(@PathVariable String id) {
        return topicServices.getTopic(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topics topic) {
        topicServices.addTopics(topic);


    }

    @RequestMapping(method= RequestMethod.PUT, value="/topics/{id}")
    public void updateTopics(@RequestBody Topics topic, @PathVariable String id) {
        topicServices.updateTopics(topic,id);

    }

    @RequestMapping(method= RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        // Implementation for deleting a topic can be added here
        topicServices.deleteTopic(id);
    }
}
