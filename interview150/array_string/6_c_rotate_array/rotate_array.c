// 111125
/*
   Given task asked to limit the usage of memory space to O(1)
   */

#include <stdio.h>

void display (int *nums, int numsSize){
    for (int q = 0; q < numsSize ; q ++){
        printf("%d ",nums[q]);
    }
    printf("\n");
}

/*
// 1) for loop x while loop [O [k * size]]
void rotate (int * nums, int numsSize, int k){
int size, temp;
for (int i = 0 ; i < k ; i++ ){
size = numsSize-2;
temp = nums [numsSize-1];
while (size >= 0 ){
nums [size+1] = nums[size];
size --;
}
nums[0] = temp;
display(nums, numsSize);
}
}
*/

// 2) less running time [O[numsSize + k]]
// 0ms runtime / 26.52 mb
void rotate (int * nums, int numsSize, int k){
    int z = 0;
    if (k <=0){
        return;
    }
    if (k > numsSize){
        z = k - numsSize;
        k = numsSize;
    }
    int temps [k];
    // Saving to temp [k]
    for (int i = 0 ; i < k ; i ++){
        temps [i] = nums [numsSize - 1 - i];
    }
    display(temps, k);

    // Pushing and making room at the front
    for (int q = 0; q < numsSize - k ; q ++){
        nums [numsSize-1-q] = nums [numsSize-1-k-q];
    }

    // Storing temp [k] at the front
    for (int z = 0; z < k; z ++){
        nums[z] = temps [k-1-z];
    }
    display(nums, numsSize);

    // Recurse it for the rest of k
    if (z > -2){
        rotate(nums, numsSize,z);
    }
}

// 3) Best Solution - 26.4 mb
/*
void rotate(int* nums, int n, int k) {
    k = k % n;
    if (k == 0) return;
    int i = 0, j = n - 1;
    while (i < j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
    i = 0;
    j = k - 1;
    while (i < j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
    i = k;
    j = n - 1;
    while (i < j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i++;
        j--;
    }
}
*/


int main(){
    int nums[] =  {1,2,3,4,5,6,7};
    int numsSize = sizeof(nums) / sizeof(nums[0]);
    int nums2[] = {-1, -100, 3, 99};
    int numsSize2 = sizeof(nums2) / sizeof(nums2[0]);
    int nums3[] = {1}; // k > numsSize
    int nums4[]= {1,2};
    rotate (nums, numsSize, 3);
    printf("\n");
    rotate (nums2, numsSize2, 2);
    printf("\n");
    rotate (nums3, 1, 0);
    rotate (nums3, 1, 2);
    printf("\n");
    rotate (nums4,2,7);
}
