public class Main {
  public static void main(String[] args) {
    String sentence = "Esta es la frase que tengo que mirar";
    String str = "";
    String[] lista = sentence.split(" ");
    for (int i= 0; i < lista.length ; i++){
    	if (lista[i].length() >= 5){
        	
            for (int j = (lista[i].length() -1 ); j >= 0 ; j--){
            	String letra = String.valueOf(lista[i].charAt(j));
                str = str + letra;
            }
            lista[i] = str;
            str = "";
        }
    }
    str = "";
  	for (int i = 0; i < lista.length ; i++){
    	str = str + " "+  lista[i]; 
    } 
  	str = str.replaceFirst(" ", "");
    System.out.println(str);
  }
  
}
