public class JaegerTest {

	public static void main(String[] args) {
		Jaeger jaegerOne = new Jaeger();
		jaegerOne.setModelName("Model-1");
		jaegerOne.setMark("Mark-1");
		jaegerOne.setHeight(10.09f);
		jaegerOne.setWeight(234.008f);

		Jaeger jaegerTwo = new Jaeger();
		jaegerTwo.setModelName("Model-2");
		jaegerTwo.setMark("Mark-2");
		jaegerTwo.setHeight(23.7f);
		jaegerTwo.setWeight(14.001f);

		System.out.println(jaegerOne);
		System.out.println(jaegerTwo);

		jaegerTwo.drift();
		System.out.println(jaegerOne.scanKaiju());
		jaegerTwo.useWeapon();
		jaegerOne.move();	
	}
}