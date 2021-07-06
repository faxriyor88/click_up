package com.example.click_up.entity;
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
public class Space extends AbsEntity{
   private String name;
   private String color;
   @ManyToOne
   private WorkSpace workSpace;
   private String initial_letter;
   @OneToOne
   private Icon icon;
   @OneToOne
   private Attachment avatar;
   @OneToOne
   private User user;
   private boolean access_type;

}
