/*
给定一个单链表 L：L0→L1→…→Ln-1→Ln ，
将其重新排列后变为： L0→Ln→L1→Ln-1→L2→Ln-2→…

你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。

 */

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
      public static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }

          @Override
          public String toString() {
              return "ListNode{" +
                      "val=" + val +
                      ", next=" + next +
                      '}';
          }
      }
/*
    class Solution {
        public void reorderList(ListNode head) {
            List<ListNode>list=new ArrayList<>();//建立一个链表来保存
            ListNode cur=head;

            while(cur!=null){
                list.add(cur);
                cur=cur.next;
            }
            int i=0;
            int j=list.size()-1;
            /*
            已经建好list，然后我们就得到链表的头指针，尾指针
            如果是奇数链表，走到最后i>j，自己直接退出
            如果是偶数链表，走到最后i=j，我们得在循环中判断，直接退出


            while(i<j){
                list.get(i).next=list.get(j);
                i++;
                if(i==j){
                    break;
                }
                list.get(j).next=list.get(i);
                j--;
            }
            list.get(i).next=null;
        }
    }
}
*/
class Solution {
    public void reorderList(ListNode head) {
            if(head==null||head.next==null||head.next.next==null){
                return ;
            }
            ListNode fast=head;
            ListNode slow=head;
            ListNode pro=null;
            while(fast.next!=null&&fast.next.next!=null){
                fast=fast.next.next;

                slow=slow.next;

            }
            pro=slow.next;
        slow.next=null;
            pro= reverse(pro);
            while(fast!=null){

            }

        }
    }

    private static ListNode reverse(ListNode pro) {

        ListNode cur=pro;
        ListNode node=null;
        while(cur!=null){
            ListNode p=cur.next;

            cur.next=node;
            node=cur;
            cur=p;
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode a=new ListNode(1);
        ListNode b=new ListNode(2);
        ListNode c=new ListNode(3);
        ListNode d=new ListNode(4);
        ListNode e=new ListNode(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;


        a= reverse(a);
        System.out.println(a);
    }
}