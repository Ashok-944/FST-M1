class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")

car1 = Car("Hyundai", "Elantra", 2021, "Automatic", "Blue")
car2 = Car("BMW", "X5", 2023, "Automatic", "Gray")
car3 = Car("Mercedes", "E-Class", 2022, "Manual", "Silver")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
