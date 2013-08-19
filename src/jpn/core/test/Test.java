package jpn.core.test;

import jpn.core.convertor.ShipConvertor;

public class Test {
	public static void main(String[] args) {

		ShipConvertor shipConvertor = new ShipConvertor();
		int[][] arrByVertical = { { 2, 1, 0 }, { 1, 2, 0 }, { 0, 0, 0 },
				{ 4, 0, 0 }, { 2, 3, 0 }, { 1, 2, 0 }, { 1, 2, 0 } };
		int[][] arrByHorizontal = { { 1, 3, 0 }, { 2, 2, 0 }, { 1, 2, 0 },
				{ 1, 4, 0 }, { 1, 2, 0 }, { 1, 1, 0 } };

		shipConvertor.setHorizontalShipsLocation(arrByHorizontal);
		shipConvertor.setVerticalShipsLocation(arrByVertical);

		System.out.println("shipConvertor.getoY() - " + shipConvertor.getoY());
		System.out.println("shipConvertor.getoX() - " + shipConvertor.getoX());

		int arr[][] = new int[7][6];
		shipConvertor.getShipArrFrameByVertical(arr);
		outputArrToConsole(arr);
	
		int arr2[][] = new int[6][7];
		shipConvertor.getShipArrFrameByHorizontal(arr2);
		outputArrToConsole(arr2);
	}

	private static void outputArrToConsole(int[][] arr) {
		int kSize = arr.length;
		int iSize = arr[0].length;
		for (int k = 0; k < kSize; k++) {
			System.out.print("arr2[" + k + "] {");
			for (int i = 0; i < iSize; i++) {
				System.out.print(arr[k][i] + ", ");
			}
			System.out.println("}");
		}
		System.out.println("------------");
	}

}
