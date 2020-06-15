public static int[] sortedArray(int[] array) {
    int[] sortedArray = new int[array.length];

    for (int i = 0; i < array.length; i++) {
        sortedArray[i] = array[i];
    }

    boolean flag = true;
    int temp;
    while (flag) {
        flag = false;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            if (sortedArray[i] < sortedArray[i + 1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i + 1];
                sortedArray[i + 1] = temp;
                flag = true;
            }
        }
    }
    return sortedArray;
}
