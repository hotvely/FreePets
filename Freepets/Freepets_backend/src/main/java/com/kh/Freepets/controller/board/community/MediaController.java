package com.kh.Freepets.controller.board.community;

import com.kh.Freepets.service.board.community.MediaCommentService;
import com.kh.Freepets.service.board.community.MediaLikeService;
import com.kh.Freepets.service.board.community.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class MediaController {
    @Autowired
    private MediaService mediaService;
    @Autowired
    private MediaCommentService mediaCommentService;
    @Autowired
    private MediaLikeService mediaLikeService;

    //미디어 전체 조회 GET - http://localhost:8000/api/media
    //미디어 추가 POST - http://localhost:8000/api/media
    //미디어 수정 PUT - http://localhost:8000/api/media
    //미디어 삭제 DELETE - http://localhost:8000/api/media/1
}
