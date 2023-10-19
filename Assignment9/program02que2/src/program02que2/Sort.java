package program02que2;

import java.util.Comparator;

public class Sort {
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Double arr[] = {  22.33, 11.22,33.44, 55.66,44.55 };

		class ComparatorDouble implements Comparator<Double> {
			@Override
			public int compare(Double d1, Double d2) {
				int diff=d1.compareTo(d2);
                return diff;
			}
          }
	  Comparator compare=new ComparatorDouble();
	  selectionSort(arr, compare);
	  System.out.println("after the sorting");
	  for(Double d:arr)
		  System.out.println(d);
	}

}
