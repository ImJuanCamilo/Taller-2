package tallerPackage;

public class punto2 {

	public static void main(String[] args) {
		int i, j;
		int vector[] = {1,2,2,1,9,};
		
		for(i=0;i<vector.length;i++){
			for(j=0;j<vector.length;j++){
				if(i!=j && vector[i]==vector[j]){
					break;
				}
				
			}
			if(j==vector.length){
				System.out.println("El numero que no tiene pareja en el vector es =" + vector[i]);
				break;
			}
		}
		

	}

}
