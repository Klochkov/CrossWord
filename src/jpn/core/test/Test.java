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
		
		System.out.println("shipConvertor.getoY() - "+shipConvertor.getoY());
		System.out.println("shipConvertor.getoX() - "+shipConvertor.getoX());
		
		int arr[][] = new int[7][6];
		shipConvertor.getShipArrFrameByVertical(arr);
		
		for(int i=0;i<7;i++){
		System.out.println("arr["+ i +"][0] - " + arr[0][i]);
		}
	}

}
