package MainPackage;

public class MyInteger {

	int value;
	
	public MyInteger(int value) {
		super();
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public boolean isEven(){
		if (value % 2 == 0){
			return true;
		}else {
			return false;
		}
		
	}
	public boolean isOdd(){
		if (value % 2 == 0){
			return false;
		}else {
			return true;
		}
	}
	
	public boolean isPrime(){
		for (int i = 2; i <= value / 2; i++){
			if (value % i == 0){
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(int insert) {
		if (insert % 2 == 0){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isOdd(int insert) {
		if (insert % 2 == 0){
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isPrime(int insert){
		for (int i = 2; i <= insert / 2; i++){
			if (insert % i == 0){
				return false;
			}
		}
		return true;
	}
		
	public static boolean isEven(MyInteger obj){
		if (obj.getValue() % 2 == 0){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isOdd(MyInteger obj){
		if (obj.getValue() % 2 == 0){
			return false;
		}else {
			return true;
		}
	}
	
	public static boolean isPrime(MyInteger obj){
		for (int i = 2; i <= obj.getValue() / 2; i++){
			if (obj.getValue() % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int number){
		return (value == number);
	}
	
	public boolean equals(MyInteger obj){
		return (value == obj.getValue());
	}
	
	public static int parseInt(char[] args){
		return parseInt(new String(args));
	}
	
	public static int parseInt(String s){
		return Integer.parseInt(s);
	}
}