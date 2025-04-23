#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp> 
#include <ext/pb_ds/tree_policy.hpp>
#define ll long long
#define ld long double
#define vi vector<int> 
#define vl vector<long long>
#define shineHere() ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL)
#define MOD 1000000007
#define MOD1 998244353
#define pb push_back
#define sz(x) ((int)(x).size())
#define all(v) v.begin() , v.end()
#define vin for(int i = 0; i < n; i++) cin >> v[i];


using namespace std;
using namespace __gnu_pbds; 
template <class T> using ordered_set = tree<T, null_type, less<T>, rb_tree_tag,tree_order_statistics_node_update>;
template <class T> using ordered_multiset = tree<T, null_type,less_equal<T>, rb_tree_tag,tree_order_statistics_node_update>;

ll gcd(ll a, ll b) {if (b > a) {return gcd(b, a);} if (b == 0) {return a;} return gcd(b, a % b);}
ll expo(ll a, ll b, ll mod) {ll res = 1; while (b > 0) {if (b & 1)res = (res * a) % mod; a = (a * a) % mod; b = b >> 1;} return res;}
ll modInverse(ll a, ll b) {return expo(a, b - 2, b);}

ll mod_add(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a + b) % m) + m) % m;}
ll mod_mul(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a * b) % m) + m) % m;}
ll mod_sub(ll a, ll b, ll m) {a = a % m; b = b % m; return (((a - b) % m) + m) % m;}
ll mod_div(ll a, ll b, ll m) {a = a % m; b = b % m; return (mod_mul(a, modInverse(b, m), m) + m) % m;}
ll ns(ll num) {return (num * (num + 1))/2;}
void solve(){
    string s , t;
    getline(cin >> ws , s);
    getline(cin >> ws , t);
    int idx1 = -1 , idx2 = -1;

    map<char , int> hm;
    for(int i = 0 ; i < t.length()-1; i++){
        hm[t[i]] = i;
    }
    int mini = INT_MAX;
    for(int i = 1; i < s.length(); i++){
        if(hm.find(s[i]) != hm.end()){
            if(mini > t.length() - hm[s[i]] + i){
                mini = t.length() - hm[s[i]] + i;
                idx1 = i;
                idx2 = hm[s[i]];
            }
        }
    }
    if(mini == INT_MAX) cout<<-1<<endl;
    else{
        for(int i = 0 ;  i< idx1; i++){
            cout<<s[i];
        }
        for(int i = idx2; i < t.length(); i++){
            cout<<t[i];
        }
        cout<<endl;
    }
}
int main(){
    shineHere();
    solve();
}