package com.cg.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	//@Autowire //It is performing Setter Dependency Injection
	private SpellChecker sp;
	
	@Autowired //performs constructor DI
	public TextEditor(SpellChecker sp) {
		this.sp=sp;

	}

	public SpellChecker getSp() {
		return sp;
	}

	public void setSp(SpellChecker sp) {
		this.sp = sp;
	}

void showTextEditor() {
	System.out.println("this is method of TX");
	sp.showSpelling();
}

}
