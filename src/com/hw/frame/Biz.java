package com.hw.frame;

import java.util.List;

public interface Biz<T,S> {
	public void register(T t);
	public void remove(S s);
	public void modify(T t);
	public T get(S s);
	public List<T> get();
}
