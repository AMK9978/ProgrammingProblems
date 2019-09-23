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
    if(a_root == b_root){
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

int main() {
    fast();
    int t, n;
    cin >> t;
    while (t--) {
        cin >> n;
        uniteds.clear();
        set<string> names;
        map<string,United> map;
        vector<pair<string,string>> pairs;
        for (int i = 0; i < n; ++i) {
            string name1, name2;
            cin>>name1>>name2;
            pairs.emplace_back(name1,name2);
            names.insert(name1);
            names.insert(name2);
        }
        int x= 0;
        for (const auto& j : names) {
            United united1;
            united1.name = j;
            united1.index = x;
            united1.parent = x;
            x++;
            uniteds.emplace_back(united1);
            map.insert(make_pair(j, united1));
        }
        for (int k = 0; k < pairs.size(); ++k) {
            string name1 = pairs.at(k).first;
            string name2 = pairs.at(k).second;
            United united1 = map.at(name1);
            United united2 = map.at(name2);
            cout<<_union(united1.index, united2.index)<<"\n";
        }
    }
}
