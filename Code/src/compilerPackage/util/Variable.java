package compilerPackage.util;

/*
 * Questa classe � solo una bozza
 * 
 * Uso questa classe come contenitore
 * anche per riportare le costanti 
 * e i risultati parziali delle operazioni 
 * (in questo senso sono dei valori, senza nome e tipo)
 * 
 * A questa classe aggiungo anche la notazione polacca prefissa e postfissa da cui viene generato il valore
 * S
 */
public class Variable {
	public String type;		// tipo della variabile 
	public String name;		// nome della variabile
	// per comodit� riportiamo il valore di una variabile solo come stringa
	public String value;	// valore in forma stringa
	
	public String polPrefissa;
	public String polPostfissa;
	
	
	// costruttore per variabile con tipo
	public Variable (String t, String n) {
		type = t;
		name = n;
		value = "0";
		polPrefissa = n;
		polPostfissa = n;
	}
	
	// costruttore per valore numerico
	public Variable (String v) {
		type = "";
		name = "";
		value = v;
		polPrefissa = v;
		polPostfissa = v;
	}
	
	public double getNumericValue ( ) {
		try {
			return Double.parseDouble(value);
		} catch (Exception e) {
			return 0.0;
		}
	}

	public void assignValue(Variable e) {
		value = e.value;
//		polPostfissa = e.polPostfissa;
//		polPrefissa = e.polPrefissa;
	}

}
