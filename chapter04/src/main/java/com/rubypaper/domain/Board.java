package com.rubypaper.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.util.Date;

@Entity
@SequenceGenerator(name = "BOARD_SEQ_GENERATOR",
        sequenceName = "BOARD_SEQUENCE",
        initialValue = 1,
        allocationSize = 1)
@Getter @Setter
@ToString
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOARD_SEQ_GENERATOR")
    private Long seq;

    private String title;
    private String writer;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date createDate;
    private Long cnt;
}
