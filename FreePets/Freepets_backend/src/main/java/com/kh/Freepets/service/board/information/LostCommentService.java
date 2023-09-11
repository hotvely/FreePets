package com.kh.Freepets.service.board.information;

import com.kh.Freepets.repo.board.community.LostCommentDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LostCommentService {

    @Autowired
    private LostCommentDAO dao;
}

