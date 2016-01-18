package com.parvez;
import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdvisorTagHandler extends SimpleTagSupport {
private String user;

public String getUser() {
	return user;
}

public void setUser(String user) {
	this.user = user;
}

public void doTag() throws JspException,IOException
{
	getJspContext().getOut().write("Hello "+user+"<br/>");
}
}
