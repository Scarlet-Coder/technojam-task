class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        int r[]=new int[mat.length];
        int c[]=new int[mat[0].length];
        int m = mat.length;
        int n = mat[0].length;
        for(int i=0; i<m; i++) 
        {
            int index =0;
            for (int j = 0; j <n; j++)
            {
                if (mat[i][j] < mat[i][index]) 
                    index = j;
            }
            r[i] = index;
        }
        for (int  i=0; i<n; i++)
        {
            int index=0;
            for (int j = 0; j<m; j++) 
            {
                if (mat[j][i] > mat[index][i]) 
                    index=j;
            }
            c[i]=index;
        }
        LinkedList<Integer> list = new LinkedList<Integer> ();
        for (int i =0 ; i <m; i ++ )
        {
            if (c[r[i]] == i)
                list.add(mat[i][r[i]]);
        }
         return list;
    }
}
