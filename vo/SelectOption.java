package com.lgj.vo;

import java.io.Serializable;

public class SelectOption implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//下拉框的值
	private int value;
	//下拉框显示的文本
	private String text;
	
	//=========getter setter============
	public int getValue() {
		return value;
	}
	public String getText() {
		return text;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void setText(String text) {
		this.text = text;
	}
	
}
