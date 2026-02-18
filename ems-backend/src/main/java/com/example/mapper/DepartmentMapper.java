package com.example.mapper;

import com.example.dto.DepartmentDto;
import com.example.entity.Department;

public class DepartmentMapper {

    // Convert Department entity into DepartmentDto
    public static DepartmentDto mapToDepartmentDto(Department department) {
        return new DepartmentDto(
            department.getId(),
            department.getDepartmentName(),
            department.getDepartmentDescription()
        );
    }

    // Convert DepartmentDto into Department entity
    public static Department mapToDepartment(DepartmentDto departmentDto) {
        return new Department(
            departmentDto.getId(),
            departmentDto.getDepartmentName(),
            departmentDto.getDepartmentDescription()
        );
    }
}

