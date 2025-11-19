class smallestMissingMultiple{
    public int missingMultiple(int[] nums, int k) {
       Set<Integer> set= new HashSet<>();
        for(int num: nums)
            set.add(num);
        int m=k;
        while(set.contains(m)){
            m+=k;
        }
        return m;
    }
}