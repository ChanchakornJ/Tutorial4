Chanchakorn Jullapech 672115007

#How to compile and run the program
Java Development Kit is required
The array capacity is fixed to 5
User have to input name and enter after each name to enqueue the name that user have input into the queue, type 'quit' to exit
The program will automatically dequeue one element after user type quit

#Example output
Input: 
Xielian
Huacheng
Shoto
quit

Output:
Enqueue Xielian
[Xielian,null,null,null,null] [first = 0, rear = 1, length = 1]
Huacheng
Enqueue Huacheng
[Xielian,Huacheng,null,null,null] [first = 0, rear = 2, length = 2]
Shoto
Enqueue Shoto
[Xielian,Huacheng,Shoto,null,null] [first = 0, rear = 3, length = 3]
quit
Dequeue Xielian
[Huacheng,Shoto,null,null,null] [first = 1, rear = 3, length = 2]
