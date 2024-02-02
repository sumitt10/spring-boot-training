package com.example.mockito.learnmockito.datademo;

public interface DataService {
	public default int[] retrieveAllData() {
		return null;
	}
}
