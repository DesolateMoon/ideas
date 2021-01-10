package com.ideas.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class User {
	@Id
	private String email;
	
	private String name;
	private String password;
	
	//@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	//private List<Ideas> ideas = new ArrayList<Ideas>();

}
