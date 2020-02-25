package com.satan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Description
 * @Author Satan
 * @Date 2020/2/2518:16
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private Integer id;
	private String lastName;
	private String email;
	private Integer gender;
	private Date birth;
	private Department department;

}
