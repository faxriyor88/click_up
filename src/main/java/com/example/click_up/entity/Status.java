package com.example.click_up.entity;
import com.example.click_up.entity.enums.StatusType;
import com.example.click_up.entity.template.AbsEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Status extends AbsEntity{
    private String name;
    @ManyToOne
    private Space space;
    @OneToOne
    private Project project;
    @ManyToOne
    private Category category;
    private String  color;
    @Enumerated(EnumType.STRING)
    private StatusType statusType;

}
