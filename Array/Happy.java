class Happy {
    public int isHappy(int n) {
        int num=n;
        int k;
        int sum;
        while(num!=1)
        {
            sum=0;
            while(num!=0)
            {
              k=num%10;
              k=k*k;
              sum=sum+k;
              num=num/10;
            }
          num=sum; 
        }
        return 1;
    }
    public static void main(String args[])
    {
        Happy ob=new Happy();
        int n=19;
        ob.isHappy(n);
    }
}