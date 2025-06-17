#include <stdio.h>
#include <string.h>
#include <time.h>

// Mock AI preference logic
const char* recommend_channel(int hour) {
    if (hour >= 6 && hour < 9) {
        return "News Channel";
    } else if (hour >= 9 && hour < 17) {
        return "Educational Channel";
    } else if (hour >= 17 && hour < 21) {
        return "Entertainment Channel";
    } else {
        return "Movie Channel";
    }
}

int main() {
    time_t now;
    struct tm *timeinfo;

    time(&now);
    timeinfo = localtime(&now);

    int hour = timeinfo->tm_hour;

    printf("Smart TV AI\n");
    printf("Current time: %02d:00\n", hour);
    printf("Recommended channel based on your routine: %s\n", recommend_channel(hour));

    return 0;
}

