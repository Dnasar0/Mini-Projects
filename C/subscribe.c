#include <stdio.h>

int main() {

    int radius; // The distance from outside to center of the circle

    printf("Please enter a radius: ");

    scanf("%i", &radius);   // address-of operator, input

    double area = 3.14159 * (radius * radius);

    printf("The area of a circle with a %i radius is %f", radius, area);

    return 0;
}