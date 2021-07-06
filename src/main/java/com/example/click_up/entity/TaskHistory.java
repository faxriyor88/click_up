package com.example.click_up.entity;

import com.example.click_up.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class TaskHistory extends AbsEntity {
    @ManyToOne
    private Task task;
    private String change_field_name;
    private boolean before;
    private boolean after;
    private String data;
}
