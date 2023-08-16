package array;

public class ExerciseMiddle {
    public int[] middle(int[] array) {
       int[] newArray;
		newArray = new int[array.length - 2];
		for (int i = 0, j = 1; i < array.length - 2; i++, j++) {
			newArray[i] = array[j];
		}
		return newArray;
    }

}