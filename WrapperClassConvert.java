package com.assignment;

public class WrapperClassConvert {

	public static void main(String[] args) {
     int object = 10;
     CovertToWrapper(object);

	}

	private static Integer CovertToWrapper(int object) {
		Integer b = Integer.valueOf(object);
		Float c = Float.valueOf(object);
		try {
			if (b instanceof Integer) {
				System.out.println(b);
			}else
			{
				System.out.println("Enter Valid Input");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}

}
