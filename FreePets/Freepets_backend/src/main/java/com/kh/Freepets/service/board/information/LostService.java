package com.kh.Freepets.service.board.information;

import com.kh.Freepets.domain.board.community.Lost;
import com.kh.Freepets.repo.board.community.LostDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LostService {
    @Autowired
    private LostDAO dao;

    public List<Lost> showAll(){
        return dao.findAll();
    }

    public Lost show(int id){
        Lost lost =  dao.findById(id).orElse(null);
        return lost;
    }

    public Lost create(Lost lost){
    return lost;
    }
}
