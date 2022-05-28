package com.rubypaper.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.util.Date;

@Entity
@TableGenerator(name = "BOARD_SEQ_GENERATOR",
        table = "ALL_SEQUENCES",
        pkColumnName = "BOARD_SEQ",
        allocationSize = 1)
@Getter @Setter
@ToString
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "BOARD_SEQ_GENERATOR")
    private Long seq;

    private String title;
    private String writer;
    private String content;
    @Temporal(TemporalType.DATE)
    private Date createDate;
    private Long cnt;
}
