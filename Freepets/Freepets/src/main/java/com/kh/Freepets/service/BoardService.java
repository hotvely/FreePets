package com.kh.Freepets.service;

import com.kh.Freepets.domain.board.Board;
import com.kh.Freepets.repo.board.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService
{
    @Autowired
    private BoardDAO dao;

    public List<Board> selectAll()
    {
        return dao.findAll();
    }

    public Board select(int id)
    {
        return dao.findById(id).orElse(null);
    }

    public Board update(Board board)
    {
        return dao.save(board);

    }

    public Board delete(int id)
    {
        Board data = dao.findById(id).orElse(null);
        if (data != null)
            dao.delete(data);
        return data;
    }

}
