import java.util.*;
public class BSTApp {
public static void main(String[] args)
{
Scanner read = new Scanner(System.in);
boolean b = true;
BST btree = new BST();
while (b)
{
System.out.println("1. Create Files \n2. Traverse \n3.Exit");
System.out.print("Enter Choice: ");
int choice = read.nextInt();
switch(choice)
{
case 1:
System.out.println("File Creation:");
System.out.print("Enter filename: ");
read.nextLine();
String str = read.nextLine();
btree.insert(str);
break;
case 2:
System.out.print("Traversal of filestructure in:");
System.out.println("Inorder,Preorder and Postorder");
System.out.println("Inorder:-");
btree.inorder(btree.getRoot());
System.out.println("Preorder:-");
btree.preorder(btree.getRoot());
System.out.println("Postorder:-");
btree.postorder(btree.getRoot());
break;
case 3:
b = false;
break;
default: System.out.println("Invalid choice try again:");
}
}
read.close();
}
}
class File
{
static final Random gen = new Random();
static int c = 0;
static int [] random;
private String fname;
private int fID;
{
random = randomNumbers(50, 100);
}
File(String n)
{
fname = new String(n);
fID = random[c++];
}
static int[] randomNumbers(int n, int maxRange)
{
int[] result = new int[n];
Set<Integer> used = new HashSet<Integer>();
for (int i = 0; i < n; i++)
{
int newRandom;
do
{
newRandom = gen.nextInt(maxRange+1);
} while (used.contains(newRandom));
result[i] = newRandom;
used.add(newRandom);
}
return result;
}
int id()
{
return fID;
}
public String toString()
{
return String.format("File ID -> " + fID + "\tFile name -> "
+ fname);
}
}
class BST
{
private class Node
{
File data;
Node left;
Node right;
Node(File file)
{
data = file;
left = right = null;
}
}
private Node root;
private Node insert(File x, Node t)
{
if(t == null)
t = new Node(x);
else if(x.id() < t.data.id())
t.left = insert(x, t.left);
else if(x.id() > t.data.id())
t.right = insert(x, t.right);
return t;
}
void insert(String x)
{
File f = new File(x);
root = insert(f, root);
}
void inorder(Node t)
{
if(t == null)
return;
inorder(t.left);
System.out.println(t.data + " ");
inorder(t.right);
}
void preorder(Node t)
{
if(t == null)
return;
System.out.println(t.data + " ");
preorder(t.left);
preorder(t.right);
}
void postorder(Node t)
{
if(t == null)
return;
postorder(t.left);
postorder(t.right);
System.out.println(t.data + " ");
}
BST()
{
root = null;
}
Node getRoot()
{
return root;
}
}