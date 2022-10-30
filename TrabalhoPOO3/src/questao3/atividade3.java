package questao3;

public class atividade3 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int resultado=0;
		
		for(int i=0;i < a.length;i++) {
			resultado+=a[i];	
		}
		System.out.println("Soma dos vetor: "+resultado);
	}

}
