package selectSort;

public class select {

	public static void main(String[] args) {
		int[] iVet = {5, 3, 2, 4, 6, 1};
		OrdenacaoSelecaoInt(iVet);
		
		for (int i = 0; i < iVet.length; i++) {
			System.out.println("Posi��o [" + i +"]: "+ iVet[i]);
		}
	}
	
	public static void OrdenacaoSelecaoInt(int iVet[]) {
		int iA, iB, iC;
		int iT;
		
		for (iA = 0; iA < iVet.length -1; iA++) {
			iC = iA;
			iT = iVet[iA];
			for (iB = iA + 1; iB < iVet.length; iB++) {
				if (iVet[iB] < iT) {
					iC = iB;
					iT = iVet[iB];
				}
			}
			iVet[iC] = iVet[iA];
			iVet[iA] = iT;
		}
	}
}
