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
public class WorkSpaceUser extends AbsEntity {
    @ManyToOne
    private WorkSpace workSpace;
    @ManyToOne
    private User user;
    @ManyToOne
    private WorkSpaceRole workSpaceRole;
    private Timestamp date_invited;
    private Timestamp date_joined;


}
