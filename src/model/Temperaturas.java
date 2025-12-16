package model;

public class Temperaturas {
	public static String calcularFahrenheitParaCelsius(String fareheint) {
		try {
			double tempFahrenheit = Double.parseDouble(fareheint);
			double tempCelsius = 5.0/9.0 * (tempFahrenheit - 32);
			String resultado = String.format("%.2f", tempCelsius);
			return resultado;
		}
		catch(NumberFormatException ex) {
			System.err.println(ex);
			return null;
		}		
	}
	public static String calcularCelsiusParaFahrenheit(String celsius) {
		try {
			double tempCelsius = Double.parseDouble(celsius);
			double tempFahrenheit = (tempCelsius * 9.0/5.0) + 32;
			String resultado = String.format("%.2f", tempFahrenheit);
			return resultado;
		}
		catch(NumberFormatException ex) {
			System.err.println(ex);
			return null;
		}	
	}
}
