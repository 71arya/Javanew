class Shape:
    def draw(self):
        print("Drawing Shape")

    def erase(self):
        print("Erasing Shape")


class Circle(Shape):
    def draw(self):
        print("Drawing Circle")

    def erase(self):
        print("Erasing Circle")


class Triangle(Shape):
    def draw(self):
        print("Drawing Triangle")

    def erase(self):
        print("Erasing Triangle")


class Square(Shape):
    def draw(self):
        print("Drawing Square")

    def erase(self):
        print("Erasing Square")

circle = Circle()
triangle = Triangle()
square = Square()

shape_reference = circle
shape_reference.draw()
shape_reference.erase()

shape_reference = triangle
shape_reference.draw()
shape_reference.erase()

shape_reference = square
shape_reference.draw()
shape_reference.erase()
