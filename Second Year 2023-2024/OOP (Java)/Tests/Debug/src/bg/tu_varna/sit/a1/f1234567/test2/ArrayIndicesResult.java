package bg.tu_varna.sit.a1.f1234567.test2;

public class ArrayIndicesResult {
    private Integer currentIndex;
    private Integer leftItemIndex;
    private Integer rightItemIndex;

    public ArrayIndicesResult(Integer currentIndex, Integer leftItemIndex, Integer rightItemIndex) {
        this.currentIndex = currentIndex;
        this.leftItemIndex = leftItemIndex;
        this.rightItemIndex = rightItemIndex;
    }

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(Integer currentIndex) {
        this.currentIndex = currentIndex;
    }

    public Integer getLeftItemIndex() {
        return leftItemIndex;
    }

    public void setLeftItemIndex(Integer leftItemIndex) {
        this.leftItemIndex = leftItemIndex;
    }

    public Integer getRightItemIndex() {
        return rightItemIndex;
    }

    public void setRightItemIndex(Integer rightItemIndex) {
        this.rightItemIndex = rightItemIndex;
    }
}
