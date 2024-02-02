package com.example.mockito.learnmockito.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.example.mockito.learnmockito.datademo.DataService;

class SomebusinessimpMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		DataService DataService = mock(DataService.class);
		when(DataService.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		Somebusinessimp businessImpl = new Somebusinessimp();
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		DataService DataService = mock(DataService.class);
		when(DataService.retrieveAllData()).thenReturn(new int[] { 15 });
		Somebusinessimp businessImpl = new Somebusinessimp();
		int result = businessImpl.findTheGreatestFromAllData();
		assertEquals(15, result);
	}

}
