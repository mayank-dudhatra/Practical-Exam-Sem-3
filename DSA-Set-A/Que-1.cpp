#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val) {
        data = val;
        next = nullptr;
    }
};

void insertAtbeginning(Node*& head, int val) {
    Node* newNode = new Node(val);
    Node* box = head;
    head = newNode;
    newNode->next = box;
}

void display(Node* head) {
    Node* temp = head;
    while (temp != nullptr) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "nullptr" << endl;
}

int main() {
    Node* head = nullptr;

    insertAtbeginning(head, 10);
    insertAtbeginning(head, 20);
    insertAtbeginning(head, 30);

    display(head);  

    return 0;
}
