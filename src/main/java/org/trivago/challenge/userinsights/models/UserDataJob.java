package org.trivago.challenge.userinsights.models;


public class UserDataJob {
	public static enum DATA_PROCESSING_STATUS {
		PROGRESS,
		SUCCESSFUL,
		FAILED
	}
	
	private static Integer idInitializer = 0;
	
	private final Integer jobId = ++ idInitializer; 

	private DATA_PROCESSING_STATUS jobStatus = DATA_PROCESSING_STATUS.PROGRESS; 
}
