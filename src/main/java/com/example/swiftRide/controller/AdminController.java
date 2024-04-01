package com.example.swiftRide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.swiftRide.entity.Admin;
import com.example.swiftRide.exception.AdminException;
import com.example.swiftRide.service.AdminService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/swiftRide")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/admin/register")
	public ResponseEntity<Admin> registerAdmin(@Valid @RequestBody Admin admin) throws AdminException {
        Admin savedAdmin = service.createAdmin(admin);
        return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
    }
	
	@GetMapping("/admin/getAll")
	public ResponseEntity<List<Admin>> getAllAdmin() throws AdminException{
		return new ResponseEntity<>(service.getAllAdmin(),HttpStatus.OK);
	}
}
