package com.wangling.springcloud.service;

import com.wangling.springcloud.entity.Dept;

import java.util.List;

public interface DeptService {
    public Boolean addDept(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();
}
