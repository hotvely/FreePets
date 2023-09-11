package com.kh.Freepets.controller.board.information;

import com.kh.Freepets.domain.board.information.HospitalReview;
import com.kh.Freepets.service.board.information.HospitalReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/info/*")
public class BoardController {

    @Autowired
    private HospitalReviewService hrService;

    @GetMapping("/hr")
    public ResponseEntity<List<HospitalReview>> hrShowAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrShow(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.show(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping("/hr")
    public ResponseEntity<HospitalReview> hrCreate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.create(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/hr")
    public ResponseEntity<HospitalReview> hrUpdate(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.update(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrDelete(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.delete(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/like/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> hrUpdateLike(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.updateLike(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/orderlike")
    public ResponseEntity<List<HospitalReview>> hrShowLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/ordercomment")
    public ResponseEntity<List<HospitalReview>> hrShowComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(hrService.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
