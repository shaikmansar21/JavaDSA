#include<stdio.h>
int main()
{
	int a[10][10],i,j;
	int row,col;
	printf("Enter the row & col size:");
	scanf("%d%d",&row,&col);
	printf("Enter %d elements:",row*col);
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	int sum=0;
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			sum=sum+a[i][j];
		}
	}
	printf("sum=%d",sum);
}
