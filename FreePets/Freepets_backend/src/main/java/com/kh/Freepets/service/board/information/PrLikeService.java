package com.kh.Freepets.service.board.information;

import com.kh.Freepets.domain.board.information.PrLike;
import com.kh.Freepets.repo.board.information.PrLikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrLikeService {

    @Autowired
    private PrLikeDAO dao;

    public PrLike prAddLike(PrLike prLike) {
        return dao.save(prLike);
    }

    public PrLike prDeleteLike(int prLikeCode) {
        PrLike prLike = dao.findById(prLikeCode).orElse(null);
        dao.delete(prLike);
        return prLike;
    }
}
