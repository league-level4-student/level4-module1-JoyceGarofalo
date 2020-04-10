package _01_Custom_ArrayList;

import _00_Intro_To_Generics.IntroToGenerics;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;

	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException { 
		if(loc < 0 || loc > list.length) {
			throw new IndexOutOfBoundsException();
		}
		else {
			return list[loc];
		}
	}
	
	public void add(T val) {
		T[] list2 = (T[]) new Object[list.length+1];
		for (int i = 0; i < list.length; i++) {
			list2[i] = list[i];
		}
		list2[list2.length-1] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		if(loc > 0 && loc < list.length) {
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
			list3[i] = list[i];
		}
	}
	
	public boolean contains(T val) {
		
		return false;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}