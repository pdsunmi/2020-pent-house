package com.ssafy.happyhouse.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssafy.happyhouse.model.Board;
import com.ssafy.happyhouse.model.repo.ReviewRepo;

@Service
public class ReviewServiceImpl implements ReviewService {
	
    @Autowired
	private ReviewRepo reviewRepo;

    @Override
	public List<Board> retrieveBoard() {
		return reviewRepo.selectBoard();
	}
    
  	@Override
	public boolean writeBoard(Board board) {
		return reviewRepo.insertBoard(board) == 1;
	}

	@Override
	public Board detailBoard(int no) {
		return reviewRepo.selectBoardByNo(no);
	}

	@Override
	@Transactional
	public boolean updateBoard(Board board) {
		return reviewRepo.updateBoard(board) == 1;
	}

	@Override
	@Transactional
	public boolean deleteBoard(int no) {
		return reviewRepo.deleteBoard(no) == 1;
	}
}