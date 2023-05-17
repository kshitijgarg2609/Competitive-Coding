#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int lexicographic_sort(const char* a, const char* b) {
    return strcmp(a,b);
}

int lexicographic_sort_reverse(const char* a, const char* b) {
    return strcmp(b,a);
}

int sort_by_number_of_distinct_characters(const char* a, const char* b) {
    int da[26]={0};
    int db[26]={0};
    for(int i=0;i<strlen(a);i++) {
        da[a[i]-'a']++;
    }
    for(int j=0;j<strlen(b);j++) {
        db[b[j]-'a']++;
    }
    int m=0;
    int n=0;
    for(int k=0;k<26;k++) {
        m+=da[k]!=0;
        n+=db[k]!=0;
    }
    if(m==n) {
        return strcmp(a,b);
    }
    return m-n;
}

int sort_by_length(const char* a, const char* b) {
    if(strlen(a)==strlen(b)) {
        return strcmp(a,b);
    }
    return strlen(a)-strlen(b);
}

void string_sort(char** arr,const int len,int (*cmp_func)(const char* a, const char* b)){
    if(len==1) {
        return;
    }
    int len_a=len/2;
    int len_b=len-len_a;
    string_sort(arr,len_a,cmp_func);
    string_sort(arr+len_a,len_b,cmp_func);
    char** tmp = (char**)calloc(len,sizeof(char*));
    int i=0,j=len_a,k=0;
    while(i<len_a && j<len) {
        if(cmp_func(arr[i],arr[j])<=0) {
            tmp[k++]=arr[i++];
        }
        else {
            tmp[k++]=arr[j++];
        }
    }
    while(i<len_a) {
        tmp[k++]=arr[i++];
    }
    for(int x=0;x<k;x++) {
        arr[x]=tmp[x];
    }
    free(tmp);
}


int main() 
{
    int n;
    scanf("%d", &n);
  
    char** arr;
	arr = (char**)malloc(n * sizeof(char*));
  
    for(int i = 0; i < n; i++){
        *(arr + i) = malloc(1024 * sizeof(char));
        scanf("%s", *(arr + i));
        *(arr + i) = realloc(*(arr + i), strlen(*(arr + i)) + 1);
    }
  
    string_sort(arr, n, lexicographic_sort);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);
    printf("\n");

    string_sort(arr, n, lexicographic_sort_reverse);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");

    string_sort(arr, n, sort_by_length);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]);    
    printf("\n");

    string_sort(arr, n, sort_by_number_of_distinct_characters);
    for(int i = 0; i < n; i++)
        printf("%s\n", arr[i]); 
    printf("\n");
}
