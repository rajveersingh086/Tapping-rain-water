package geeks.array;
/* Nive solution
Tapping rain water problen by taking input.
time complexity is O(n^2).
auxilary space is O(1).
 */

class tapping_rainwater {
    public static int getwater(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int lmax = arr[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax, arr[j]);
            }

            int rmax = arr[i];
            for (int j = i + 1; j < n; j++) {
                rmax = Math.max(rmax, arr[j]);
            }

            res += Math.min(lmax, rmax) - arr[i];
        }
        return res;
    }

    public static void main(String args[]) {
        int arr[] = {3, 0, 1, 2, 5};
        int n = arr.length;
        System.out.println(getwater(arr, n));
    }
}
