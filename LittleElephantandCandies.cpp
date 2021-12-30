#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n, c, t, i, z;

    cin >> t;
    while (t--)
    {
        vector<int> a;
        int sum = 0;
        cin >> n >> c;

        for (i = 0; i < n; i++)
        {
            cin >> z;
            a.push_back(z);
            sum = sum + a[i];
        }

        if (sum <= c)
        {
            cout << "Yes" << endl;
        }
        else
        {
            cout << "No" << endl;
        }
    }

    return 0;
}