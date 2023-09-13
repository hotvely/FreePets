package com.kh.Freepets.service.board.information;

import com.kh.Freepets.domain.board.information.HrLike;
import com.kh.Freepets.repo.board.information.HrLikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HrLikeService {

    @Autowired
    private HrLikeDAO dao;

    public HrLike hrAddLike(HrLike hrLike) {
        return dao.save(hrLike);
    }

    public HrLike hrDeleteLike(int hrLikeCode) {
        HrLike hrLike = dao.findById(hrLikeCode).orElse(null);
        dao.delete(hrLike);
        return hrLike;
    }
}
