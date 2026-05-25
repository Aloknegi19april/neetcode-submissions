class DynamicArray {

    int[] array;
    int size;
    public DynamicArray(int capacity) {
        array = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        return array[i];
    }

    public void set(int i, int n) {
        array[i] = n;
    }

    public void pushback(int n) {
        if(getSize() == getCapacity()){
            resize();
        }
        array[getSize()] = n;
        size++;
    }

    public int popback() {
        int last = array[getSize()-1];
        size--;
        return last;
    }

    private void resize() {
        int newCapacity = getCapacity() * 2;
        int[] newArray = new int[newCapacity];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}
