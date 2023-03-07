package array;

public class EnhanceFor {

	public static void main(String[] args) {
		
	String[] strArr = {"Java", "Android", "C"};
	
	/*
	  for(int i = 0; i<strArr.length; i++) {
		System.out.println(strArr[i]);
		
		기존 사용했던 for문을 아래 처럼 편하게 활용할 수도 있음*/ 
	
	for(String s : strArr) {
		System.out.println(s);
	}
	
	int[] arr = {1,2,3,4,5};
	
	for(int num : arr) {
		System.out.println(num);
	}
}
}


   