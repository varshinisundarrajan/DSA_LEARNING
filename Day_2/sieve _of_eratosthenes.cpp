class Solution {
public:
    vector<int> sieve(int n) {
        vector<bool> prime(n + 1, true);
        vector<int> ans;

        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};