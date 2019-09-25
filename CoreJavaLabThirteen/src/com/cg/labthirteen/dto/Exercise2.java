package com.cg.labthirteen.dto;

interface SplitString {
	public void splitString(String s);
}

public class Exercise2 {
	public void printStringWithSpace(String s) {
		SplitString str = (st) -> {
			String[] myStr = st.split("");
			String out = "";
			for (int i = 0; i < myStr.length; i++) {
				out += myStr[i] + " ";
			}
			System.out.println(out);
		};
		str.splitString(s);
	}
}
