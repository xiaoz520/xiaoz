package org.spring.springboot;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class CalcImpl implements Calc {

	@Override
	public BigDecimal myCacl(BigDecimal a, BigDecimal b, BigDecimal c) {
		return a.multiply(b).divide(c).setScale(2, BigDecimal.ROUND_HALF_UP);
	}

}
