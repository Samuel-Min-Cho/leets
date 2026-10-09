""" Variable  ---------------------------------------------------
- Must start w a letter || underscore char 
- No number starting 
- Case sensitive 
- No python keywords as a var name 
"""

myVariableName # camel casej
MyVariableName # pascal case 
my_variable_name # snake case

X, y, z = “orange”, “Banana”, “Cherry” 
X = y = z = “Orange” 

Fruits = [“apple”, “banana”, “cherry”]
X, y, z = fruits 

Print (x, y, z)
Print (x + y + z) 

X = 5 
Y = "john” 
Print (x, y) 
Print (x + y) : error 

"""
# Global & local var 
Global keyword = global x 
 - To change the value of a global variable inside a function 
"""

# Types ---------------------------------------------------------
# text 
x = "hello" 
x = str("hello") 
# numeric
# cannot convert complex to other type 
x = 20, x = 20.5, x = 1j
b = int(20), c = float(20.5), d = complex(1j)
# list 
x = ["a", "b", "c"]
x = list(("a", "b", "c"))
x = ("a", "b", "c") 
x = tutple (("a", "b", "c"))
x = range (6)
# mapping 
x = {"name" : "John", "age" : 36}
x = dict(name = "John", age = 36)
# Set 
x = {"a", "b", "c"}
x = set(("a", "b", "c")) 
x = ({"a", "b", "c"})  
x = frozenset(("a", "b", "c"))
# boolean
x = true
x = bool(5)
# binary 
x = b"hello"
x = bytes (5) 
x = bytearray (5)
x = memoryview(bytes(5)) 
# NoneType 
x = None

print (type(a)) 

import random
print (random.randrange(1,10) 

# casting numeric ------------------------------------------------
x = int(2.8) # 2.8 
x = int("3") # 3 
x = float(1) # 1.0
x = float(2.8) # 2.8
x = float("3") # 3.0
x = float("4.2") # 4.2
x = str("s1") # 's1'
x = str(2) # '2'
x = str(3.0) # '3.0'

# String --------------------------------------------------------
print("hello")
print('hello')

print("hello 'John'")
print ('hello "John"')

a = "hello"
print(a) 

a = """ multilie ,
multiline 2,
miltiine 3,
multiline 4. """
print(a) 
 
print(a[1]) # position at 1, starting at 0 

for x in "banana": 
    print(x) 

a = "hello, world" 
print(len(a)) 

txt = "the best things in life are free!" 
print("free" in txt) 
if "free" in txt: 
    print("yes, 'free'")
print("expensive" not in txt)
if "exp" not in txt: 
    print("no")

# slicing -------------------------
b = "hello, world" 
print(b[2:5])
print(b[:5]) # start to 5 
print(b[2:])
print(b[-5:-2])

# mod ----------------------
print(a.upper())
print(a.lower())
print(a.strip()) # no whitespace from the beginning or end 
print(a.replace("h", "j")) # case sensitive 
print(a.split(",")) # ['hello', 'world']

# concatenation -----------------
a = "hello"
b = "world" 
c = a + b 
print(c) # helloworld
c = a + " " + b 
print(c) # hello world 

# formatting -------------------
age = 36
txt = "my age" + age # ERROR 
txt = f"my age {age}"
print(txt)

price = 59
txt = f"the price {price:.2f}" # fixed 2 dec number
print(txt) 

# escape char ------------------
txt = "we are "vikings" from the north" # ERROR 
txt = "we are \"vikings\" from the north" # \"
"""
\' : single quote
\\ : backslash
\n : new line
\r : carriage return 
\t : tab 
\b : backspace 
\f : form feed 
\ooo : octal value 
\xhh : hex value 
"""

# String methods : return new values DN change 
a = "testing" 
a.capitalize() # first char to upper 
a.casefold() # string into lower 
a.center() # return centered string 
a.count("e") # return # times a specified value occurs in a string  
a.encode() # encoded version of the string 
a.endswith("k") # true if string ends with specified values
a.expandtabs(2) # tab size of the str:ing 
a.find("a") # position of where it was found 
a.foramt(1) # specified values in a string 
a.format_map(1) # specified values in a string 
a.index("b") # position 
a.isalnum() # true if all chars in string are alphanumeric
a.isalpha() # true if all chars in the string are alphabet
a.isascii() # true if all chars are ascii
a.isdecimal() # true if all chars are decimals
a.isdigit() # true if all chars are digits
a.isidentifier() # true if string = identifier 
a.islower() # true if all chars = lower case 
a.isnumeric() # true all chars = numeric 
a.isprintable() # true all chars = printable 
a.isspace() # true all chars = whitespaces 
a.istitlte() # true if string follows the rules of a title 
a.isupper() # true if chars all capitalize
a.join(b) # join the iterable to the end of the string 
a.ljust() # left justified 
a.lower() # lower case 
a.lstrip() # left trim version of the string 
a.maketrans() # transaltion table to be used in translations 
a.partition() # returns a tuple into 3 parts 
a.replace() # replace specific values to specified 
a.rfind() # search specified value & returns the last position of found 
a.rindex()
a.rjust() # right justified
a.rpartition() # tuple into 3 parts 
a.rsplit() # split at the specified separator, return list 
a.strip() # right trim version of the string 
a.split() # 
a.startswith() # true if starts with the value
a.swapcase() # lower <-> up 
a.title() # first chart of each word = upper 
a.translate() # translated string 
a.upper() # string into upper case 
a.zfill() # fills string w a specified # of 0 values at the beginning 

# boolean 
print(10 > 9)













