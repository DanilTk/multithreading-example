package com.company;

enum Color {
    RED, GREEN, BLUE;

    private Color() {
        System.out.println("Constructor called for : " +
                this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }

    public static class Test {
        // Driver method
        public static void main(String[] args) {
            Color c1 = Color.BLUE;
            //   System.out.println(c1);
            //c1.colorInfo();
        }
    }
}