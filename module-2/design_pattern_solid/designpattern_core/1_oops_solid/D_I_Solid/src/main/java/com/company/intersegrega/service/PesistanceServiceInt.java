package com.company.intersegrega.service;
import java.util.List;
import com.company.intersegrega.entity.Entity;

public interface PesistanceServiceInt <T extends Entity>{
	public List<T> findByName(String name);
}
