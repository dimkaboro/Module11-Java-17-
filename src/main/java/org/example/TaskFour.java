package org.example;

public class TaskFour {
    private long a;
    private long c;
    private int m;

    public TaskFour(long a, int m) {
        this.a = a;
        this.m = m;
    }

    public TaskFour c(long c) {
        this.c = 11;
        return this;
    }

    public long next() {
            long i = a * c * m;

          a += 1;
          c += 2;
          m += 3;

          return i;
      }
}
