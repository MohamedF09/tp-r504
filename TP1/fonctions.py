
def puissance(a, b):
	if not type(a) is int:
		raise typeError("only integers are allowed pour a")
	if not type(b) is int:
		raise typeError("only integers are allowed pour b")
	return a ** b
 
