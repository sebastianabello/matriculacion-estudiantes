# Matriculación

![Descripción de la imagen](./src/main/assets/matricula.png)

- Se simula el proceso de matriculación de un estudiante en una universidad.
- Información personal del estudiante.
- Información de la carrera.
- Información de la asignatura.
- Información de calificaión.
- Informacion expediente académico.

## paso por parametro y referencia
Dependiendo del tipo de dato que enviemos a la función, podemos diferenciar dos comportamientos:

Paso por valor: Se crea una copia local de la variable dentro de la función.
Paso por referencia: Se maneja directamente la variable, los cambios realizados dentro de la función le afectarán también fuera.


## Ejemplo por valor:
def doblar_valor(numero):
    numero *= 2

n = 10
doblar_valor(n)
print(n)
## Ejemplo por referencia:
def doblar_valores(numeros):
    for i,n in enumerate(numeros):
        numeros[i] *= 2

ns = [10,50,100]
doblar_valores(ns)
print(ns)
