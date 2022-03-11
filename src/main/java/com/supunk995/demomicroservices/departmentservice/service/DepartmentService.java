package com.supunk995.demomicroservices.departmentservice.service;

import com.supunk995.demomicroservices.departmentservice.Entity.Department;
import com.supunk995.demomicroservices.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {
        log.info("Inside savedepartment method of Departmentservice");
        return departmentRepository.save(department);
    }

    public Department findDepartmentbyId(Long departmentId) {
        log.info("Inside findDepartmentbyId method of Departmentservice");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
