/*Write a program that displays the following table:
a  a^2    a^3
1   1       1
2   4       8
3   9      27
4   16     64*/

class Table
{
public static void main(String args[])
{
System.out.printf("%s   %s    %s\n","a","a^2","a^3");
for(int i=1;i<4;i++)
{
System.out.printf("%d   %d    %d\n",i, i*i, i*i*i);
}
}

}
