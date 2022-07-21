class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //if both values are same no need to reverse
        if(left==right) return head;
        
        ListNode node = head;
        int count =1;
        //pushing element range from left to right onto stack
        Stack<Integer> st = new Stack<>();
        while(count<=right){
            if(left<=count && right>=count){
                st.push(node.val);
            }
            count++;
            node = node.next;
        }
        
        count=1;
        node=head;
        //just poping elements from stack
         while(count<=right){
            if(left<=count && right>=count){
                node.val=st.pop();
            }
             count++;
            node = node.next;
        }
        return head;
    }
}