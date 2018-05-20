package com.shamsulhaque.collections;

public interface CStore {

	public boolean insert(int key, Object value);
	public boolean deleteByIndex(int key);
	public boolean deleteValue(Object value);
	public boolean get(int index);
}
