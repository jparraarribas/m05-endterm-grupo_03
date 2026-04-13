[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/xSCTq0N9)


Documento con los requisitos funcionales acordados por el equipo para la creación de la clase `Vehiculo`.  
Estos requisitos podrán evolucionar a medida que avancemos con **Test Driven Development (TDD)**.

---

## 🧩 Atributos del Vehículo

El vehículo contará con los siguientes atributos:

- **marca** (`String`)  
- **modelo** (`String`)  
- **velocidadActual** (`int`)  
- **velocidadMaxima** (`int`)  
- **encendido** (`boolean`) — indica si el vehículo está arrancado  

### 🔒 Reglas sobre los atributos

- `velocidadActual` **no puede ser negativa**.  
- `velocidadActual` **no puede superar** `velocidadMaxima`.  
- `velocidadMaxima` debe ser **mayor que 0**.  
- La **marca** y el **modelo** se establecen en el constructor.  
- Si se reduce `velocidadMaxima` por debajo de `velocidadActual`, esta se ajustará automáticamente.  

---

## ⚙️ Métodos principales

### 🚀 **acelerar(int incremento)**
- Incrementa la velocidad actual en la cantidad indicada.  
- Si al acelerar se supera `velocidadMaxima`, la velocidad se ajusta a ese valor.  
- Si el incremento es negativo, **no se realiza ninguna acción** (caso inválido).  

---

### 🛑 **frenar(int decremento)**
- Reduce la velocidad actual en la cantidad indicada.  
- La velocidad nunca puede quedar por debajo de 0.  
- Si el decremento es negativo, **no se realiza ninguna acción** (caso inválido).  

---

### 🔑 **arrancar()**
- Cambia el estado del vehículo a **encendido = true**.  
- No modifica la velocidad.  
- Si el vehículo ya está encendido, no realiza ninguna acción.  

---

### ⚙️ **detener()**
- Pone la velocidad actual a **0**.  
- No apaga el vehículo, solo detiene el movimiento.  

---

## 📚 Métodos adicionales

- `getMarca()`  
- `getModelo()`  
- `getVelocidadActual()`  
- `getVelocidadMaxima()`  
- `isEncendido()`  
- `setVelocidadMaxima(int nuevaVelocidadMaxima)`  

