package day01;

public class _0407_VariavleScope {
	public static void main(String[] args) {
		
	//변수는 중괄호 안에서 선언되고, 중괄호 안에서만 유효함.

	int num1 = 10;
	int num2 = 20;
	//int num1 =10, num2=20; 한번에 쓸수있지만 잘사용하지 않는다.

	int num4 = 0; //변수의 선언

	if(true) {

		int num3 = num1 + num2;// 30

		num4 = 1000;

	}
	int num3 = 100; //num3은 if문장을 벗어나면서 사라졌기 때문에 동일한 이름 선언가능
	
	
}

}