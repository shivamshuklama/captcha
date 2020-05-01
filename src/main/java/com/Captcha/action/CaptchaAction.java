 non package com.Captcha.action;
import com.Captcha.servlet.RoseIndiaCaptcha;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.*;
import com.opensymphony.xwork2.ActionContext;

public  class CaptchaAction  extends ActionSupport {
	public String execute() throws Exception {
			HttpServletRequest request  = (HttpServletRequest) ActionContext.getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
			Boolean isResponseCorrect = Boolean.FALSE;
			javax.servlet.http.HttpSession session = request.getSession();
			String parm = request.getParameter("j_captcha_response");
			String c= (String)session.getAttribute(RoseIndiaCaptcha.CAPTCHA_KEY) ;
			if(!parm.equals(c) ){
			addActionError("Invalid Code! Please try again!");
			return ERROR;
		}else{
		return SUCCESS;
		}
		// return error if invalid code else return success
	}
}
