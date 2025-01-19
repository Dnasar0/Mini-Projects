#include <stdio.h>

int main() {

    char name[31];                  // precisa de + 1 length, null terminator

    printf("Enter your name: ");
    scanf("%s", name);              // & não é preciso quando falamos de VETORES
    printf("Hello %s!\nYou're awesome.\n", name);    // %s string - sequência de caracteres
    return 0;
}
