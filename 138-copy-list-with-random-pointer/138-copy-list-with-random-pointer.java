/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public int getIdx(Node head, Node target){
        int counter = 0;
        while(head!=target){
             counter++;
             head = head.next;
        }

        return counter;
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> rd = new ArrayList<>();
        
        Node temp = head;
        int idx= 0;

        
        while(temp != null){
            val.add(temp.val);
           
            if(temp.random==null){
                rd.add(Integer.MIN_VALUE);
            }
            else{
                idx = getIdx(head, temp.random);
                rd.add(idx);
            }

            temp = temp.next;
        }
        
        Node newHead = new Node(val.get(0));
        Node t = newHead;
        
        for(int i=1; i<val.size(); i++){
            temp = new Node(val.get(i));
            t.next = temp;
            t = temp;
        }
        
        t = newHead;
        temp = head;
        
        for(int i=0; i<val.size(); i++){
            
            idx = rd.get(i);
            if(idx==Integer.MIN_VALUE){
                t.random = null;
                temp = temp.next;
                t = t.next;
                continue;
            }
               Node t2 = newHead;
               for(int j=0; j<idx; j++){
                   t2 = t2.next;
               }
                   
               t.random = t2;
                      
               temp = temp.next;
               t = t.next;
        }
        
        return newHead;
    }
}