package _01_Custom_ArrayList;

import _00_Intro_To_Generics.IntroToGenerics;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException { 
		if(loc >= 0 && loc < list.length) {
			return list[loc];
		}
		else {
			return null;
		}
	}
	
	public void add(T val) {
		T[] list2 = (T[]) new Object[list.length+1];
		for (int i = 0; i < list.length; i++) {
			list2[i] = list[i];
		}
		list2[list2.length-1] = val;
		list = list2;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] list4 = (T[]) new Object[list.length+1];
		if(loc >= 0 && loc < list.length) {
			for (int i = 0; i < list4.length; i++) {
				if(i < loc) {
					list4[i] = list[i];
				}
				else if(i > loc) {
					list4[i] = list[i-1];
				}
				else {
					list4[i] = val;
				}
			}
		}
		else {
			throw new IndexOutOfBoundsException();
		}
		list = list4;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc >= 0 && loc < list.length) {
			list[loc] = val;
		}
		else {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] list3 = (T[]) new Object[list.length-1];
		for (int i = 0; i < loc; i++) {
			list3[i] = list[i];
		}
		for (int i = loc+1; i < list.length; i++) {
			list3[i-1] = list[i];
		}
		list = list3;
	}
	
	public boolean contains(T val) {
		int contains = 0;
		for (int i = 0; i < list.length; i++) {
			if(list[i] == val) {
				contains += 1;
			}
		}
		if(contains != 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public int size() {
		return list.length;
	}

	
}