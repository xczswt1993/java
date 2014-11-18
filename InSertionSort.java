/*************************************************************************
	> File Name: InSertionSort.java
	> Author: 
	> Mail: 
	> Created Time: 2014年11月18日 星期二 20时09分17秒
    > 这是关于直接插入排序和希尔排序的java程序
    >直接插入排序：
    >将一个记录插入到已有排序好的有序表中
    >1.sorted数组的第0个位置没有放数据。
    >2.从sorted第二个数据开始处理：
    >如果该数据比它前面的数据要小，说明该数据要往前面移动。
    >a.首先将该数据备份至第0位当哨兵。
    >b.然后将该数据前面那个数据后移。
    >c.然后往前搜索，找插入位置。
    >d.找到插入位置后，将第0位置的那个数据插入对应的位置。
    >
 ************************************************************************/

public class InSertionSort{
    public void straightInsertionSort(double [] sorted){
        int  sortedLen =sorted.length;
        for(int j=2;j<sortedLen;j++){
            if(sorted[j]<sorted[j-1]){
                sorted[0]=sorted[j];
                sorted[j]=sorted[j-1];
                int insertPos=0;
                for(int k=j-2;k<=0;k--){
                    if(sorted[k]>sorted[0]){
                    	sorted[k+1]=sorted[k];
                    }else{
                    	insertPos=k+1;
                    	break;
                    }
                }
                sorted[insertPos]=sorted[0];
            }
        }
    }
    public void shellInsertionSort(double [] sorted,int inc){
    	int sortedLen=sorted.length;
    	for(int  j=inc+1;j<sortedLen;j++){
    		if(sorted[j]<sorted[j-inc]){
    			sorted[0]=sorted[j];
    			int insertpos=j;
    			for(int k=j-jnc;k>=0;k-=inc){
    				if(sorted[k]>sorted[0]){
    					sorted[k+inc]=sorted[k];
    					if(k-inc<=0){
    						insertPos=k;
    					}
    					}else{
    						insertPos=k+inc;
    						break;
    				}
    				
    			}
    		}
    		sorted[insertpos]=sorted[0];
    	}
    }
}

