package com.ankush.datastructure;

class Reverse{
	String name;
	
	public Reverse(String name){
		this.name = name;
	}
	
	public String doRev() throws Exception{
		int nameLength = this.name.length();
		StringBuffer buffer = new StringBuffer();
		CustomStack revTheString = new CustomStack(nameLength);
		for(int c = 0; c<nameLength; c++){
			revTheString.pushing(this.name.charAt(c));
		}
		for(int r = revTheString.maxsize; r>0; r--){
			buffer.append(revTheString.popping());
		}
		
		return buffer.toString();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(new Reverse("Ankush").doRev());
	}
}
