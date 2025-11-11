class oddNoCounting{
    public int countOdds(int low, int high) {
        int oddCount=0;
       int NumberOfNumbers=high-low+1;
       if(high%2==0&&low%2==0) oddCount=(NumberOfNumbers-1)/2;
       else if(high%2!=0&&low%2!=0) oddCount=(NumberOfNumbers+1)/2;
       else oddCount=NumberOfNumbers/2;
       return oddCount;
    }
}