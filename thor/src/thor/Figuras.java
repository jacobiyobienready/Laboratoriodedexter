package thor;

public class Figuras {
	private String Color;
	private int radio;
	
public Figuras(){
  Color = "azul";
  radio = 5;
  
}
	
	
public static int Area (int radios ){
	int aux;
	aux= (2*3)*radios;
	return (aux);
		
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Figuras Circulito = new Figuras();
	int auxi;
	auxi=Area (Circulito.radio);
	System.out.println(auxi);
	

	}

}
