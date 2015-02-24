def is_triangle(a,b,c):
	if a>=b+c or b>=a+b or c>=a+b:
        print 'No'
    else:
        print 'Yes'

a=input('Length of first stick: ')
b=input('Length of second stick: ')
c=input('Length of third stick: ')
is_triangle(a,b,c)