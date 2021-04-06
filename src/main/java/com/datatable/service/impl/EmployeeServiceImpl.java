package com.datatable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.datatable.dao.EmployeeMapper;
import com.datatable.pojo.Employee;
import com.datatable.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author tangzhiqian
 * @create 2021-04-05 19:07
 * @description
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
