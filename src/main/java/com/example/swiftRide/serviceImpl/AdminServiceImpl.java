package com.example.swiftRide.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.swiftRide.entity.Admin;
import com.example.swiftRide.exception.AdminException;
import com.example.swiftRide.repo.AdminRepo;
import com.example.swiftRide.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepo adminRepo;


	@Override
	public List<Admin> getAllAdmin() throws AdminException {
		
		return adminRepo.findAll();
	}

	

	@Override
	public Admin createAdmin(Admin admin) throws AdminException {
		Admin a = adminRepo.findByEmail(admin.getEmail());
		if (a != null)
			throw new AdminException("Admin is already register with email (" + a.getEmail() + ")");
		return adminRepo.save(admin);

	}

	@Override
	public Admin updateAdmin(Admin admin, String key) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

}
