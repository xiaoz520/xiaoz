package org.spring.springboot;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.annotation.JSONField;

@Service
@EnableAsync
public class MyTestImpl implements MyTest {

	@Override
	public void test() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<BaItem> getList(List<BaItem> all) {
		// TODO Auto-generated method stub
		return all.stream().filter(p -> p.getItemNo().equals("001")).collect(Collectors.toList());
	}

	@Override
	public List<BaItem> getListAll() {
		List<BaItem> all = new ArrayList<BaItem>();

		BaItem item1 = new BaItem();
		item1.setItemNo("001");
		item1.setItemName("姓名1");
		item1.setLength(new BigDecimal(3));
		item1.setProducDate(new Date());

		BaItem item11 = new BaItem();
		item11.setItemNo("001");
		item11.setItemName("姓名1");
		item11.setLength(new BigDecimal(6));

		BaItem item2 = new BaItem();
		item2.setItemNo("002");
		item2.setItemName("2");
		item2.setLength(new BigDecimal(6));

		// item2.setProducDate(new Date());
		all.add(item1);
		all.add(item11);
		all.add(item2);
		return all;

	}

	@Override
	@Async
	public void sayHello(String words) {
		System.out.println(words);
	}

	@Override
	// @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@JSONField(format = "yyyy-MM-dd")
	public Date getNowDate() {
		return new Date();
	}

	@Override
	public Double getMaxValue(Double a, Double b) {
		// TODO Auto-generated method stub
		return Math.max(a, b);
	}

	@Override
	public List<String> getItemNoList(List<BaItem> all) {
		// TODO Auto-generated method stub
		return all.stream().map(p -> p.getItemNo()).collect(Collectors.toList());
	}

	@Override
	public Map<String, Map<String, List<BaItem>>> getItemNoGrouMap(List<BaItem> all) {
		return all.stream().collect(Collectors.groupingBy(BaItem::getItemNo, Collectors.groupingBy(BaItem::getItemNo)));
	}

}
