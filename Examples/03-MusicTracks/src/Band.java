
public class Band {
	String nameb; 
	Member[] member;
	
	public Band(String nb, Member[] mem) {
		this.nameb = nb;
		this.member= mem; 
	}
	public Band() { 
		this.nameb = null;
		this.member= null; 
	}
	@Override
	public String toString() { 
		String s= "";
		for(int i = 0; i<member.length;i++) { 
			s = s+member[i].name+"\n";
		}
		s = s+"\naverage age:"+averageage()+" years"; return s;
	}
	double averageage(){ 
		double a=0;
		for(int i=0; i<member.length; i++) { 
			a= a+member[i].age;
		}
		return a/member.length; 
	}
}

