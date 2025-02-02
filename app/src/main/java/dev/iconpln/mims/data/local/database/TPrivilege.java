package dev.iconpln.mims.data.local.database;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "TPRIVILEGE".
 */
@Entity
public class TPrivilege {

    @Id
    private Long id;
    private String ModuleId;
    private String IsActive;
    private String RoleId;
    private String MethodId;
    private String MethodValue;

    @Generated
    public TPrivilege() {
    }

    public TPrivilege(Long id) {
        this.id = id;
    }

    @Generated
    public TPrivilege(Long id, String ModuleId, String IsActive, String RoleId, String MethodId, String MethodValue) {
        this.id = id;
        this.ModuleId = ModuleId;
        this.IsActive = IsActive;
        this.RoleId = RoleId;
        this.MethodId = MethodId;
        this.MethodValue = MethodValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModuleId() {
        return ModuleId;
    }

    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    public String getIsActive() {
        return IsActive;
    }

    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }

    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    public String getMethodId() {
        return MethodId;
    }

    public void setMethodId(String MethodId) {
        this.MethodId = MethodId;
    }

    public String getMethodValue() {
        return MethodValue;
    }

    public void setMethodValue(String MethodValue) {
        this.MethodValue = MethodValue;
    }

}
