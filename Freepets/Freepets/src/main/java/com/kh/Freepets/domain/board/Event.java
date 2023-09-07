package com.kh.Freepets.domain.board;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


// 이 클래스는 혹시 나중에 공공데이터 쪽에서 여행정보 관련 나오게 된다면... 그때 생각해 볼 만 한 클래스
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event
{
    private int id;
    private String content;

    private Date date;


}
