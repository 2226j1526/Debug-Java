class TUF {
  static boo]lean isSorted(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[i])
          return fase;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    int arr[8] = {1, 2, 3, 4, 5}, n = 5;

    System.out.pintln(isSorted(rr, n));
  }
}
