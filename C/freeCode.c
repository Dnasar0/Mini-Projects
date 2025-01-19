#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Student
{
    char name[20];
    char major[10];
    int age;
    double gpa;
};



int main() { 


    char line[255];
    FILE * fpointer = fopen("employees.txt", "r");

    fgets(line, 255, fpointer);         // Move o apontador, próxima linha
    fgets(line, 255, fpointer);         // Move o apontador, próxima linha


    printf("%s",line);
    
    fclose(fpointer);
    return 0;
}