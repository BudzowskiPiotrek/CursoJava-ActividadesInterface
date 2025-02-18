# CursoJava-ActividadesInterface

Ejercicio 1:
• Crea un sistema de pago que soporte múltiples métodos de pago,
como tarjeta de crédito y PayPal. Cada método de pago debe
implementar una interfaz Pago que tenga un método
procesarPago(double cantidad). La interfaz también debe tener un
método predeterminado cancelarPago() que imprima un mensaje
predeterminado.

Ejercicio 2:
• Desarrolla un sistema para gestionar diferentes tipos de vehículos,
como coches y bicicletas. Cada vehículo debe implementar una interfaz
Vehiculo con métodos arrancar() y detener(). La interfaz debe tener
una constante VELOCIDAD_MAXIMA.

Ejercicio 3:
• Desarrolla un sistema para gestionar empleados en una empresa. Crea
una interfaz Empleado con métodos trabajar() y descansar(). Implementa
esta interfaz en una clase abstracta EmpleadoBase que contiene atributos
y métodos comunes a todos los empleados. A partir de EmpleadoBase,
crea las clases Desarrollador y Disenador, cada una con su propia
implementación de los métodos. Además, implementa métodos
específicos para cada tipo de empleado, como escribirCodigo() para
Desarrollador y crearDiseno() para Disenador. Los empleados también
deben tener un método calcularSalario() que calcule su salario basado en
sus horas trabajadas y su tarifa por hora.
