#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = INT32_MIN;
using namespace std;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
}

struct Edge{
    int a,b,w;
};

struct United{
    int rank = 0;
    int parent;
};

United uniteds[20001];

bool edge_cmp(Edge e1, Edge e2){
    return e1.w < e2.w;
}

bool ans_cmp(Edge e1, Edge e2){
    if(e1.a < e2.a){
        return true;
    }else if(e1.a > e2.a){
        return false;
    }else{
        if(e1.b < e2.b){
            return true;
        }else{
            return false;
        }
    }
}

int find(int a){
    if(a != uniteds[a].parent)
        uniteds[a].parent = find(uniteds[a].parent);
    return uniteds[a].parent;
}

void _union(int a, int b){
    int a_root = find(a);
    int b_root = find(b);
    if (uniteds[a_root].rank < uniteds[b_root].rank){
        uniteds[a_root].parent = b_root;
    }else if (uniteds[a_root].rank > uniteds[b_root].rank){
        uniteds[b_root].parent = a_root;
    }else{
        uniteds[b_root].parent = a_root;
        uniteds[a_root].rank++;
    }
}

int main()
{
    fast();
    int n,m;
    while(true){
        cin>>n>>m;
        if(n == m && m == 0){
            break;
        }
        vector<Edge> edges;
        for(int i = 0; i < m; i++){
            int u,v,w;
            cin>>u>>v>>w;
            Edge edge;
            if(u < v){
                edge.a = u;
                edge.b = v;
            }else{
                edge.a = v;
                edge.b = u;
            }
            edge.w = w;
            edges.push_back (edge);
        }
        for(int i =0 ; i < n; i++){
            United united;
            united.parent = i;
            united.rank = 0;
            uniteds[i] = united;
        }
        sort(edges.begin (), edges.end (), edge_cmp);
        int cost = 0;
        vector<Edge> answers;
        for(int index = 0; index < edges.size (); index++){
            Edge edge = edges[index];
            int x = find(edge.a);
            int y = find(edge.b);
            if(x != y){
                answers.push_back (edge);
                _union(x,y);
                cost += edge.w;
            }
        }
        if(answers.size () != n - 1){
            cout<<"impossible\n";
        }else{
            sort(answers.begin (), answers.end (), ans_cmp);
            cout<<cost<<"\n";
            for(int i = 0; i < answers.size (); i++){
                cout<<answers[i].a<<" "<<answers[i].b<<"\n";
            }
        }
    }

}

