
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
        2. Pull it: ```docker run -it --rm -p 8080:8080 rahmanusta/tryjshell```
        3. Go ```http://localhost:8080/```, and **done**!
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

