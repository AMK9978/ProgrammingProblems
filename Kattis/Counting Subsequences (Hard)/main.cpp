#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i, x, y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = INT32_MIN;
using namespace std;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
}

struct Node {
    int v;
    float x, y;
};
struct Edge {
    Node a, b;
    float w;
};

struct United {
    int rank = 0;
    int parent;
};

United uniteds[101];

float diss(Edge node) {
    return sqrt((node.a.x -
                 node.b.x) * (node.a.x - node.b.x)
                + (node.a.y - node.b.y) * (node.a.y - node.b.y));
}

bool dis(Edge node, Edge node1) {
    return sqrt((node.a.x -
                 node.b.x) * (node.a.x - node.b.x)
                + (node.a.y - node.b.y) * (node.a.y - node.b.y))
           < sqrt((node1.a.x -
                   node1.b.x) * (node1.a.x - node1.b.x)
                  + (node1.a.y - node1.b.y) *
                    (node1.a.y - node1.b.y));
}

bool edge_cmp(Edge e1, Edge e2) {
    return dis(e1, e2);
}


int find(int a) {
    if (a != uniteds[a].parent)
        uniteds[a].parent = find(uniteds[a].parent);
    return uniteds[a].parent;
}

void _union(int a, int b) {
    int a_root = find(a);
    int b_root = find(b);
    if (uniteds[a_root].rank < uniteds[b_root].rank) {
        uniteds[a_root].parent = b_root;
    } else if (uniteds[a_root].rank > uniteds[b_root].rank) {
        uniteds[b_root].parent = a_root;
    } else {
        uniteds[b_root].parent = a_root;
        uniteds[a_root].rank++;
    }
}


int main() {
    fast();
    int t, n;
    cin >> t;
    for (int i = 0; i < t; ++i) {
        cin >> n;
        int arr[1000001];
        arr[0] = 0;
        for (int j = 1; j <= n; ++j) {
            cin >> arr[j];
        }
        for (int k = 1; k <= n; ++k) {
            arr[k] += arr[k - 1];
        }
        unordered_map<ll, ll> map;
        map[0] = 1;
        int ans = 0;
        for (int l = 1; l <= n; ++l) {
            ans += map[arr[l] - 47];
            map[arr[l]]++;
        }
        cout<<ans<<"\n";
    }
}