
### Why <small>(the bloody)</small> *Java* ?
- Ha, I'm **definitely** not a *Java* programmer.
- The only reason I'm learning *Java* is that I wanna be **a litle familiar** with it.

-----

- Compile & Run
    - ```alias jj='jcar() { rm -fv "$1.class" &> /dev/null; javac "$1.java" && java "$1" }; jcar```

- Packages 
    - Syntax
        - For code, ```package ch01.sec01;```
        - For exec, ```javac ch01.sec01.YOUR_FILE``` <small>( ```.. sec01.YOUR_FILE``` is **invalid**!! )</small>
    - You'll need it when you wanna invoke it not as a single file.

- JShell
    - Intro
        - I myself chose the *easiest* solution <small>( using **Docker** XD )</small>.
    - Setup
        1. Get ur *Docker* running <small>( hmm )</small>
        2. Put it: ```docker run -it --rm -p 8080:8080 rahmanusta/tryjshell```
        3. Go ```http://localhost:8080/```, 😏 **done**.
        4. One more thing: Umm.. This *REPL* is great, way beyond my expectations!!
    - Basics 
        - Typing 
            1. Just like the *REPL* in Python.
            2. **Re-using** code by ```$NUM``` <small>( e.g. ```$1 * 20``` )</small>.
        - Typing code
            - *Init_ing object* : ```new Random``` then ```SHIFT + TAB | V```.
            - *Importing* : ```Duration``` then ```SHIFT + TAB | I``` <small>( some were imported already )</small>
        - *Help*
            - ```/help```

- Variable
    - Init 
        
        ```java
        // Bad practice, just for demonstration
        int a, b, c;
        int a, b, c = 0;
        
        int a    = b    = c = 0
        int a = 0, b = 0, c = 0;
        ```
    
    - Constant

        ```java
        // Different scopes
        public static final int DAYS_PER_WEEK = 7;
                      final int DAYS_PER_WEEK = 7;
      
        // A glimpse of 'enum' 
        enum WEEKDAY_OUR_COMPANY {
            MONDAY, TUESDAY, WEDNESDAY,
            THURSDAY, FRIDAY,
            SATURDAY,
        };
        ```
    
    - Type :: Number
            
        ```java
        // Mess around
        Integer.MAX_VALUE; 
        Double.isNaN     (Double.NaN)
        Double.isInfinite(Double.POSITIVE_INFINITY)

        // Suit yourself :)
        int        lin_one = 0; 
        int        lin_two = 100;
        long       min_one = 0;
        long       min_two = 100L;
        BigInteger bin_two = BigInteger.ZERO; 
        BigInteger bin_two = BigInteger.valueOf(100); 

        // Just use double 
        double flt = 7.654321;  

        // Casting 
        char A = (char)('B' - 1);
        ```
    
    - Type :: String 
            
        ```java
        // Tiny examples down below 

        StringBuilder mt_str = new StringBuilder();
        mt_str.append("Hello");

        String imt_str = "Hello";

        imt_str.equals("Hello");
        "Hello".equals(imt_str);

        Integer.parseInt("11111111");
        Integer.parseInt("11111111", 2);
        ```
