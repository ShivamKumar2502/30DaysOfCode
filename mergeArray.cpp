#include <bits/stdc++.h>

using namespace std;

int main()
{
    vector<int> v1 = {2, 4, 7, 9};
    vector<int> v2 = {1, 3, 5, 11, 13};
    vector<int> v3;
    int n, m;
    n = v1.size();
    m = v2.size();

    int i = 0, j = 0;

    while (i < n && j < m)
    {
        if (v1[i] < v2[j])
        {
            v3.push_back(v1[i]);
            i++;
        }
        else
        {
            v3.push_back(v2[j]);
            j++;
        }
    }
    while (i < n)
    {
        v3.push_back(v1[i]);
        i++;
    }
    while (j < m)
    {
        v3.push_back(v2[j]);
        j++;
    }
    for (int k = 0; k < n + m; k++)
    {
        cout << v3[k] << " ";
    }
    return 0;
}