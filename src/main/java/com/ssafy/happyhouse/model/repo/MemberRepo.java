package com.ssafy.happyhouse.model.repo;

import java.sql.SQLException;

import com.ssafy.happyhouse.model.MemberDto;

public interface MemberRepo {

	// select
	MemberDto select(String id) throws SQLException;

	// insert
	int insert(MemberDto member) throws SQLException;

	// update
	int update(MemberDto member) throws SQLException;

	// delete
	int delete(String id) throws SQLException;

}