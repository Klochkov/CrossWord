package jpn.core.convertor;

public class ShipConvertor {
	private int[][] horizontalShipsLocation;
	private int[][] verticalShipsLocation;
	private int oX, oY;

	public ShipConvertor() {
	}

	public int getoX() {
		return oX;
	}

	public int getoY() {
		return oY;
	}

	public void setHorizontalShipsLocation(int[][] arr) {
		int sizeX = arr[0].length;
		int sizeY = arr.length;
		horizontalShipsLocation = new int[sizeY][sizeX];
		copyArr(arr, horizontalShipsLocation);
		oX = sizeY;
	}

	public void setVerticalShipsLocation(int[][] arr) {
		int sizeX = arr[0].length;
		int sizeY = arr.length;
		verticalShipsLocation = new int[sizeY][sizeX];
		copyArr(arr, verticalShipsLocation);
		oY = sizeY;
	}

	private void copyArr(int[][] arrFrom, int[][] arrTo) {
		int i, j;
		int sizeX = arrFrom[0].length;
		int sizeY = arrFrom.length;
		for (i = 0; i < sizeY; i++)
			for (j = 0; j < sizeX; j++) {
				arrTo[i][j] = arrFrom[i][j];
			}
	}

	public int[][] getShipArrFrameByVertical(int[][] arr) {
		int i, j, pointer, element;
		for (i = 0; i < oY; i++) {
			for (j = 0; j < oX; j++) {
				element = verticalShipsLocation[i][j];
				if (element == 0)
					break;
				pointer = +(element);
				while (element > 0) {
					arr[i][pointer + --element] = 1;
				}
			}
			pointer = 0;
		}
		return arr;
	}
}
