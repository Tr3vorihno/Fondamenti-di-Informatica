public class Dizionario {
    public final static int INITIAL_LENGTH = 4;
    private Pair[] a;
    private int vSize;

    public Dizionario() {
        a = new Pair[INITIAL_LENGTH];
        vSize = 0;
    }

    public boolean isEmpty() {
        return vSize == 0;
    }

    public void makeEmpty() {
        vSize = 0;
    }

    public void insert(int key, String value) {
        Pair p = new Pair(key, value);
        if (vSize == a.length) {
            Pair[] temp = new Pair[a.length * 2];
            System.arraycopy(a, 0, temp, 0, a.length);
            a = temp;
        }
        a[vSize++] = p;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < vSize; i++) {
            s.append(a[i]);
        }
        return s.toString();
    }

    public Pair[] toArray() {
        Pair[] na = new Pair[vSize];
        System.arraycopy(a, 0, na, 0, vSize);
        return na;
    }

    class Pair {
        private int key;
        private String value;

        public Pair(int key, String value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public String toString() {
            return "[ " + key + " -> " + value + " ]\n";
        }
    }
}