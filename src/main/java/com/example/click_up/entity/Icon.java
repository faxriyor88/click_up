package com.example.click_up.entity;

import com.example.click_up.entity.template.AbsEntity;
import com.example.click_up.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Icon extends AbsEntity {
    @ManyToOne
    private Attachment attachment;
    private String color;
    private String initial_letter;

}
