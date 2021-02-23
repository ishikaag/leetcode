


class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        ListNode p1=l1, p2=l2, temp=result;
        int carry=0, sum=0;
        int a=0, b=0;
        while(p1!=null || p2!=null){
            if(p1!=null)
                a = p1.val;
            else
                a=0;
            if(p2!=null)
                b = p2.val;
            else
                b=0;
            sum = carry + a + b;
            carry = sum/10;
            temp.next = new ListNode (sum%10);
            temp = temp.next;
            if(p1!=null)
                p1 = p1.next;
            if(p2!=null)
                p2 = p2.next;
        }
        if(carry>0) {
            temp.next = new ListNode(carry);
        }

        return result.next;

    }
}