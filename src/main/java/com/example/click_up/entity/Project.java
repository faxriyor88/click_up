package com.example.click_up.entity;
import com.example.click_up.entity.template.AbsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Project extends AbsEntity {
    private String name;
    @OneToOne
    private Space space;
    private boolean archived;
    private boolean access_type;
    private String color;

}
