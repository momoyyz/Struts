package com.yyz.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ModelDriven;
import com.yyz.page.UserPage;
@ParentPackage("struts-default")
@Namespace("/")
public class HellowAction implements ModelDriven<UserPage> {

	UserPage page = new UserPage();

	@Action(value = "h1", results = {
			@Result(name = "true", location = "/true.html"),
			@Result(name = "false", location = "/false.html")
	})
	public String h1() {
		if (page.getName().equals("zhangs") && page.getPwd().equals("123")) {
			return "true";
		} else {
			return "false";
		}
	}
	@Override
	public UserPage getModel() {
		return page;
	}

}
