package com.crm.action;

import com.crm.domain.CrmStaff;
import com.crm.service.CrmStaffService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class StaffAction extends ActionSupport implements ModelDriven<CrmStaff> {
    private CrmStaff staff = new CrmStaff();

    @Override
    public CrmStaff getModel() {
        return staff;
    }

    private CrmStaffService staffService;

    public void setStaffService(CrmStaffService staffService) {
        this.staffService = staffService;
    }

    public String login() {
        CrmStaff loginStaff = staffService.login(staff);
        if (loginStaff != null) {
            ActionContext.getContext().getSession().put("loginStaff",loginStaff);
            return SUCCESS;
        }
        this.addFieldError("", "用户名与密码不匹配");
        return "login";
    }

    public String home() {
        return "home";
    }

    public String findAll() {
        List<CrmStaff> staffList = staffService.findAllStaff();
        ActionContext.getContext().put("allStaff",staffList);
        return "findAll";
    }
}
