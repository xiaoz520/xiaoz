package org.spring.springboot;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 */
public interface MyTest {

	void test();

	List<BaItem> getList(List<BaItem> all);

	List<BaItem> getListAll();

	List<String> getItemNoList(List<BaItem> all);

	/**
	 * @param words
	 */
	void sayHello(String words);

	Date getNowDate();

	Double getMaxValue(Double a, Double b);

	Map<String, Map<String, List<BaItem>>> getItemNoGrouMap(List<BaItem> all);

}
