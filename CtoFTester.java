public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius){
  	double farenheit = (celsius * 9/5 + 32);
	return farenheit;
}

  public static double farenheitToCelsius(double farenheit){
	double celsius = (farenheit - 32)*(5/9);
	return celsius;
}

  public static void main(String[] args){
	system.out.println(celsiusToFarenheit(2023));
	system.out.println(farenheitToCelsius(2023));
} 
}	
	

