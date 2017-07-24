package com.nexon;

public class Card {
	int num;
	boolean isKwang;
	
	//Card �⺻ ������
	Card() {
		this.num = (int)(Math.random()*10)+1;
		int tOrF = (int)(Math.random()*2)+1;
		if(tOrF==1)
			isKwang = true;
		else
			isKwang = false;
	}
	
	//Card ������ --> num ���� isKwang���� �Ű������� ����
	Card(int num, boolean isKwang){
		this.num = num;					//this.num ���� num���� �ְڴ� 
		this.isKwang = isKwang;			//this.isKwang ���� isKwang���� �ְڴ� (true of false)
	}
	
	public String info() {
		/*String result = null;
		if(isKwang){
			result = num + "K";				//isKwang�� true �� ��� num���� K�� ������ ��ȯ
		} else {
			result = String.valueOf(num);		//isKwang�� false�� ��� num���� ��ȯ
		}*/
		return num + (isKwang ? "K" : "");
	}
	
	public boolean equals(Object obj){
		if(this.num == ((Card)obj).num && this.isKwang == ((Card)obj).isKwang)
			return true;
		else 
			return false;
		//if(obj instanceof Card)		//�� üũ
		//	Card c = (Card)obj;
		//	return this.num == ((Card)obj).num && this.isKwang == ((Card)obj).isKwang;
		//return false
	}
}