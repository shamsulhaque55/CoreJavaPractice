package com.shamsulhaque.collections;

import java.util.ArrayList;
import java.util.List;

public class CStoreImpl<T> implements CStore {
	
	private int key;
	private T value;
	private List<CStoreImpl> data = new ArrayList<>();

	@Override
	public boolean insert(int key, Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteByIndex(int key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean get(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

}
