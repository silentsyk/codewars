public class ConwayLife {

    public static int[][] getGeneration(int[][] cells, int generations) {
        // your code goes here
        while (generations-->0){
            cells=process(cells);
        }

        return reduceBound(cells);
    }

    private static int[][] process(int[][] cells){
        int newCells[][]=new int[cells.length+2][cells[0].length+2];
        int copy[][]=new int[cells.length+2][cells[0].length+2];
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if(cells[i][j]==1){
                    copy[i+1][j+1]=1;
                }
            }
        }

        for (int i = 0; i < newCells.length; i++) {
            for (int j = 0; j < newCells[0].length; j++) {
                newCells[i][j]=gen(i,j,copy);
            }
        }

        newCells=reduceBound(newCells);
        return newCells;
    }

    private static int[][] reduceBound(int[][] cells) {
        if(cells.length==0){
            return cells;
        }
        int starti=0,startj=0,endi=cells.length,endj=cells[0].length;
        boolean flag=true;
        int p=0;
        for (int i = 0; i <cells.length; i++) {
            for (int j = 0; j < cells[0].length; j++) {
                if (cells[i][j] == 1) {
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }else {
                p++;
            }

        }
        starti+=p;

        flag=true;
        p=0;
        for (int i = cells.length-1; i >=0; i--) {
            for (int j = 0; j <cells[0].length ; j++) {
                if (cells[i][j] == 1) {
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }else {
                p++;
            }
        }
        endi-=p;

        flag=true;
        p=0;
        for (int i = 0; i <cells[0].length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[j][i] == 1) {
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }else {
                p++;
            }
        }
        startj+=p;

        flag=true;
        p=0;
        for (int i = cells[0].length-1; i >=0; i--) {
            for (int j = 0; j <cells.length ; j++) {
                if (cells[j][i] == 1) {
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }else {
                p++;
            }
        }
        endj-=p;

        int[][] ret=new int[][]{};
        try {
             ret = new int[endi - starti ][endj - startj ];
        }catch (Exception e){
            return ret;
        }
        for (int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[0].length; j++) {
                ret[i][j]=cells[starti+i][startj+j];
            }
        }

        return ret;
    }

    private static int gen(int i, int j, int[][] cells) {
        int count=0;
        for (int k = i-1<0?0:i-1; k <=(i+1==cells.length?i:i+1) ; k++) {
            for (int l = j-1<0?0:j-1; l <= (j+1==cells[0].length?j:j+1); l++) {
                if(k==i&&l==j){
                    continue;
                }
                if(cells[k][l]==1){
                    count++;
                }
            }
        }

        if(cells[i][j]==1){
            if(count<2||count>3){
                return 0;
            }else {
                return 1;
            }
        }else {
            if(count==3){
                return 1;
            }
        }
        return 0;
    }

}