package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Feedback;

@Repository
public interface FeedbackDao extends CrudRepository<Feedback,Integer> {

}
