package com.sdippolito.library;

import java.util.Calendar;

@SuppressWarnings("serial")
public class DateFormatterException extends Exception {
	String formatReq;
	private String catchDate;
	
	public String getCatchDate() {
		return catchDate;
	}
	public void setCatchDate(Calendar publishDate) {
		catchDate = String.format("%tB %te, %tY.", publishDate, publishDate, publishDate);
		
	}
	public Calendar defaultDate() {
		Calendar publishDate = Calendar.getInstance();
		return publishDate;
	}
	public String toString(){
		setCatchDate(defaultDate());
		return "Please use ".concat(formatReq).concat(" format to set publish date. Date will defualt to today's date: ").concat(catchDate);
		
	}
	public DateFormatterException(String formatReq) {
		this.formatReq = formatReq;
	}

}
