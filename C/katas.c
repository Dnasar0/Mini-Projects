#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <stddef.h>

long long *tribonacci(const long long signature[3], size_t n) {

    long long *result = malloc(n * sizeof(long long));

    if (n == 0)
        return NULL;

    else {

        for (size_t i = 0; i < 3; ++i)
            result[i] = signature[i];
        for (size_t i = 3; i < n; ++i)
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
    }

    return result;
}

bool solution(const char *string, const char *ending) {

    int len = strlen(string) - strlen(ending);

    return len < 0 ? false : strcmp(string + len, ending) == 0;
}

size_t get_count(const char *s) {

    int count = 0;

    for (int i = 0; i < strlen(s); i++) {

        if (strchr("aeiou", s[i]) != NULL) {
            count++;
        }
    }

    return count;
}

char *series_sum(const size_t n) {

    double d = 1.00;
    double sum = 0.00;
    char * ret = malloc(3);

    for (size_t i = 0; i < n; i++) {
        sum += 1/d;
        d+=3;   
    }

    sprintf(ret, "%.2f", sum);

    return ret;
}

void twoSum(unsigned count, const int numbers[count], int target, unsigned *index1, unsigned *index2)
{
  for(*index1=0; *index1<count; ++*index1)
    for(*index2=*index1+1; *index2<count; ++*index2)
      if(numbers[*index1]+numbers[*index2] == target)
         return;
}




int main()
{
    unsigned index1, index2;
    *index1, *index2 = 0;
    twoSum([1,2,3], 4, *index1, *index2);

    return 0;
}