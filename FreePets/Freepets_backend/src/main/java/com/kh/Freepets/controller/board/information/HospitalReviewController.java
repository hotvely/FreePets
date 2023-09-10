package com.kh.Freepets.controller.board.information;

import com.kh.Freepets.service.board.information.HospitalReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalReviewController {

    @Autowired
    private HospitalReviewService service;
}
