package com.example.click_up.entity;

import com.example.click_up.entity.enums.Permission;
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
public class WorkSpacePermission extends AbsEntity {
    @ManyToOne
    private WorkSpaceRole workSpaceRole;
    @Enumerated(EnumType.STRING)
    private Permission permission;
}
