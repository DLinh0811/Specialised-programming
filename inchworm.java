public class inchworm {
    public static void main(String[] args) {
        int no_leaves = lunchtime(20, 3, 7);
        System.out.println(no_leaves);
    } 

    public static int lunchtime(int branch, int rest, int leaf) {
        int no_leaves = 0;
        for (int i = 0; i < branch; i+= leaf) {
            for (int j = 0; j < branch; j = j + rest) {
                if (i == j) {
                    no_leaves++;
                }  
            }
            
        }
        
        return no_leaves;
    }
}
