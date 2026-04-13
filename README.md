[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/xSCTq0N9)
Documento con los requisitos funcionales para crear la clase vehículo.
Requisitos podrán evolucionar a medida que avancemos con Test Driven Development (TDD).

Atributos del Vehiculo:
- marca (String)
- modelo (String)
- velocidadActual (int)
- velocidadMaxima (int)

 Reglas sobre los atributos:
- velocidadActual no puede ser negativa.
- velocidadActual no puede superar velocidadMaxima.
- velocidadMaxima debe ser mayor que 0.
- La marca y el modelo se establecen en el constructor.


Métodos principales:

- acelerar(int incremento)
- frenar(int decremento)
