package com.datatable.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.datatable.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author tangzhiqian
 * @create 2021-04-05 19:07
 * @description
 */
@Repository
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
