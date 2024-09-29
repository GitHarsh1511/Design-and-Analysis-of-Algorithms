/*Binary Search*/
#include <bits/stdc++.h>
using namespace std;
int binarySearch(int arr[], int l, int r, int x)
{
    if (r >= l)
    {
        int mid = l + (r - l) / 2;
        if (arr[mid] == x)
            return mid;
        if (arr[mid] > x)
            return binarySearch(arr, l, mid - 1, x);
        return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
}
int main()
{
    int n;
    cout << "Input :- \n";
    cout << "Enter the value of searching n : ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int result = binarySearch(arr, 0, n - 1, 5);
    if (result == -1)
        cout << "Element is not present in array";
    else
        cout << "Element is present at index " << result + 1;
    return 0;
}

/*Sequential Search*/
#include <iostream>
using namespace std;
int search(int arr[], int N, int x)
{
    int i;
    for (i = 0; i < N; i++)
        if (arr[i] == x)
            return i;
    return -1;
}
int main(void)
{
    int n;
    cout << "Input :- \n";
    cout << "Enter the value of searching n : ";
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    int result = search(arr, n, 5);
    if (result == -1)
    {
        cout << "Element is not present in array";
    }
    else
    {
        cout << "Element is present at index " << result + 1;
    }
    return 0;
}
