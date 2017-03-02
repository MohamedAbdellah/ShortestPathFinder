/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortestpath;

/**
 *
 * @author mohamed
 */
class Queue
{
int items[]=new int[10];
int front,rear;
Queue()
{
    front=0;
    rear=-1;
}
void insert(int e)
{
if(rear==9)
    System.out.println("Queue overflow");
else
{
items[++rear]=e;
}
}
int empty()
{
return (rear<front? 1:0);
}
int remove()
{
int x=0;
if(empty()==1)
{
System.out.println("Queue Underflow");
return 0;
}
else
{
x=items[front++];
return x;
}
}

}
