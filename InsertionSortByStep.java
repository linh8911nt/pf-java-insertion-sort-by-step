public class InsertionSortByStep {
    public InsertionSortByStep() {
    }

    public void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int j;

            for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
                System.out.println("\nswap \'" +
                        list[j + 1] +
                        "\' index " + (j + 1) +
                        " with \'" +
                        list[j] +
                        "\' index " + j);

                list[j + 1] = list[j];
            }
            list[j + 1] = currentElement;

            System.out.println("\nlist after the " + i + " sort");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }
    }
}
