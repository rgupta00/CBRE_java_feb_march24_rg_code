package com.d_isp.intersegrega.service;
import com.d_isp.intersegrega.entity.Entity;

import java.util.List;


public interface PesistanceServiceInt <T extends Entity>{
	public List<T> findByName(String name);
}
