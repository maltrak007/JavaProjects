# Java Projects

Collection of **Java exercises** from my cross-platform application development studies (CEU San Pablo). They cover object-oriented fundamentals, layered architecture and file persistence.

## JavaRememberExercise

A Maven / NetBeans project that revisits core Java concepts.

| Package | What it practises |
|---|---|
| `RememberExercises.com...Exercise1–7` | Warm-up exercises on language basics |
| `RememberExercises.PruebaPersona` | Classes, encapsulation (`Persona`) |
| `RememberExercises.SistemaVentas` | Sales system modelled with `Producto` and `Orden` |
| `RememberExercises.SnackMachine` | First snack machine using `Snack` and `Snacks` |
| `FilesManagement` | Reading and writing files (`FileManagement`) |
| `Snack_Machine_Files` | Layered snack machine, described below |

### Layered Snack Machine

A clean three-layer design:

```
domain/        Snack                          – the entity
service/       ISnacksService                 – contract (add, list, retrieve snacks)
               SnacksServiceList              – in-memory implementation
               SnacksServiceFile              – persistent implementation (inventory_snacks.txt)
presentation/  SnackMachine                   – console menu
```

Swapping between the list and file services demonstrates programming to an interface.

## Running

1. Install a JDK (11+) and Maven, or open the folder in NetBeans.
2. From `JavaRememberExercise/`, build with `mvn compile`.
3. Run the desired class, for example `Snack_Machine_Files.presentation.SnackMachine`.

## Author

**Gonzalo Liñán Aldana** — [GitHub](https://github.com/maltrak007)
