package com.ssafy.happyhouse.model.repo;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.happyhouse.model.Board;

@Mapper
public interface ReviewRepo {

	public List<Board> selectBoard();

	public Board selectBoardByNo(int no);

	public int insertBoard(Board board);

	public int updateBoard(Board board);

	public int deleteBoard(int no);

}