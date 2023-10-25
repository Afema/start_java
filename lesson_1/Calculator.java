public class Calculator {
	public static void main(String[] args) {

	int a = 2;
	int b = 100;
	char sign = '^';
	int result=0;

	if(sign == '+') {
	result = a + b;
	} else if(sign == '-') {
	result = a - b;
	} else if(sign == '*'){
	result = a * b;
	} else if(sign == '/'){
	result = a / b;
	} else if(sign == '%'){
	result = a % b;
	}else if(sign == '^' && b == 0){
	result=1;
	} else if(sign == '^'){
	result=1;
	for(int i=0; i<b; i++) {
	result = result * a;
	}
	}
	System.out.println(a + " " + sign + " " + b + " = " + result);
	}
}