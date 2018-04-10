public class InsertionSortByStepTest {
    public static void main(String[] args) {
        InsertionSortByStep listSort = new InsertionSortByStep();
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        System.out.println("list befor sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println();

        listSort.insertionSort(list);

        System.out.println("list after sort");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
