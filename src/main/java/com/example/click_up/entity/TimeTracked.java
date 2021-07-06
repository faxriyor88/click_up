package com.example.click_up.entity;

import com.example.click_up.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TimeTracked extends AbsEntity {
    @ManyToOne
    private Task task;
    private Timestamp started_at;
    private Timestamp stopped_at;
}
