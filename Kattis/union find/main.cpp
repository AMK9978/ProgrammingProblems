#include<bits/stdc++.h>

#define watch(x) cout<<(#x)<<" is "<<(x)<<"\n"
#define print(x) cout<<x<<"\n"
#define For(i,x,y) for(i = x; i < y; i++)
typedef std::vector<int> vi;
typedef std::vector<std::vector<int>> vvi;
typedef long long ll;
int INF = -9999;
using namespace std;

void fast() {
    ios::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
}

int *parent;
int *ran;


int find_root(int i){
    while(parent[i] != i){
        parent[i] = parent[parent[i]];
        i = parent[i];
    }
    return i;
}

void find(int node1, int node2){
    int root1 = find_root (node1);
    int root2 = find_root (node2);
    if (root1 == root2) {
        cout<<"yes\n";
    } else{
        cout<<"no\n";
    }

}

void merge(int node1, int node2){
    int root1 = find_root (node1);
    int root2 = find_root (node2);
    if(root1 == root2)
        return;

    if(ran[root1]<ran[root2])
    {
        parent[root1] = parent[root2];
        ran[root2] += ran[root1];
    }
    else
    {
        parent[root2]=parent[root1];
        ran[root1] += ran[root2];
    }
}

int main() {

    fast();
    int n,q;
    cin>>n>>q;
    parent = new int[n];
    ran = new int[n];
    for(int i=0;i<n;i++)
    {
        parent[i]=i;
        ran[i] = 1;
    }
    for(int i = 0; i < q; i++){
        char command;
        int a,b;
        cin>>command>>a>>b;
        if(command == '?'){
            find(a,b);
        }else{
            merge(a,b);
        }
    }
    return 0;
}
