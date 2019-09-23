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
    int x, y;
    int index;
};

void doIt(United united, United united1);

United *uniteds;

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

int distance(United a, United b) {
    return (abs(a.x - b.x) + abs(b.y - a.y));
}

int main() {
    fast();
    int t, n;
    cin >> t;
    while (t--) {
        cin >> n;
        uniteds = new United[n + 2];
        for (int i = 0; i < n + 2; ++i) {
            United united;
            united.parent = i;
            united.index = i;
            cin >> united.x >> united.y;
            uniteds[i] = united;
        }
        for (int j = 0; j < n + 2; ++j) {
            for (int i = j + 1; i < n + 2; ++i) {
                doIt(uniteds[j], uniteds[i]);
            }
        }
//        cout << find(uniteds[0].index) << " " << find(uniteds[n + 1].index) << "\n";
        if (find(uniteds[0].index) == find(uniteds[n + 1].index)) {
            cout << "happy\n";
        } else {
            cout << "sad\n";
        }
    }
}

void doIt(United united, United united1) {
    if (find(united.index) == find(united1.index)) {
        return;
    }
    if (distance(united, united1) <= 1000) {
        _union(united.index, united1.index);
    }
}
