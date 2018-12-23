import java.util.*;
import java.lang.*;
class Kmeans{
public static void main (String args[])
{int i;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of objects :");
int n=sc.nextInt();
double c[]=new double [n];
System.out.println("enter objects :");
for(i=0;i<n;i++)
{
	c[i]=sc.nextDouble();
}
System.out.println("enter means for two clusters :");
double k1=sc.nextDouble();
double k2=sc.nextDouble();
cluster(k1,k2,c,n);
}
static double mean(int n,double arr[])
{int j;double sum=0; double m;
double no=n;
for(j=0;j<n;j++)
{
	sum=sum+arr[j];
}
	m=sum/no;
	return m;
}
static double dist(double m1,double m2, double c)
{
	double a1,a2;
	a1=Math.abs(c-m1);
	a2=Math.abs(c-m2);
	if(a1<a2)
	return m1;
	else
		return m2;
}
 static void cluster(double k1,double k2,double c[],int n){
	double tmp;double less; int count=1;
	int i; double k11,k22,tk1,tk2;
	double c1[]=new double [n];
double c2[]=new double [n];
	do{
		System.out.println("Iteration No :"+count);
		count++;
		int b1=0,b2=0;
		tk1=k1;tk2=k2;
for(i=0;i<n;i++)
{tmp=c[i];
less=dist(k1,k2,tmp);
if(less==k1){
	c1[b1]=tmp;
	b1++;
}
else{
	c2[b2]=tmp;
	b2++;
}
}
System.out.println("cluster 1");
for(i=0;i<b1;i++)
{
	System.out.print("\t"+c1[i]);
}
System.out.println();
System.out.println("cluster 2");

for(i=0;i<b2;i++)
{
	System.out.print("\t"+c2[i]);
}
System.out.println();
k11=mean(b1,c1);
k22=mean(b2,c2);
k1=k11;k2=k22;
}
while(tk1!=k11&&tk2!=k22);
}
}