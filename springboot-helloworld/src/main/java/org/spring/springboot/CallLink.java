package org.spring.springboot;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSONObject;

public class CallLink implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JSONObject link;

	public JSONObject getLink() {
		return link;
	}

	public void setLink(JSONObject link) {
		this.link = link;
	}

	public CallLink() {
		this.setLink(new JSONObject(new LinkedHashMap<String, Object>()));
	}

	public void add(String key) {
		Date date = new Date(); // 获取当前的系统时间。
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 使用了默认的格式创建了一个日期格式化对象。
		String time = dateFormat.format(date); // 可以把日期转换转指定格式的字符串
		link.put(key, time);
	}

}
