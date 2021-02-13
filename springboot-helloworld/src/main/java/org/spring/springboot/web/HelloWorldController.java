package org.spring.springboot.web;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.spring.springboot.BaItem;
import org.spring.springboot.Calc;
import org.spring.springboot.CallLink;
import org.spring.springboot.MyDay;
import org.spring.springboot.MyTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

/**
 * Spring Boot HelloWorld 案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class HelloWorldController {

	@Autowired
	private MyTest myTest;

	@Autowired
	private Calc calc;

	@Autowired
	private MyDay myDay;

	@RequestMapping("/")
	public String sayHello() {
		CallLink callLink = new CallLink();
		callLink.add("开始");
		HashMap<String, String> shop = new HashMap<>();
		shop.put("name", "apple");

		List<BaItem> all = myTest.getListAll();

		String teString = "";
		List<BaItem> filterList = myTest.getList(all);

		for (BaItem baItem : filterList) {
			teString = teString + baItem.getItemNo() + baItem.getItemName();
		}
		callLink.add("中间");

		BigDecimal testSumBigDecimal = all.stream().map(BaItem::getLength).reduce(BigDecimal.ZERO, BigDecimal::add);

		testAsync();
		callLink.add("结束" + testSumBigDecimal);

		// return JSONObject.toJSONString(callLink.getLink());
		// List<String> itemNoList = myTest.getItemNoList(all);
		return JSONObject.toJSONString(myTest.getItemNoGrouMap(all));
		// return myTest.getMaxValue(Double.valueOf(3), Double.valueOf(2)).toString();
		/*
		 * return JSONObject .toJSONString(calc.myCacl(new BigDecimal("0.8"), new
		 * BigDecimal("0.6"), new BigDecimal("0.4")));
		 */
	}

	@RequestMapping("/test")
	public String test() {
		CallLink claLink = new CallLink();
		claLink.add("step1");
		List<String> list1 = Arrays.asList("文学", "小说 ", "历史 ", "言情 ", "科幻", "悬疑");
		String teString = list1.stream().collect(Collectors.joining(";"));
		List<String> newList = Arrays.asList(teString.split(";"));
		List<String> newList2 = newList.stream().map(p -> String.format(p.trim())).collect(Collectors.toList());
		claLink.add("step2");
		return JSONObject.toJSONString(claLink.getLink());

	}

	@RequestMapping("/myday/eat")
	public String eat() {
		return myDay.eat();
	}

	private void testAsync() {
		for (int i = 0; i < 10; i++) {
			myTest.sayHello(String.valueOf(i));

		}
	}
}
