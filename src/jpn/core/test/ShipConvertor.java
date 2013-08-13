package jpn.core.test;

public class ShipConvertor {
	private int[][] horizontalShipsLocation;
	private int[][] verticalShipsLocation;
	private int[][] shipArr;

	public ShipConvertor() {
	}

	public void setHorizontalShipsLocation(int[][] arr) {
		copyArr(arr, horizontalShipsLocation);
	}

	public void setVerticalShipsLocation(int[][] arr) {
		copyArr(arr, verticalShipsLocation);
	}

	private void copyArr(int[][] arrFrom, int[][] arrTo) {
		int i, j;
		int sizeX = arrFrom[0].length;
		int sizeY = arrFrom.length;
		arrTo = new int[sizeY][sizeX];
		for (i = 0; i < sizeY; i++)
			for (j = 0; j < sizeX; j++) {
				arrTo[i][j] = arrFrom[i][j];
			}
	}

	public int[][] getShipArrFrameByVertical(int[][] arr) {
		int sizeX,sizeY;
		sizeX = arr[0].length;
		sizeY = arr.length;
		int[][] frame = new int[sizeY][sizeX];
		return frame;
	}
}

