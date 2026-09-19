class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        //Let (x,y) be the nearest from circle which lies in rectangle 
        // If distance between (x,y) and (xCenter,yCenter) is <= radius then return true, or else false.

        int x = 0;
        //Finding x
        //Case 1: Rectangle lies on right side of circle
        if (x1 > xCenter)
            x = x1;

        //Case 2: Rectangle lies on left of circle 
        else if (x2 < xCenter)
            x = x2;

        //Case 3:Rectangle does not completely lie on left or right
        else { // xCenter is in between of x1 and x2
            x = xCenter;
        }

        int y = 0;
        //Finding y
        //Case 1: Rectangle lies on upper side of circle
        if (y1 > yCenter)
            y = y1;

        //Case 2: Rectangle lies below the circle 
        else if (y2 < yCenter)
            y = y2;

        //Case 3:Rectangle does not completely lie above or below the circle
        else { // yCenter is in between of y1 and y2
            y = yCenter;
        }

        return (Math.sqrt(Math.pow(y - yCenter, 2) + Math.pow(x - xCenter, 2)) <= radius);
    }
}