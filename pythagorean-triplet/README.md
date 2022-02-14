# Pythagorean Triplet

## Instructions

A Pythagorean triplet is a set of three natural numbers, {a, b, c}, for
which,

```text
a**2 + b**2 = c**2
```

and such that,

```text
a < b < c
```

For example,

```text
3**2 + 4**2 = 9 + 16 = 25 = 5**2.
```

Given an input integer N, find all Pythagorean triplets for which `a + b + c = N`.

For example, with N = 1000, there is exactly one Pythagorean triplet for which `a + b + c = 1000`: `{200, 375, 425}`.

## Source

### Assertion Error - Solved

    @Override
    public boolean equals(Object b){
        // id both the objects are null
        if(this == b){
            return true;
        }
        else if(b instanceof PythagoreanTriplet){
            PythagoreanTriplet toCompare = (PythagoreanTriplet)b;
            if(this.a == toCompare.a && this.b == toCompare.b && this.c == toCompare.c){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

###  Reason for Overriding

By defaults `equals` method works for strings only, so we should overide for pythagoreantriplet.

Flow : `assertEquals()` -> `equalsRegardingNull()` -> `IsEquals()` -> `expected.equals(actual)`.


