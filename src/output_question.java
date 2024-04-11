public class output_question {
    public static void main(String[] args) {


/*
        System.out.println(System.out.println("hi")); // error

        int a, b, c;
        a=-3+2*7-4;
        b=a*8+4%5-6;
        c=a+b*3-2%5-4;
        System.out.println(a+" "+b+" "+c);    // 7 54 163



        int a=2,b=5,c;
        a=a*a++ - --a; // 2
        c=b++ - b--; // -1
        System.out.println("a="+a+",b="+b+",c="+c); // 2 5 -1
        System.out.println(a++ + ++a * a--);  // 18
        System.out.println(b= b++ * b--); // 30
        System.out.println("a="+a+",b="+b+",c="+c);  // 3 30 -1



        System.out.print(011+ 1.94 + "C" + "S"); // 011 is a octal number so it'll be so 10.94CS



        System.out.println(2+3+"bc"+'c'+'a');  // 5bcca
        System.out.println('c'+'a'+2+3+"bc");  // 201bc
        System.out.println("bc"+'c'+'a'+2+3);  // bcca23
        System.out.println("bc"+('c'+'a')+(2)+3); // bc19623


        int x = - 4;
        System.out.println(x>>1); // -2
        int y = 4;
        System.out.println(y>>1); // 2

        System.out.println(10 + 15 + "Hello"); // 25Hello
        System.out.println("Hello" + 10 + 15); // Hello1015


        byte b = 10;
//        b = (byte)(b + 10);
        b+= 10;
        System.out.println(b);


        int i = 4;
        int j = 21;
        int k = ++i * 7 + 2 - j--;
        System.out.println("k = " + k);

        int a = 2;
        int b = 3;
        int result = a && b;
        System.out.println(result);

        int x=-5;
        System.out.println(~x);


        int x=Integer.MAX_VALUE;
        System.out.println(x>>28);

        int x=10,y=5;
        System.out.println(x++^++y|(x=y)&101);


        int x=-4,y=4;
        System.out.println((x>>>30)+" "+(x>>30)+" "+(y>>1));

        int x=5;
        int y = x++ + ++x + ++x;
        int z = --y + x++ + y++;
        int p = z++ - (z%10) + (p=z);
        System.out.println(x+" "+y+" "+z+" "+p);

        int x=10;
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);

        System.out.println(10<<2);
        System.out.println(10<<3);
        System.out.println(20<<2);
        System.out.println(15<<4);


        System.out.println(10>>2);
        System.out.println(20>>2);
        System.out.println(20>>3);


        int a=10;
        int b=5;
        int c=20;

        System.out.println(a < b && a < c);
        System.out.println(a < b & a < c);
 */




//        int a = Integer.MAX_VALUE;
//        System.out.println(2+a);

//int a = 10;
//int b = 5, c = 20;
//        System.out.println(a< b && a++ < c);
//        System.out.println(a);


/*
w = 8
g = 10

g = 8
w = 10

h = g
g  = w
w=h
 */
//        int a = 2;
//        int b = 3;
//
//
//        if (a>b){
//            if (a==b){
//
//            }
//        } else if (a == b) {
//
//        } else if(a<b){
//            System.out.println("false");
//        }else
//        {
//
//        }


//        System.out.println(15/7.0);





//        if (a>b){
//            System.out.println("good boy");
//            if (a<b){
//                System.out.println("hahahaha");
//            }
//        } else if (a<b) {
//            System.out.println("ok boy");
//        } else {
//            System.out.println("bad boy");
//        }

//        switch (a){
//            case 1 : {
//                System.out.println("good");
//            }
//            break;
//            case 2 : {
//                System.out.println("bad");
//            }
//            break;
//            default:{
//                System.out.println("okayy");
//            }
//        }

//        int a = 1;
//        int b = 4;
//
//        do {
//            System.out.println("hello");
//           b++;
//        }while (b<7);
//
//        while (b<7){
//
//        }
//
//        for (int i = 1; i < 5; i++){
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *
        //  -100 + 3647
//        **
//        ***
//        ****
//        *****


//        System.out.println(-4 >>> 2);
//        System.out.println(-4 >> 2);















        String one = "Hello";
        String two = "Hello";
        if(one.equals(two))
        {
            System.out.println("one == two");
        }
        else
        {
            System.out.println("one != ppo");
        }




    }

    static void check(String str){
        str = str.toLowerCase();
        char [] c = {'a', 'e', 'i', 'o','u'};
        int counter = 0;
        for (int i = 0; i < c.length; i++) {

            for (int j = 0; j < str.length(); j++) {
                if (c[i] == str.charAt(j)){
                    counter++;
                    break;
                }
            }

        }
        System.out.println(counter);

    }

}
