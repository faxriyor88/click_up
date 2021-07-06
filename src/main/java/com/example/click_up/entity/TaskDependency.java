package com.example.click_up.entity;

import com.example.click_up.entity.enums.DependencyType;
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
public class TaskDependency  extends AbsEntity {
    @ManyToOne
    private Task task;
    @ManyToOne
    private Task dependency_task;
    @Enumerated(EnumType.STRING)
    private DependencyType dependencyType;

}
