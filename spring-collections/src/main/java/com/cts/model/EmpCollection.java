package com.cts.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class EmpCollection {
	List<Emp> list;
	Set<Emp> set;
	Map<Integer,Emp> map;
	Properties prop;
	public List<Emp> getList() {
		return list;
	}
	public void setList(List<Emp> list) {
		this.list = list;
	}
	public Set<Emp> getSet() {
		return set;
	}
	public void setSet(Set<Emp> set) {
		this.set = set;
	}
	public Map<Integer, Emp> getMap() {
		return map;
	}
	public void setMap(Map<Integer, Emp> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
}
