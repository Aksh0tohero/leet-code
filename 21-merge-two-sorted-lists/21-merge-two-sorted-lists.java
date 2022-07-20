class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1==null||list2==null) return list1==null?list2:list1;
        ListNode result       = new ListNode();
        ListNode resultHead   = result;
        while(true){
            if (list1==list2) return resultHead.next; //if both are null
            if (list1==null || list2!=null && list2.val<list1.val){ //&& has precedence
                var tmp=list1; //swap lists to always append the 1st
                list1=list2;
                list2=tmp;
            }
            result.next=list1;
            result=result.next;
            list1=list1.next;
        }
    }
}