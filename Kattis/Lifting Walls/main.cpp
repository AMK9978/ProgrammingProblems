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
    double l, w, n, r;
    cin >> l >> w >> n >> r;
    Member point1;
    Member point2;
    Member point3;
    Member point4;
    point1.x = -l / 2.0;
    point1.y = 0;
    point2.x = l / 2.0;
    point2.y = 0;
    point3.x = 0;
    point3.y = -w / 2.0;
    point4.x = 0;
    point4.y = w / 2.0;
    vector<Member> arr;
    for (int i = 0; i < n; ++i) {
        Member member;
        cin >> member.x >> member.y;
        if (distance(member, point1) <= r) {
            member.vec.emplace_back(point1);
            point1.vec.emplace_back(member);
        }
        if (distance(member, point2) <= r) {
            member.vec.emplace_back(point2);
            point2.vec.emplace_back(member);
        }
        if (distance(member, point3) <= r) {
            member.vec.emplace_back(point3);
            point3.vec.emplace_back(member);
        }
        if (distance(member, point4) <= r) {
            point4.vec.emplace_back(member);
            member.vec.emplace_back(point4);
        }
        arr.emplace_back(member);
    }
    Member members[4]{point1, point2, point3, point4};
    sort(arr.begin(), arr.end(), member_cmp);
    if (point1.vec.empty() || point2.vec.empty() || point3.vec.empty() ||
        point4.vec.empty()) {
        cout << "Impossible\n";
        return 0;
    }
    if (arr[0].vec.size() == 4) {
        cout << 1 << "\n";
    } else if (arr[0].vec.size() == 3) {
        cout << "2\n";
    } else if (arr[0].vec.size() == 1) {
        cout << "4\n";
    } else {
        for(Member O_o : arr) {
            if (O_o.vec.size() != 2){
                continue;
            }
            vector<Member> memberList;
            for (const auto& member : members) {
                if (find(O_o.vec.begin(), O_o.vec.end(), member) == O_o.vec.end()) {
                    memberList.emplace_back(member);
                }
            }
            for (const auto& member1 : memberList[0].vec) {
                for (const auto& i : member1.vec) {
                    if (i == memberList[1]){
                        cout << "2\n";
                        return 0;
                    }
                }
            }
            for (const auto& member1 : memberList[1].vec) {
                for (const auto& i : member1.vec) {
                    if (i == memberList[0]){
                        cout << "2\n";
                        return 0;
                    }
                }
            }
        }
        cout << "3\n";
    }
}
