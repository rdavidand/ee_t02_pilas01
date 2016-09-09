package ee_t02_pilas01;
import javax.swing.JOptionPane;
public class ee_t02_pilas01 {
	public static void main(String args[]){
	    String cad=JOptionPane.showInputDialog("Ingrese una cadena");
	    char [] a= cad.toCharArray();
	    String arreglo[]=new  String[a.length];
	    Pilas p= new Pilas(a.length);
	    boolean ex=true;
	    for(int i=0;i<a.length;i++){
	        String temp;
	        temp=Character.toString(a[i]);
	        arreglo[i]=temp;
	     } 
	    if(a.length%2==0){
	      for(int j=0;j<arreglo.length;j++){
	      if(arreglo[j].equals("(") || arreglo[j].equals("[") || arreglo[j].equals("{")){
	       p.push(arreglo[j]);
	      } 
	      else{
	        String z=p.pop();
	          if(arreglo[j].equals(")") && z.equals("(")){
	          ex=true; 
	         }
	          
	          if(arreglo[j].equals("]") && z.equals("[")){
	            ex=true;
	          }
	          
	          if(arreglo[j].equals("}") && z.equals("{")){
	           ex=true;
	          }
	      } 
	      if(ex==false){
	       JOptionPane.showMessageDialog(null,"NO");
	       break;
	      }
	      
	     
	     }
	       if(ex=true){
	    JOptionPane.showMessageDialog(null,"SI");
	    }
	    }
	    
	    else{
	     JOptionPane.showMessageDialog(null,"NO");
	    }
	    
	   
	   }
	  
}
