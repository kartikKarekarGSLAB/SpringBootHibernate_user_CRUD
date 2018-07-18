package com.gslab.usercrud.USERCRUD.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="teacher")
public class Teacher {
	@GenericGenerator(
            name = "teachersSequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "teachersSequence"),
                    @Parameter(name = "initial_value", value = "1001"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
	@Id
	@Column(name="id")
	@GeneratedValue(generator="teachersSequenceGenerator")
	private int id;
	@Column(name="name",length=35,nullable=false)
	private String name;
	@Column(name="subject",length=20,nullable=false)
	private String subject;
	@Column(name="salary",nullable=false)
	private float salary;
	@Column(name="type",length=15)	
	private String type;
	
	public Teacher() {
	}

	public Teacher(int id, String name, String subject, float salary, String type) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.salary = salary;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
}
