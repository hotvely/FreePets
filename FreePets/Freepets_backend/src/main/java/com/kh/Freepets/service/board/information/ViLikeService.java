package com.kh.Freepets.service.board.information;

import com.kh.Freepets.domain.board.information.ViLike;
import com.kh.Freepets.repo.board.information.ViLikeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViLikeService {

    @Autowired
    private ViLikeDAO dao;
    
    // 좋아요 하기
    public ViLike viAddLike(ViLike viLike) {
        return dao.save(viLike);
    }
    
    // 좋아요 삭제
    public ViLike viDeleteLike(int viLikeCode) {
        ViLike viLike = dao.findById(viLikeCode).orElse(null);
        dao.delete(viLike);
        return viLike;
    }
}
