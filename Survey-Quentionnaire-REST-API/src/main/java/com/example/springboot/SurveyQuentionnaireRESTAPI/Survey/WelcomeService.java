package com.example.springboot.SurveyQuentionnaireRESTAPI.Survey;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {

		return "Good Morning updated";

	}
}
