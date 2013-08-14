package jpn.core.test;

import jpn.core.ShipConvertor;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestShipConvertor extends TestCase {
	ShipConvertor shipConvertor = new ShipConvertor();
	int[][] arrByVertical = { { 2, 1, 0 }, { 1, 2, 0 }, { 0, 0, 0 },
			{ 4, 0, 0 }, { 2, 3, 0 }, { 1, 2, 0 }, { 1, 2, 0 } };
	int[][] arrByHorizontal = { { 1, 3, 0 }, { 2, 2, 0 }, { 1, 2, 0 },
			{ 1, 4, 0 }, { 1, 2, 0 }, { 1, 1, 0 } };

	public TestShipConvertor() {
		shipConvertor.setHorizontalShipsLocation(arrByHorizontal);
		shipConvertor.setVerticalShipsLocation(arrByVertical);
	}

	public void testSize() {
		Assert.assertEquals(7, shipConvertor.getoY());
		Assert.assertEquals(6, shipConvertor.getoX());
	}
	public void testArrFrameFilling(){
		shipConvertor.setHorizontalShipsLocation(arrByHorizontal);
		shipConvertor.setVerticalShipsLocation(arrByVertical);
		int arr[][] = new int[7][6];
		shipConvertor.getShipArrFrameByVertical(arr);
		Assert.assertEquals(1, arr[0][0]);
		Assert.assertEquals(1, arr[0][1]);
		Assert.assertEquals(0, arr[0][2]);
		Assert.assertEquals(1, arr[0][3]);
		Assert.assertEquals(0, arr[0][4]);
		Assert.assertEquals(0, arr[0][5]);
	}

}
