package com.hw.frame;

import java.util.List;

public interface Dao<T,S> {
	public void insert(T t);
	public void delete(S s);
	public void update(T t);
	public T select(S s);
	public List<T> select();
}
