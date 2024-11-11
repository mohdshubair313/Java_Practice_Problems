public class RepeatedNum {
    public static void main(String[] args) {
        int n = 45532;

        int count = 0;   // count wo container jo ye store karega ki kitni baar konsa number ayaa hai
        while(n > 0) {
            int rem = n % 10;
            if(rem == 5) {
                count++;    // if rem yaani last digit 5 aayaa to count++ karna hai warna nahi karna hai
            }
              n = n / 10;  // Yeh step n ko 10 se divide karke uske last digit ko remove kar deta hai. Example ke liye, agar n = 45532 hai, toh n / 10 4553 return karega.
        }

        System.out.print(count);
    }
}
