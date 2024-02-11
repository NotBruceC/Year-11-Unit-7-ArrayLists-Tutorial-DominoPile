public class Domino implements Comparable<Domino> {

    private int top = 0;
    private int bottom = 0;

    Domino domino;

    public Domino() {

    }

    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }


    public int getTop() {
        return top;
    }
    public Domino getPile() {
        return domino;
    }


    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public void settle() {
        if (top >= bottom) {
            flip();
        }
    }


    @Override
    public int compareTo(Domino other) {
        int smallestThis = Math.min(this.top, this.bottom);
        int smallestOther = Math.min(other.top, other.bottom);

        if (smallestThis < smallestOther) {
            return -1;
        } else if (smallestThis > smallestOther) {
            return 1;
        } else {
            int largestThis = Math.max(this.top, this.bottom);
            int largestOther = Math.max(other.top, other.bottom);

            if (largestThis < largestOther) {
                return -1;
            } else if (largestThis > largestOther) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public int compareToWeight(Domino other) {
        int thisWeight = this.top + this.bottom;
        int otherWeight = other.top + other.bottom;

        if (thisWeight < otherWeight) {
            return -1;
        } else if (thisWeight > otherWeight) {
            return 1;
        } else {
            return 0;
        }
    }

    public boolean canConnect(Domino other) {
        if (this.top == other.top || this.top == other.bottom ||
                this.bottom == other.top || this.bottom == other.bottom) {
            return true;
        }
        return false;
    }


    public void flip() {
        int bottom = this.bottom;
        int top = this.top;
        this.bottom = top;
        this.top = bottom;

    }

    @Override
    public String toString() {
        return top + "/" + bottom;
    }
}


