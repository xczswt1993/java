/*************************************************************************
	> File Name: InSertionSort.java
	> Author: 
	> Mail: 
	> Created Time: 2014年11月18日 星期二 20时09分17秒
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

