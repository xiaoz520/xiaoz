package org.spring.springboot;

import java.math.BigDecimal;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class BaItem {
	private String itemNo;

	private String itemName;

	private BigDecimal length;

	@JSONField(format = "yyyy-MM-dd")
	private Date producDate;

	public Date getProducDate() {
		return producDate;
	}

	public void setProducDate(Date producDate) {
		this.producDate = producDate;
	}

	public BigDecimal getLength() {
		return length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public String getItemNo() {
		return itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
