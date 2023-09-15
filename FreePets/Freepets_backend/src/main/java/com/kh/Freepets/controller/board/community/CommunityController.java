package com.kh.Freepets.controller.board.community;

import com.kh.Freepets.service.board.community.CommunityCommentService;
import com.kh.Freepets.service.board.community.CommunityLikeService;
import com.kh.Freepets.service.board.community.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/*")
public class CommunityController {
    @Autowired
    private CommunityService commonService;
    @Autowired
    private CommunityCommentService commonCommentService;
    @Autowired
    private CommunityLikeService commonLikeService;
}
