package com.kh.Freepets.domain.board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Board
{

    @Id
    @Column(name = "id")
    private int id;
    private String title;
    private String content;

    private List<Post> posts = new ArrayList<>();
}
