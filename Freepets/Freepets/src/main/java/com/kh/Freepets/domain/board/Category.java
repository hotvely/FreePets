package com.kh.Freepets.domain.board;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category
{
    @Column(name = "category_code")
    private int category_code;

    @Column(name = "category_name")
    private String category_name;
}
