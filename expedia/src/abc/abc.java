/*
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode *next;
};
*/

    static LinkedListNode removeNodes(LinkedListNode list, int x) {
        if(list==null){
            return null;
        }
        if(list.next==null){
            if(list.val>x){
                return null;
            }
        }
        LinkedListNode curr= list;
        LinkedListNode prev=curr;
        while(curr!=null){
            if(list.val>x){
                list=list.next;
                curr=list;
                prev=curr;
                continue;
            }
            if(curr.val>x){
                LinkedListNode nextNode=curr.next;
                prev.next=curr.next;
                curr=nextNode;
            }
            else{
                prev=curr;
                curr=curr.next;
            }
        }
        
        
        return list;


    }

