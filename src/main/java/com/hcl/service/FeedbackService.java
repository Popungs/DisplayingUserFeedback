package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.FeedbackDao;
import com.hcl.model.Feedback;

@Service
@Transactional
public class FeedbackService {
	@Autowired
	private FeedbackDao fbDao;
	
	public List<Feedback> getAllFb() {
		List<Feedback> li = (List<Feedback>) fbDao.findAll();
		return li;
	}
	public void addFeedback(String uname, String desc, int rating) {
		Feedback fb = new Feedback();
		fb.setUserName(uname);
		fb.setDescription(desc);
		fb.setRating(rating);
		fbDao.save(fb);
	}
	
	public boolean deleteFB(int id) {
		Optional<Feedback> fb = fbDao.findById(id);
		if (fb.isPresent()) {
			fbDao.deleteById(id);
			return true;
		} 
		return false;
	}
}
