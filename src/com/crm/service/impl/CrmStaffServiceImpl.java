package com.crm.service.impl;

import com.crm.dao.CrmStaffDao;
import com.crm.domain.CrmStaff;
import com.crm.service.CrmStaffService;
import com.crm.utils.MyStringUtils;

import java.util.List;

public class CrmStaffServiceImpl implements CrmStaffService{
    private CrmStaffDao staffDao;

    public void setStaffDao(CrmStaffDao staffDao) {
        this.staffDao = staffDao;
    }

    @Override
    public CrmStaff login(CrmStaff staff) {
        return staffDao.find(staff.getLoginName(), MyStringUtils.getMd5Value(staff.getLoginPwd()));
    }

    @Override
    public List<CrmStaff> findAllStaff() {
        return staffDao.findAll();
    }
}
