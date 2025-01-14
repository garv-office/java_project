package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

class Key {
	private int k;

	public Key(int k) {
		this.k = k;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("finilized is called");
		super.finalize();
	}

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return k == other.k;
	}

}

public class DemoWeakHashMap {

	public static void main(String[] args) {
		Key k=new Key(2);
		
		Map<Key, String> map=new WeakHashMap<>();
		map.put(k, "two");
		
		k=null;
		System.gc();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		System.out.println(map);
	}
}
