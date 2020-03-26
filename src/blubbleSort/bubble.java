package blubbleSort;

public class bubble {

	public static void main(String[] args) {
		int[] iVet = {5, 3, 2, 4, 6, 1};
		OrdenacaoTrocasInt(iVet);
		
		for (int i = 0; i < iVet.length; i++) {
			System.out.println("Posição [" + i +"]: "+ iVet[i]);
		}
	}

	public static void OrdenacaoTrocasInt(int iVet[]) {
		
		int iA, iB;
		int iT;
		
		for (iA=1; iA < iVet.length; iA ++) {
			for (iB = iVet.length - 1; iB >= iA; iB--) {
				if (iVet[iB-1] > iVet[iB]) {
					iT = iVet[iB - 1];
					iVet[iB-1] = iVet[iB];
					iVet[iB] = iT;
				}
			}
		}
	}
}