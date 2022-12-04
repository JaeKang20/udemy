package com.in28minutes.primitive.datatypes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
//	BigDecimal principal;
//	BigDecimal interest;
//
//	public SimpleInterestCalculator(String principal, String interest) {
//		this.principal = new BigDecimal(principal);
//		this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
//	}
//
//	public BigDecimal calculateTotalValue(int noOfYears) {
//		BigDecimal totalValue = principal.add(principal.multiply(interest.multiply(new BigDecimal(noOfYears))));
//		return totalValue;
//	}

	BigDecimal principal; // 원리
	BigDecimal interest; // 이자율

	public SimpleInterestCalculator(String principal, String interest) { // 생성자는 원리와 이자율을 무조건 넣어주어야함
		this.principal = new BigDecimal(principal); // 원리를 BigDecimal에 넣어줌
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100)); // interest는 100을 나누어주어야함
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		// principal + principal * interest * noOfYears
		BigDecimal totalValue = principal.add(principal.multiply(interest.multiply(new BigDecimal(noOfYears))));
		return totalValue;
	}

}
