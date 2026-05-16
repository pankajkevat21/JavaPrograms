#include <stdio.h>
#include <pthread.h>
#include <semaphore.h>
#include <unistd.h>

#define N 5   // Number of philosophers

sem_t chopstick[N];   // semaphore for each chopstick

void* philosopher(void* num) {
    int id = *(int*)num;

    while (1) {
        printf("Philosopher %d is thinking...\n", id);
        sleep(1);

        // pick left chopstick
        sem_wait(&chopstick[id]);

        // pick right chopstick
        sem_wait(&chopstick[(id + 1) % N]);

        printf("Philosopher %d is eating...\n", id);
        sleep(2);

        // put down left chopstick
        sem_post(&chopstick[id]);

        // put down right chopstick
        sem_post(&chopstick[(id + 1) % N]);

        printf("Philosopher %d finished eating and put down chopsticks\n", id);
    }
}

int main() {
    pthread_t thread[N];
    int id[N];

    // initialize semaphores
    for (int i = 0; i < N; i++) {
        sem_init(&chopstick[i], 0, 1);
    }

    // create philosopher threads
    for (int i = 0; i < N; i++) {
        id[i] = i;
        pthread_create(&thread[i], NULL, philosopher, &id[i]);
    }

    // join threads
    for (int i = 0; i < N; i++) {
        pthread_join(thread[i], NULL);
    }

    return 0;
}