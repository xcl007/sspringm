package com.zhiyou100.springdemo.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;



@SuppressWarnings("serial")
public class Dept implements Serializable {
	private Integer deptno;
	private String dname;
	private String loc;
    private List<String> group;
    private Set<String> groups ;
    private Map<Integer,String> groups1;

    
	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public Dept(){
		
	}
	public Integer getDeptno() {
		return deptno;
	}

	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}
	

	public List<String> getGroup() {
		return group;
	}

	public void setGroup(List<String> group) {
		this.group = group;
	}
	

	public Set<String> getGroups() {
		return groups;
	}

	public void setGroups(Set<String> groups) {
		this.groups = groups;
	}
	

	public Map<Integer, String> getGroups1() {
		return groups1;
	}

	public void setGroups1(Map<Integer, String> groups1) {
		this.groups1 = groups1;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", group=" + group + ", groups="
				+ groups + ", groups1=" + groups1 + "]";
	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", group=" + group + ", groups="
//				+ groups + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", group=" + group + "]";
//	}

//	@Override
//	public String toString() {
//		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
//	}

	
	
	
}
