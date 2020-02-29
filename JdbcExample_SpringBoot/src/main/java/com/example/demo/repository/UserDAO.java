package com.example.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Vo;
import com.example.demo.entity.User;

@Repository
public class UserDAO {

	ArrayList<Vo> al = new ArrayList<>();
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<User> findAll() {
		return jdbcTemplate.query("select * from logindetails", new BeanPropertyRowMapper<User>(User.class));
	}

	// using prepareStatement to execute query
	public User getById(int id) {
		User queryForObject = jdbcTemplate.queryForObject("select * from logindetails where id=?", new Object[] { 0 },
				new BeanPropertyRowMapper<User>(User.class));
		return queryForObject;
	}

	// RowMapper implementation by java 8
	public List<User> findAll1() {
		return jdbcTemplate.query("select * from logindetails", (rs, rowNum) -> {
			User user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setPassword(rs.getString(3));
			// user.setDob(rs.getString(4));

			return user;
		});
	}
	
	public int deleteById() {
		return jdbcTemplate.update("delete from logindetails where id = 0");
	}
	
	public int updateName() {
		return jdbcTemplate.update("update logindetails set name=? where id = ?", new Object[]{"madhu", 1});
	}
	
	public ArrayList<Vo> pidList() {
		Vo vo = new Vo("1", "guru", "g", "badvel");
		Vo vo1 = new Vo("1", "guru1", "g", "badvel");
		Vo vo2 = new Vo("1", "guru2", "g", "badvel");
		Vo vo3 = new Vo("2", "guru3", "g", "badvel");
		Vo vo4 = new Vo("2", "guru4", "g", "badvel");
		Vo vo5 = new Vo("2", "guru5", "g", "badvel");
		Vo vo6 = new Vo("2", "guru6", "g", "badvel");
		Vo vo7 = new Vo("3", "guru7", "g", "badvel");
		Vo vo8 = new Vo("4", "guru8", "g", "badvel");
		Vo vo9 = new Vo("4", "guru4", "g4", "badvel");
		ArrayList<Vo> arrayList = new ArrayList<>();
		arrayList.add(vo);
		arrayList.add(vo1);
		arrayList.add(vo2);
		arrayList.add(vo3);
		arrayList.add(vo4);
		arrayList.add(vo5);
		arrayList.add(vo6);
		arrayList.add(vo7);
		arrayList.add(vo8);
		arrayList.add(vo9);
		arrayList.add(new Vo());
		HashSet<Vo> hashSet = new HashSet<>();
		for (Vo v : arrayList) {
			hashSet.add(v);
		}
		
		
		HashMap<String, Vo> map = new HashMap<>();
		int i = 0;
		Vo res = null;
		for (Vo v1 : arrayList) {
			
			if(!map.containsKey(v1.getPid())) {
				System.out.println("vo:"+v1.getPid());
				al.add(res);
				map.put(v1.getPid(), v1);
				res = new Vo();
				res = v1;
				i = 0;
			}
			else {
				i++;
				addToOject(i,res, v1);
			}
			
		}
		//return hashSet;
		return al;
	}
	
	public void addToOject(int i, Vo res, Vo v1) {
		
		if(i==1) {
			res.setfName1(v1.getfName());
			res.setlName1(v1.getlName());
			res.setAddress1(v1.getAddress());
		}

		if(i==2) {
			res.setfName2(v1.getfName());
			res.setlName2(v1.getlName());
			res.setAddress2(v1.getAddress());
		}

		if(i==3) {
			res.setfName3(v1.getfName());
			res.setlName3(v1.getlName());
			res.setAddress3(v1.getAddress());
		}

		if(i==4) {
			res.setfName4(v1.getfName());
			res.setlName4(v1.getlName());
			res.setAddress4(v1.getAddress());
		}

	}
}
