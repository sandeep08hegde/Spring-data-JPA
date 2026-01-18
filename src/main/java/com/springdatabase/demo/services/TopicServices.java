package com.springdatabase.demo.services;


import com.springdatabase.demo.model.Topics;
import com.springdatabase.demo.repository.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicServices {

    @Autowired
    private TopicsRepository topicsRepository;

//    private List<Topics> topics = new ArrayList<>(Arrays.asList(
//            new Topics("Spring", "Spring Framework", "Spring Framework Description"),
//            new Topics("Java", "Core Java", "Core Java Description"),
//            new Topics("JavaScript", "JavaScript Basics", "JavaScript Description")
//    ));

    public List<Topics> getAllTopics() {
        List<Topics> topics = new ArrayList<>();
        topicsRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topics getTopic(String id) {
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
        return topicsRepository.findById(id).orElse(null);
    }


    public void addTopics(Topics topic) {
        topicsRepository.save(topic);
    }

    public void updateTopics(Topics topic, String id) {
//        for (int i = 0; i < topics.size(); i++) {
//            Topics t = topics.get(i);
//            if (t.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicsRepository.save(topic);
    }

    public void deleteTopic(String id) {
//        topics.removeIf(t -> t.getId().equals(id));
        topicsRepository.deleteById(id);

    }
}