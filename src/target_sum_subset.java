public class target_sum_subset {
    public static void main(String[] args) {
        int [] ar = {10 , 20 , 30 , 40 , 50};
        sumofsubset(ar, 0, "", 0, 70);
    }

    public static void sumofsubset(int[]ar , int ind , String ans , int sos , int tar) {
        if(ind == ar.length){
            if(tar == sos){
                System.out.println(ans);
            }
            return;
        }
        sumofsubset(ar, ind + 1, ans + ar[ind] + ", ", sos + ar[ind], tar);
        sumofsubset(ar, ind + 1, ans, sos, tar);
    }
}
