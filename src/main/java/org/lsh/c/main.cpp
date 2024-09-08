#include "main.h"

JNIEXPORT jint JNICALL Java_org_lsh_Main_sum(JNIEnv *, jclass, jint a, jint b) {
    return a + b;
}
//gcc main.cpp -I E:\Java\jdk-17\include -I E:\Java\jdk-17\include\win32 -fPIC -shared -o test.dll -lstdc++