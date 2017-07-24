package com.nexon;

public class Card {
	int num;
	boolean isKwang;
	
	//Card 기본 생성자
	Card() {
		this.num = (int)(Math.random()*10)+1;
		int tOrF = (int)(Math.random()*2)+1;
		if(tOrF==1)
			isKwang = true;
		else
			isKwang = false;
	}
	
	//Card 생성자 --> num 값과 isKwang값을 매개변수로 받음
	Card(int num, boolean isKwang){
		this.num = num;					//this.num 값에 num값을 넣겠다 
		this.isKwang = isKwang;			//this.isKwang 값에 isKwang값을 넣겠다 (true of false)
	}
	
	public String info() {
		/*String result = null;
		if(isKwang){
			result = num + "K";				//isKwang이 true 일 경우 num값에 K를 붙혀서 반환
		} else {
			result = String.valueOf(num);		//isKwang이 false일 경우 num값만 반환
		}*/
		return num + (isKwang ? "K" : "");
	}
	
	public boolean equals(Object obj){
		if(this.num == ((Card)obj).num && this.isKwang == ((Card)obj).isKwang)
			return true;
		else 
			return false;
		//if(obj instanceof Card)		//형 체크
		//	Card c = (Card)obj;
		//	return this.num == ((Card)obj).num && this.isKwang == ((Card)obj).isKwang;
		//return false
	}
}