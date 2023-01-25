class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultance = new ArrayList<List<Integer>>(); 
        List<Integer> row ,previous = null;
        //loop
        int i,j;
        for(i=0; i<numRows; i++){
            row = new ArrayList<Integer>();
                for(j=0; j<=i; j++){
                    if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(previous.get(j-1) + previous.get(j));
                }

                }
                previous =row;
                resultance.add(row);
            
        }
        return resultance;
    }
}