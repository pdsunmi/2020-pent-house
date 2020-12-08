package com.ssafy.happyhouse.model.service;

import java.sql.SQLException;

import com.ssafy.happyhouse.model.MemberDto;

public interface MemberService {

	// 로그인
	public MemberDto login(MemberDto memberDto) throws Exception;

	// 회원 조회
	MemberDto lookup(String id) throws SQLException;

	// 회원가입
	int join(MemberDto member) throws SQLException;

	// 회원삭제
	boolean delete(String id) throws SQLException;

	// 회원 수정
	boolean update(MemberDto member) throws SQLException;

}