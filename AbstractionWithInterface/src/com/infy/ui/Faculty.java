package com.infy.ui;

import com.infy.lms.WingSpanImpl;

public class Faculty {
	public static void main(String args[])
	{
		WingSpanImpl ws=new WingSpanImpl();
		ws.getVideos();
		ws.uploadVideo("myURL");
	}

}
