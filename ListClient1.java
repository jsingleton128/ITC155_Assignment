
public class ListClient1 {

	public static void main(String[] args) {
		
		LinkedIntList list1 = new LinkedIntList();
		
		list1.add(4);
		list1.add(12);
		list1.add(9);
		list1.add(17);
		
		LinkedIntList list2 = new LinkedIntList();
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		LinkedIntList list3 = new LinkedIntList();

		//Not sorted. Returns false.
		System.out.println(list1);
		System.out.println("List 1 is sorted? " + list1.isSorted());
		System.out.println();
		//Sorted. Returns true.
		System.out.println(list2);
		System.out.println("List 2 is sorted? " + list2.isSorted());
		System.out.println();
		//Empty. Returns true.
		System.out.println(list3);
		System.out.println("List 3 is sorted? " + list3.isSorted());
	}

}
