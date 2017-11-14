package com.crm.dao.impl;

import com.crm.dao.CrmStaffDao;
import com.crm.domain.CrmStaff;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class CrmStaffDaoImpl extends HibernateDaoSupport implements CrmStaffDao {

    @Override
    public CrmStaff find(String loginName, String loginPwd) {
        List<CrmStaff> staffList =  this.getHibernateTemplate().find("from CrmStaff where loginName=? and loginPwd=?",loginName,loginPwd);
        if (staffList.size() == 1) {
            return staffList.get(0);
        }
        return null;
    }

    @Override
    public List<CrmStaff> findAll() {
        return this.getHibernateTemplate().find("from CrmStaff");
    }
}
