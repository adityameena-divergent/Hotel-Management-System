package com.divergentsl.hms.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

	@Transactional
	@Override
	public boolean login(String username, String password) {
		return username.equals("admin") && password.equals("root");
	}

}
