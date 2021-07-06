package com.example.click_up.entity;

import com.example.click_up.entity.enums.TaskPermission;
import com.example.click_up.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;


@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CategoryUser extends AbsEntity {
    private String name;
    @ManyToOne
    private Category category;
    @ManyToOne
    private User user;
    @Enumerated(EnumType.STRING)
    private TaskPermission taskPermission;
}
