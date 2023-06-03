#include<bits/stdc++.h>

using namespace std;

typedef struct Workshop {
    int start_time,duration,end_time;
    bool operator<(const Workshop w) {
        return this->end_time<w.end_time;
    }
} Workshop;

typedef struct Available_Workshops {
    int n;
    Workshop *arr;
} Available_Workshops;

Available_Workshops* initialize (int start_time[], int duration[], int n) {
    Available_Workshops *aw = (Available_Workshops*)malloc(sizeof(Available_Workshops));
    aw->n=n;
    aw->arr = new Workshop[n];
    for(int i=0;i<n;i++) {
        aw->arr[i].start_time=start_time[i];
        aw->arr[i].duration=duration[i];
        aw->arr[i].end_time=start_time[i]+duration[i];
    }
    return aw;
}

int CalculateMaxWorkshops(Available_Workshops* ptr) {
    sort(ptr->arr,ptr->arr+(ptr->n));
    int max=1;
    Workshop w=ptr->arr[0];
    for(int i=1;i<ptr->n;i++) {
        if(w.end_time<=ptr->arr[i].start_time) {
            w=ptr->arr[i];
            max++;
        }
    } 
    return max;
}

int main(int argc, char *argv[]) {
    int n; // number of workshops
    cin >> n;
    // create arrays of unknown size n
    int* start_time = new int[n];
    int* duration = new int[n];

    for(int i=0; i < n; i++){
        cin >> start_time[i];
    }
    for(int i = 0; i < n; i++){
        cin >> duration[i];
    }

    Available_Workshops * ptr;
    ptr = initialize(start_time,duration, n);
    cout << CalculateMaxWorkshops(ptr) << endl;
    return 0;
}
