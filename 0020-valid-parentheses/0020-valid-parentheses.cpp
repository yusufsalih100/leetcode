class Solution {
public:
    bool isValid(string s) {
        bool a = true;
        stack<char> ab;
        for (char i: s) {
            if (i=='(' || i=='{' || i=='[') {
                ab.push(i);
            } else if (i==')') {
                if (ab.size()==0) {
                    return false;
                }
                if (ab.top()=='(') {
                    ab.pop();
                } else {
                    a = false;
                    break;
                }
            } else if (i==']') {
                if (ab.size()==0) {
                    return false;
                }
                if (ab.top()=='[') {
                    ab.pop();
                } else {
                    a = false;
                    break;
                }
            } else if (i=='}') {
                if (ab.size()==0) {
                    return false;
                }
                if (ab.top()=='{') {
                    ab.pop();
                } else {
                    a = false;
                    break;
                }
            }
        }
        if (ab.size()!=0) {
            a=false;
        }
        return a;
    }
};