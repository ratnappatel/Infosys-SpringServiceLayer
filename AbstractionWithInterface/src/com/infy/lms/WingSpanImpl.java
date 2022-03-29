package com.infy.lms;

public class WingSpanImpl  implements WingSpan{
	
	public void getVideos()
	{
		System.out.println("Getting video Tutorial");
	}
	
	public void uploadVideo(String url)
	{
		System.out.println("Uploading Video "+url);
	}

}
