
public class mainApp {

	public static void main(String[] args) {
	
		String[] array1;
		array1 = new String [4];
		int as = 0;
		int es = 0;
		int is = 0;
		int os = 0;
		int us = 0;
		array1 [0]= "Laura";
		array1 [1] = "Marcos";
		array1 [2] = "Mateo";
		array1 [3] = "Lara";
		
		for (int i = 0; i<array1.length;i++) {
			
			for (int j = 0; j < array1[i].length(); j++) {
				
				String letra = String.valueOf(array1[i].charAt(j));
				
				if (letra.equals("a")) {
					as++;
				}else if (letra.equals("e")) {
					es++;
				}else if (letra.equals("i")) {
					is++;
				}else if (letra.equals("o")) {
					os++;
				}else if (letra.equals("u")) {
					us++;
				}
			
		}

	}
		System.out.println("Numero de vocales a: " + as + " \n Numero de vocales e: " + es + " \n Numero de vocales i: " + is + " \n Numero de vocales o: " + os + " \n Numero de vocales u: " + us);

}
}
