package com.douzone.aoptest.vo;

public class ProductVo {
	private String name;
	
	@Override
	public String toString() {
		return "ProductVo [name=" + name + "]";
	}

	public ProductVo(String name) {
		this.name= name;
	}
}
