package com.casestudy.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.bank.model.CustomSequences;
import com.casestudy.bank.model.User;
import com.casestudy.bank.repository.SequenceRepository;
import com.casestudy.bank.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	SequenceRepository sequenceRepository;
	
	public User addUser(User user) {
		List<CustomSequences> sequences = sequenceRepository.findAll();
		CustomSequences seq;
		if(sequences.isEmpty()) {
			seq = new CustomSequences();
		} else {
			seq = sequences.get(0);
		}		
		user.setUserId(seq.getSeq()+1);
		userRepository.save(user);
		
		seq.setSeq(seq.getSeq()+1);
		sequenceRepository.save(seq);
		
		return user;
	}
	
	public void updateUser(User user) {
		userRepository.save(user);
	}
	
	public User getUser(int userId) {
		return userRepository.findOne(userId);
	}
}
