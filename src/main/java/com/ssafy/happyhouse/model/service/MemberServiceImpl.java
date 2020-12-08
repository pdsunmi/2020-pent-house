package com.ssafy.happyhouse.model.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.happyhouse.model.MemberDto;
import com.ssafy.happyhouse.model.repo.MemberRepo;


@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberRepo repo;

	// 로그인
//	@Override
//	public boolean login(String id, String pass) throws SQLException {
//
//		MemberDto member = repo.select(id);
//		System.out.println("로그인 조회결과:" + member);
//		if (member != null && member.getPassword().equals(pass)) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
	
	@Override
	public MemberDto login(MemberDto memberDto) throws Exception {
		System.out.println("아이디 찍어본다" + memberDto.getId());
		MemberDto member = repo.select(memberDto.getId());
		System.out.println("디비에서 로그인 조회결과:" + member);
		if (member != null && member.getPassword().equals(memberDto.getPassword())) { //아이디가 존재하고
			return member;
		} else {
			return null;
		}
	}

	// 회원 조회
	@Override
	public MemberDto lookup(String id) throws SQLException {

		MemberDto member = repo.select(id);
		System.out.println("회원조회결과:" + member);
		return member;

	}

	// 회원가입
	@Override
	public int join(MemberDto member) throws SQLException {

		int result = -1;
		result = repo.insert(member);
		MemberDto selected = repo.select(member.getId());
		System.out.println("insert결과:" + selected);

		return result;
	}

	// 회원삭제
	@Override
	public boolean delete(String id) throws SQLException {

		int result = 0;
		result = repo.delete(id);
		System.out.println("삭제 결과:" + result);
		if (result == 1) {
			return true;
		} else {
			return false;
		}

	}

	// 회원 수정
	@Override
	public boolean update(MemberDto member) throws SQLException {
		int result = 0;
			result = repo.update(member);
			System.out.println("업데이트 결과:" + result);
			if (result == 1) {
				return true;
			} else {
				return false;
			}
		}
	}


