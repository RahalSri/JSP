package com.rahal.tags;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SelectTag extends SimpleTagSupport implements DynamicAttributes{
	
	private String name;
	private String size;
	private List<String> optionList;
	private Map<String,Object> tagAttrs = new HashMap<String,Object>();
	private static final String ATTR_TEMPLATE = "%s='%s'";
	private static final String OPTION_TEMPLATE = "<option value='%1$s'> %1$s </option>";
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public void setOptionList(List<String> optionList) {
		this.optionList = optionList;
	}
	
	public void doTag() throws JspException,IOException {
		JspWriter out = getJspContext().getOut();
		//Start select tag
		out.write("<select ");
		//Adding mandatory attribute
		out.write(String.format(ATTR_TEMPLATE, "name", name));
		//Add dynamic attributes
		for(String attrName : tagAttrs.keySet()){
			String attrDefinition = String.format(ATTR_TEMPLATE, attrName,tagAttrs.get(attrName));
			out.write(attrDefinition);
		}
		out.write(" >");
		
		//Generate the <option> tags from optionList
		for(String option : optionList){
			out.write(String.format(OPTION_TEMPLATE, option));
		}
		out.write("</select>");
	}
	
	@Override
	public void setDynamicAttribute(String uri, String name, Object value)throws JspException {
		tagAttrs.put(name, value);
		
	}
	
}
