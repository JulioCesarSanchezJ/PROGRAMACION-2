class A:
    def __init__(self, x: int, z: int):
        self.x = x
        self.z = z
    def incrementaZ(self):
        self.z += 1
    def __str__(self):
        return f"A(x={self.x}, z={self.z})"
class B:
    def __init__(self, y: int, z: int):
        self.y = y
        self.z = z
    def incrementaZ(self):
        self.z += 1
    def __str__(self):
        return f"B(y={self.y}, z={self.z})"
class D(A, B):
    def __init__(self, x: int, y: int, z: int):
        A.__init__(self, x, z)
        B.__init__(self, y, z)
    def incrementaXYZ(self):
        self.incrementaZ() 
        self.incrementaZ() 
        self.x += 1
        self.y += 1
    def __str__(self):
        return f"D(x = {self.x}    y = {self.y}    z = {self.z})"

d = D(x=2, y=2, z=2)
print(d)
d.incrementaXYZ()
print(d)
