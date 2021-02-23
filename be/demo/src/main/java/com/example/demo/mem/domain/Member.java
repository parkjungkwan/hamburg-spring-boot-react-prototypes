package com.example.demo.mem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Member {
	@Id @Column(name="mem_no") private int memNo;
	@Column(name="mem_id") private String memid;
	@Column(name="password") private String password;
}