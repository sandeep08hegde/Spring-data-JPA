package com.springdatabase.demo.repository;

import com.springdatabase.demo.model.Topics;
import org.springframework.data.repository.CrudRepository;

public  interface TopicsRepository extends CrudRepository<Topics, String> {

    //getAllTopics

}
