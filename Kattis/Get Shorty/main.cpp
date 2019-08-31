#include <bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = INT32_MIN;
using namespace std;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);
}

struct Node{
    int node;
    float cost;
};

struct node_cmp {
    bool operator()(Node const& p1, Node const& p2)
    {
        return p1.cost < p2.cost;
    }
};

int main() {
    int n, m;
    while (true) {
        cin >> n >> m;
        if (n == m && m == 0)
            break;
        priority_queue<Node,vector<Node>,node_cmp> priorityQueue;
        Node node0{};
        node0.cost = 1.0;
        node0.node = 0;
        vector<vector<pair<float, int> > > arr(n);
        for (int i = 0; i < m; ++i) {
            int x, y;
            float coefficient;
            cin>>x>>y>>coefficient;
            arr[x].push_back(make_pair(coefficient, y));
            arr[y].push_back(make_pair(coefficient, x));
        }
        vector<int> vis(n, false);
        vector<float> dis(n,0.0);
        dis[0] = 0.0;
        priorityQueue.push(node0);
        while(!priorityQueue.empty()){
            Node curr = priorityQueue.top();
            priorityQueue.pop();
            vis[curr.node] = 1;
            for (auto i : arr[curr.node]) {
                if(i.second != 0 && vis[i.second] == 0){
                    float new_dis = curr.cost * i.first;
                    if (new_dis > dis[i.second]) {
                        Node xx{};
                        xx.node = i.second; xx.cost = new_dis;
                        priorityQueue.push(xx);
                        dis[i.second] = new_dis;
                    }
                }
            }
        }
        printf("%.4f\n", dis[n - 1]);
    }
    return 0;
}