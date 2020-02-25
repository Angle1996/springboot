package com.satan.dao;

import com.satan.pojo.Department;
import com.satan.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/2518:44
 * @Version 1.0
 */
@Repository
public class EmployeeDao {
	//模拟数据库中的数据
	private static Map<Integer, Employee> employees=null;
	@Autowired
	private DepartmentDao departmentDao;
	static{
		employees=new HashMap<>();
		employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 1,new Date(),new Department(101, "教学部")));
		employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 1,new Date(), new Department(102, "市场部")));
		employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 0, new Date(),new Department(103, "教研部")));
		employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 0,new Date(), new Department(104, "运营部")));
		employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 1,new Date(), new Department(105, "后勤部")));
		
	}
	//主键自增
	private static Integer initId = 1006;
	//添加一个员工
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}
	//查询全部员工
	public Collection<Employee> getAll(){
		return employees.values();
	}
	//通过id查询员工
	public Employee get(Integer id){
		return employees.get(id);
	}
	//删除员工id
	public void delete(Integer id){
		employees.remove(id);
	}
}
