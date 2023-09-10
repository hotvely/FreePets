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
public class HospitalReviewController {

    @Autowired
    private HospitalReviewService service;

    @GetMapping("/hr")
    public ResponseEntity<List<HospitalReview>> showAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.showAll());
        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> show(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.show(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }


    @PostMapping("/hr")
    public ResponseEntity<HospitalReview> create(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.create(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/hr")
    public ResponseEntity<HospitalReview> update(@RequestBody HospitalReview hospitalReview) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.update(hospitalReview));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/hr/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> delete(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.delete(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/like/{hospitalReviewCode}")
    public ResponseEntity<HospitalReview> updateLike(@PathVariable int hospitalReviewCode) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.updateLike(hospitalReviewCode));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/orderlike")
    public ResponseEntity<List<HospitalReview>> showLike() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.showLike());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/hr/ordercomment")
    public ResponseEntity<List<HospitalReview>> showComment() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(service.showComment());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
