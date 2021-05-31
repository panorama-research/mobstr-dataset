synthetic: main.o tasks.o runnables.o    labels.o ticksUtils.o
	gcc -o synthetic main.o tasks.o runnables.o  labels.o ticksUtils.o   -pthread

main.o: Executable/main/_src/main.c
	gcc -c -Isynthetic_gen/labels/_inc -Isynthetic_gen/ticksUtils/_inc  -Isynthetic_gen/tasks/_inc -Isynthetic_gen/runnables/_inc -Isynthetic_gen  Executable/main/_src/main.c

tasks.o: synthetic_gen/tasks/_src/tasks.c
	gcc -c -Isynthetic_gen/labels/_inc -Isynthetic_gen/ticksUtils/_inc  -Isynthetic_gen/tasks/_inc -Isynthetic_gen/runnables/_inc  synthetic_gen/tasks/_src/tasks.c
	
runnables.o: synthetic_gen/runnables/_src/runnables.c
	gcc -c -Isynthetic_gen/labels/_inc -Isynthetic_gen/ticksUtils/_inc  -Isynthetic_gen/runnables/_inc   synthetic_gen/runnables/_src/runnables.c -O2


labels.o: synthetic_gen/labels/_src/labels.c
	gcc -c -Isynthetic_gen/labels/_inc  synthetic_gen/labels/_src/labels.c -O2

ticksUtils.o: synthetic_gen/ticksUtils/_src/ticksUtils.c
	gcc -c -Isynthetic_gen/ticksUtils/_inc synthetic_gen/ticksUtils/_src/ticksUtils.c -O2


