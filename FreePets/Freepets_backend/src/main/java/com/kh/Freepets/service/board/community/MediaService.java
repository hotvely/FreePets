package com.kh.Freepets.service.board.community;

import com.kh.Freepets.domain.board.community.Media;
import com.kh.Freepets.repo.board.community.MediaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MediaService {
    @Autowired
    private MediaDAO mediaDAO;

    public List<Media> mediaAll(){
        return mediaDAO.findAll();
    }
    public Media showMedia(int id) {
        return mediaDAO.findById(id).orElse(null);
    }

    public Media create(Media mediaLike){
        return mediaDAO.save(mediaLike);
    }

    public Media update(Media mediaLike){
        Media target = mediaDAO.findById(mediaLike.getMediaCode()).orElse(null);
        if(target != null){
            return mediaDAO.save(mediaLike);
        }
        return null;
    }

    public Media delete(int id){
        Media target = mediaDAO.findById(id).orElse(null);
        mediaDAO.delete(target);
        return target;
    }
}
