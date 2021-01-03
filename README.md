# Practice
sorting of numbers in increasing order:
Scanner sc  = new Scanner (System.in);
int n = sc.nextInt();
int[] a = new int[n];
for (int i=0;i<a.length;i++){
a[i] = sc.nextInt();
}
for (int i = 0;i<a.length;i++){
int noofSwaps= 0;
for (int j =0;j<a.length-1;j++){
if (a[j]>a[j+1]){
int temp = a[j];
a[j]=a[j+1];
a[j+1] = temp;
noofSwaps++;
}
}
if(noofSwaps==0){
break;
}
}
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
}
}
