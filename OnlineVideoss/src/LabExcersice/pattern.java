package LabExcersice;
public class pattern {
public static void main(String[] args) {
int num = 5;
for (int i = 0; i < 3; i++) {
if (i % 2 == 0) {
for (int j = 0; j < 4; j++) {
System.out.print(num + " ");
num += 5;
}
} else {
System.out.print(" ");
for (int j = 0; j < 3; j++) {
System.out.print(num + " ");
num += 5;
}
}
System.out.println();
}
}
}