package array;

public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        return search(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    public boolean search(int[][] matrix, int target, int i1, int i2, int j1, int j2) {
        // 第一行，找到小于target的最大值
        int m1 = closestLessBinarySearch(matrix[i1], target, j1, j2); // 需要注意矩阵的i下标表示的是行，j下标表示的是列
        if (m1 < 0) {
            return false;
        }
        if (matrix[i1][m1] == target) {
            return true;
        }

        // 最后一行，找到大于target的最小值
        int m2 = closestGreatBinarySearch(matrix[i2], target, j1, j2);
        if (m2 < 0) {
            return false;
        }
        if (matrix[i2][m2] == target) {
            return true;
        }

        // 第一列，找到小于target的最大值
        int n1 = closestLessBinarySearch(matrix, j1, target, i1, i2);
        if (n1 < 0) {
            return false;
        }
        if (matrix[n1][j1] == target) {
            return true;
        }

        // 最后一列，找到小于target的最大值
        int n2 = closestGreatBinarySearch(matrix, j2, target, i1, i2);
        if (n2 < 0) {
            return false;
        }
        if (matrix[n2][j2] == target) {
            return true;
        }

        return search(matrix, target, n2, n1, m2, m1);
    }

    public static int closestLessBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[low] > key) {
            return -1;
        }
        if (low == high) {
            return arr[low] <= key ? low : -1;
        }
        if (low + 1 == high) {
            if (arr[high] <= key) {
                return high;
            }

            if (arr[low] <= key) {
                return low;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return closestLessBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return closestLessBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
    }

    public static int closestGreatBinarySearch(int[] arr, int key, int low, int high) {
        if (arr[high] < key) {
            return -1;
        }
        if (low == high) {
            return arr[low] >= key ? low : -1;
        }
        if (low + 1 == high) {
            if (arr[low] >= key) {
                return low;
            }

            if (arr[high] >= key) {
                return high;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return closestGreatBinarySearch(arr, key, low, middle);
        } else if (arr[middle] < key) {
            return closestGreatBinarySearch(arr, key, middle, high);
        } else {
            return middle;
        }
    }

    public static int closestLessBinarySearch(int[][] arr, int j, int key, int low, int high) {
        if (arr[low][j] > key) {
            return -1;
        }
        if (low == high) {
            return arr[low][j] <= key ? low : -1;
        }
        if (low + 1 == high) {
            if (arr[high][j] <= key) {
                return high;
            }

            if (arr[low][j] <= key) {
                return low;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle][j] > key) {
            return closestLessBinarySearch(arr, j, key, low, middle);
        } else if (arr[middle][j] < key) {
            return closestLessBinarySearch(arr, j, key, middle, high);
        } else {
            return middle;
        }
    }

    public static int closestGreatBinarySearch(int[][] arr, int j, int key, int low, int high) {
        if (arr[high][j] < key) {
            return -1;
        }
        if (low == high) {
            return arr[low][j] >= key ? low : -1;
        }
        if (low + 1 == high) {
            if (arr[low][j] >= key) {
                return low;
            }

            if (arr[high][j] >= key) {
                return high;
            }
        }

        int middle = (low + high) / 2;
        if (arr[middle][j] > key) {
            return closestGreatBinarySearch(arr, j, key, low, middle);
        } else if (arr[middle][j] < key) {
            return closestGreatBinarySearch(arr, j, key, middle, high);
        } else {
            return middle;
        }
    }
}
