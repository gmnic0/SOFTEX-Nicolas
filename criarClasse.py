class Bicicleta:
    def __init__(self, modelo, cor, velocidade):
        self.modelo = modelo
        self.cor = cor
        self.velocidade = velocidade


    def display(self):
        print(f'a bike {self.modelo}, {self.cor}')
        Bicicleta.vel(self)


    def vel(self):
        #self.velocidade = kmh
        if self.velocidade > 15:
            print(' é rápida')
        else:
            print(' é lenta')


Velox = Bicicleta("Caloi Velox", "Preta", ())
Vulcan = Bicicleta("Caloi Vulcan", "Azul", ())
Andes = Bicicleta("Caloi Andes","Vermelha", ())


Velox.velocidade = int(input('velocidade em km/h '))
Vulcan.velocidade = int(input('velocidade em km/h '))
Andes.velocidade = int(input('velocidade em km/h '))



Velox.display()
Vulcan.display()
Andes.display()
