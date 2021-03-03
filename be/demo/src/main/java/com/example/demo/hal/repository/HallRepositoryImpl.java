package com.example.demo.hal.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.hal.domain.Hall;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class HallRepositoryImpl extends QuerydslRepositorySupport implements IHallRepository {
	public HallRepositoryImpl(JPAQueryFactory qf) {
		super(Hall.class);
		this.qf = qf;
	}

	private final JPAQueryFactory qf;
	

}