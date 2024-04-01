package com.example.swiftRide.service;


import java.util.List;

import com.example.swiftRide.entity.Admin;
import com.example.swiftRide.exception.AdminException;

public interface AdminService {
    public Admin createAdmin(Admin admin) throws AdminException;
    public Admin updateAdmin(Admin admin, String key) throws AdminException;
    
    public List<Admin> getAllAdmin() throws AdminException;
}