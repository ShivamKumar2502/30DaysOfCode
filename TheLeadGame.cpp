#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a, b, n;
    int s1 = 0, s2 = 0;
    int max1 = 0, max2 = 0;

    cin >> n;

    while (n--)
    {
        cin >> a;
        cin >> b;

        s1 += a;
        s2 += b;

        if (s1 > s2)
        {
            int t = s1 - s2;
            if (t > max1)
                max1 = t;
        }
        else
        {
            int t = s2 - s1;
            if (t > max2)
                max2 = t;
        }
    }
    if (max1 > max2)
    {
        cout << 1 << " " << max1;
    }
    else
    {
        cout << 2 << " " << max2;
    }

    return 0;
}