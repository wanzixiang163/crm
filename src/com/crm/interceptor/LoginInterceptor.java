package com.crm.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.aopalliance.intercept.MethodInterceptor;

public class LoginInterceptor extends MethodFilterInterceptor {

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        Object object = ActionContext.getContext().getSession().get("loginStaff");
        if (object == null) {
            Object action = actionInvocation.getAction();  //获得当前运行action
            if (action instanceof ActionSupport) {
                ActionSupport actionSupport = (ActionSupport) action;
                actionSupport.addFieldError("","请登录");
            }
            return "login";
        }
        return actionInvocation.invoke();
    }
}
