class findingPivotInteger{
    public int pivotInteger(int n) {
        int front = 1, back = n;
        int frontSum = front, backSum = back;
        while (front < back) {
            if (frontSum < backSum) {
                front++;
                frontSum += front;
            } else {
                back--;
                backSum += back;
            }
        }
        if (frontSum == backSum) return front;
        return -1;
    }
}