def puissance(a, b):
    if type(a) is not int:
        raise TypeError("Only integers are allowed")

    if type(b) is not int:
        raise TypeError("Only integers are allowed")

    if a == 0 and b < 0:
        raise Exception("0 cannot be raised to a negative power")

    return a ** b

 
