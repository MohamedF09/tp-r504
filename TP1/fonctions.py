def puissance(a, b):
    if type(a) is not int:
        raise TypeError("Only integers are allowed")

    if type(b) is not int:
        raise TypeError("Only integers are allowed")

    if a == 0 and b < 0:
        raise Exception("0 cannot be raised to a negative power")


    if a == 0 and b == 0:
        raise Exception("0 ** 0 is undefined")

    resultat = 1

    if b >= 0:
        for i in range(b):
            resultat = resultat * a
    else:
        for i in range(-b):
            resultat = resultat * a
        resultat = 1 / resultat

    return resultat

