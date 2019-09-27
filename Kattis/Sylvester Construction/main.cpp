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
    int rank = 1;
    int parent;
    string name;
    int index;
    int members = 1;
};

void doIt(United united, United united1);

vector<United> uniteds;

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

int _union(int a, int b) {
    int a_root = find(a);
    int b_root = find(b);
    if (a_root == b_root) {
        return uniteds[a_root].members;
    }
    if (uniteds[a_root].rank < uniteds[b_root].rank) {
        uniteds[a_root].parent = b_root;
        return uniteds[b_root].members += uniteds[a_root].members;
    } else if (uniteds[a_root].rank > uniteds[b_root].rank) {
        uniteds[b_root].parent = a_root;
        return uniteds[a_root].members += uniteds[b_root].members;
    } else {
        uniteds[b_root].parent = a_root;
        uniteds[a_root].rank++;
        return uniteds[a_root].members += uniteds[b_root].members;
    }
}

struct Member {
    vector<Member> vec;
    double x, y;

    bool operator==(const Member &rhs) const {
        return rhs.x == x && rhs.y == y;
    }
};

bool member_cmp(Member &m1, Member &m2) {
    return m1.vec.size() > m2.vec.size();
}

double distance(Member &member, Member &member1) {
    return sqrt(pow((member.x - member1.x), 2) + pow((member.y - member1.y), 2));
}

int main() {
    fast();
    int t;
    cin >> t;
    while (t--) {
        ll n, x, y, w, h;
        cin >> n >> x >> y >> w >> h;
        int power = 0;
        while (n > 1) {
            n /= 2;
            power++;
        }
        for (ll i = y; i < y + h; ++i) {
            for (ll j = x; j < x + w; ++j) {
                //A xor relation between three parameters: i, j and past values(k);
                bool neg = false;
                for (ll k = 0; k < power; ++k) {
                    neg ^= ((j >> k) & 1) && ((i >> k) & 1);
                }
                neg ? cout << "-1 " : cout << "1 ";
            }
            cout << "\n";
        }
        cout << "\n";
    }
}
