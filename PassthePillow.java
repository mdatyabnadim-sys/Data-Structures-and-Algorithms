class PassthePillow{
    public int passThePillow(int n, int time) {
        
        // One full back-and-forth cycle takes:
        // Forward: (n - 1) steps
        // Backward: (n - 1) steps
        // Total = 2 * (n - 1)
        int t = time % (2 * (n - 1));
        
        // If t is less than n, we are still moving forward
        // Positions go from 1 → n
        // So current position = t + 1
        if (t < n) 
            return t + 1;
        
        // Otherwise, we are in the backward phase
        // Positions go from n-1 → 1
        // Formula derived from symmetry of the cycle
        return 2 * n - t - 1;
    }
}