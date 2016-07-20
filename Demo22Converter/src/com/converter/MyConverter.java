package com.converter;

import java.awt.Point;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class MyConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		Point p = new Point();
		String[] xy = arg1[0].split(",");
		p.x = Integer.parseInt(xy[0]);
		p.y = Integer.parseInt(xy[1]);
		return p;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		return arg1.toString();
	}

}
