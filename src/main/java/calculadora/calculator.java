package calculadora;

public class calculator {
	
	private int ans;
	
	public calculator() {
		this.ans = 0;
	}
	
	public int add(int a, int b) {
		this.ans =  a + b;
		return ans;
	}
	
	public int sub(int a, int b) {
		this.ans = a - b;
		return ans;
	}
	
	public int add(int v) {
		this.ans = this.ans + v;
		return ans;
	}
	
	public int sub(int v) {
		ans = ans - v;
		return ans;
	}
	
	public int dividir(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}else {
			ans = a / b;
			return ans;
		}
		
	}
	
	public int ans() {
		return ans;
	}
	
	public int clear() {
		this.ans = 0;
		return this.ans;
	} 
	
	public void operacionOptima() {
		
	}

}
