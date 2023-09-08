package com.kh.Freepets.domain.board;

import jakarta.persistence.*;
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
    @Column
    private String title;
    @Column
    private String content;

}
