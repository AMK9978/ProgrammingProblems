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
//    fast();
    int n, m, t;
    cin >> t;
    int temp = 0;
    while (t--) {
        if(temp != 0)
            cout<<"\n";
        cin >> n;
        vector<Edge> edges;
        vector<Node> nodes;
        for (int i = 0; i < n; i++) {
            float u, v, w;
            cin >> u >> v;
            Node node;
            node.x = u;
            node.y = v;
            node.v = i;
            nodes.push_back(node);
        }
        for (int j = 0; j < n; ++j) {
            for (int i = 0; i < n; ++i) {
                if (j != i) {
                    Edge edge;
                    edge.a = nodes[j];
                    edge.b = nodes[i];
                    edge.w = diss(edge);
                    edges.push_back(edge);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            United united;
            united.parent = i;
            united.rank = 0;
            uniteds[i] = united;
        }
        sort(edges.begin(), edges.end(), edge_cmp);
        float cost = 0.0;
        vector<Edge> answers;
        for (int index = 0; index < edges.size(); index++) {
            Edge edge = edges[index];
            int x = find(edge.a.v);
            int y = find(edge.b.v);
            if (x != y) {
                answers.push_back(edge);
                _union(x, y);
                cost += edge.w;
            }
        }
        printf("%.2f\n", cost);
        temp++;
    }

}
