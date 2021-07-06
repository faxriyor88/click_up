package com.example.click_up.entity;

import com.example.click_up.entity.template.AbsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.sql.Timestamp;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Task extends AbsEntity {
    private String name;
    private String description;
    @ManyToOne
    private Status status;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Priority priority;
    @ManyToOne
    private Task parent_task_id;
    private Timestamp started_date;
    private Timestamp start_time_has;
    private Timestamp due_date;
    private Timestamp due_time_hase;
    private Timestamp estimate_time;
    private Timestamp actived_date;
}
