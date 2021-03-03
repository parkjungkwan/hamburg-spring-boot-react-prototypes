package com.example.demo.brd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.brd.domain.Board;
import com.example.demo.brd.domain.BoardDto;
import com.example.demo.mem.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
@Repository
public class BoardRepositoryImpl extends QuerydslRepositorySupport 
						implements IBoardRepository{
	private final JPAQueryFactory qf;
	public BoardRepositoryImpl(JPAQueryFactory qf) {
		super(Board.class);
		this.qf = qf;
	}
}
