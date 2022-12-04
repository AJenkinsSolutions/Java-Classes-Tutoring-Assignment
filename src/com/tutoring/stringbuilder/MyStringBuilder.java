package com.tutoring.stringbuilder;

public class MyStringBuilder {
		private String string;

		public MyStringBuilder(String s) {
			this.string = s;
		}

		public MyStringBuilder append(MyStringBuilder sb) {
			
			String inputString = sb.getString();
			String newString = this.string + inputString;
			
			return new MyStringBuilder(newString);
		}
		
		public MyStringBuilder append(int i) {
			String inputString = Integer.toString(i);
			String newString = this.string + inputString;
			return new MyStringBuilder(newString);
		}
		
		public int length() {
			return this.string.length();
		}

		
		public char charAt(int index) {
			return this.string.charAt(index);
		}
		
		public MyStringBuilder toLowerCase() {
			
			return new MyStringBuilder(this.string.toLowerCase());
		}
		
		public MyStringBuilder substring(int begin, int end) {
			return new MyStringBuilder(this.string.substring(begin, end));
		}
		
		public String getString() {
			return string;
		}

		
		@Override
		public String toString() {
			return  string;
		}
		
		

}
