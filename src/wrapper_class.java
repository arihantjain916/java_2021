public class wrapper_class {
    public static void main(String[] args) {
        //Initialize variable
        byte a = 1;
        int b = 2;
        // char c = 5;
        short c = 3;
        boolean d = true;
        float e = 4.4f;
        long f = 5;
        double g = 6.6d;
        char h = 'a';
        System.out.println("---> (1) Primitive Values <---");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println();

        // Convert primitive to object
        Byte i = a;
        Integer j = b;
        Short k = c;
        Boolean l = d;
        Float m = e;
        Long n = f;
        Double o = g;
        Character p = h;
        System.out.println("---> Object Values <---");
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println();

        // Convert object to primitive
        System.out.println("---> (2) Primitive Values <---");
        byte q =  i;
        int r = j;
        short s = k;
        boolean t = l;
        float u = m;
        long v = n;
        double w = o;
        char x = p;
        System.out.println(q);
        System.out.println(r);
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);
        System.out.println();
    }
}
