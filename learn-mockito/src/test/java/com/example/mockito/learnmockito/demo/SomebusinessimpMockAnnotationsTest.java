package com.example.mockito.learnmockito.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.mockito.learnmockito.business.Somebusinessimp;
import com.example.mockito.learnmockito.datademo.DataService;

@RunWith(MockitoJUnitRunner.class)
class SomebusinessimpMockAnnotationsTest {

	@Mock
	DataService DataService;

	@InjectMocks
	Somebusinessimp businessImpl;

	@Test
	public void testFindTheGreatestFromAllData() {
		when(DataService.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_ForOneValue() {
		when(DataService.retrieveAllData()).thenReturn(new int[] { 15 });
		assertEquals(15, businessImpl.findTheGreatestFromAllData());
	}

	@Test
	public void testFindTheGreatestFromAllData_NoValues() {
		when(DataService.retrieveAllData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
	}

}
