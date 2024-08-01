![image](https://github.com/user-attachments/assets/db081045-b6e9-4f2b-8ae8-c70f769c5d5a)

![Captura de pantalla 2024-07-30 201356](https://github.com/user-attachments/assets/47fc29c3-7601-4b59-8553-3279cac4323f)
La imagen demuestra el resultado de las pruebas Benchmark, que compara los rendimientos en la ejecución de la misma tarea utilizando Stream y parallelStream.
Se observa que sequentialStream es más rápido que el parallelStream, lo que puede ser sorprendente, ya que se esperaría que el procesamiento en paralelo fuera más eficiente. Esto puede deberse a la sobrecarga de gestionar múltiples hilos en parallelStream.
