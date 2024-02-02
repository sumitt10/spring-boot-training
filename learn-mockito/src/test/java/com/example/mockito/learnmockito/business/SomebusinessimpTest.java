package com.example.mockito.learnmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.mockito.learnmockito.datademo.DataService;

class SomebusinessimpTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		Somebusinessimp businessImpl = new Somebusinessimp();
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);

	}

}

class DataServiceStub implements DataService {
	public int[] retrieveAllData() {
		return new int[] { 24, 6, 15 };
	}
}