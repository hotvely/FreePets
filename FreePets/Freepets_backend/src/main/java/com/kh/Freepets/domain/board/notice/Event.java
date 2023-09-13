package com.kh.Freepets.domain.board.notice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicInsert
public class Event {

    @Id
    @Column(name = "event_code")
    private int eventCode;
    
    @Column(name = "event_title")
    private String eventTitle;

    @Column(name = "event_contents")
    private String eventContents;

    @Column(name = "event_date")
    private Date eventDate;

    @Column(name = "event_link")
    private String eventLinkAddress;

}
