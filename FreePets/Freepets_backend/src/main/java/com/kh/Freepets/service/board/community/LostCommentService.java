package com.kh.Freepets.service.board.community;

import com.kh.Freepets.domain.board.community.LostComment;
import com.kh.Freepets.repo.board.community.LostCommentDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LostCommentService {

    @Autowired
    private LostCommentDAO dao;

    public LostComment create(LostComment lostcomment){


        return dao.save(lostcomment);
    }
}

