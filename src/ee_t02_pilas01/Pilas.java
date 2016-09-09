package ee_t02_pilas01;
import javax.swing.JOptionPane;
public class Pilas {
	String pila[];
	int tope;
	int tam;

	public Pilas(int tamaño){
	tope=-1;
	pila= new String[tamaño];
	tam=tamaño;
	}

	public void push(String dato){
	 if(tope<tam-1){
	  tope++;
	  pila[tope]=dato;
	 }
	 else{
	  JOptionPane.showMessageDialog(null,"Desvordamiento de datos");
	 }
	}

	public String pop(){
	String resultado="";
	if(tope>-1){
	  resultado=pila[tope];
	  pila[tope]=null;
	  tope--;
	  return resultado;
	}
	else{
	 JOptionPane.showMessageDialog(null,"Desvordamiento de datos");
	 return resultado;
	 }
	}

	public String  peek(){
	 String resultado="";
	 if(tope>-1){
	  resultado=pila[tope];
	  return resultado;
	 }
	 else{
	  JOptionPane.showMessageDialog(null,"Desvordamiento de datos");
	  return resultado;
	 } 
	}

	public void imprime(){
	 for(int i=0;i<tam;i++){
	  System.out.println(pila[i]);
	 }
	}


}
