package com.pr.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "tb_page_data")
public class PageDataEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idx_page_data;
    private LocalDateTime enter_time;
    private LocalDateTime exit_time;
    private int age_group;
    private int gender;
    private int user_grade;
}
