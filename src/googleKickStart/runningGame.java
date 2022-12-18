package googleKickStart;

import java.util.Scanner;

public class runningGame {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			
			int rs=sc.nextInt();
			int rh=sc.nextInt();
			int max=rs+rh;
			
			int dist=0;
			
			int n=sc.nextInt();
			int[][] nArray=new int[n][2];
			int nDistance=Integer.MAX_VALUE;
			int nCount=0;
			
			for(int j=0;j<n;j++) {
				for(int k=0;k<2;k++) {
					nArray[j][k]=sc.nextInt();
				}
				dist=(int) (Math.sqrt((nArray[j][0])*(nArray[j][0]))+((nArray[j][1])*(nArray[j][1])));
				if(dist<nDistance){
					nDistance= dist;
				}
				if(dist<=max) {
					nCount++;
				}
			}
			
			
			int m=sc.nextInt();
			int[][] mArray=new int[m][2];
			int mDistance=Integer.MAX_VALUE;
			int mCount=0;
			
			for(int j=0;j<m;j++) {
				for(int k=0;k<2;k++) {
					mArray[j][k]=sc.nextInt();
				}
				dist=(int) (Math.sqrt((mArray[j][0])*(mArray[j][0]))+((mArray[j][1])*(mArray[j][1])));
				if(dist<mDistance){
					mDistance=dist;
				}
				if(dist<=max) {
					mCount++;
				}
			}
			
			
			if(nDistance<mDistance) {
			System.out.println("Case #"+(i+1)+": " +(nCount-mCount)+" "+0);
			
			}
			if(nDistance<mDistance) {
					System.out.println("Case #"+(i+1)+": " +0+" "+(mCount-nCount));
				}
			}
			
		}
	}

