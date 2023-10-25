public class myFirstGame{

	public static void main(String[] args) {

	int computerNumber = 10;
	int userNumber = 10;

	if(userNumber < computerNumber) {
	System.out.println("Число" + " " + userNumber + " " + "меньше того, что загадал компьютер");
	for(int i = userNumber; i < computerNumber; i++){
	userNumber++;
	System.out.println(userNumber);
	}
	System.out.println("Вы победили!");
	} else if(userNumber > computerNumber) {
	System.out.println("Число" + " " + userNumber + " " + "больше того, что загадал компьютер");
	for(int i = userNumber; i > computerNumber; i--){
	userNumber--;
	System.out.println(userNumber);
	}
    System.out.println("Вы победили!");} else {
	System.out.println("Вы победили!");
	}
  }
}