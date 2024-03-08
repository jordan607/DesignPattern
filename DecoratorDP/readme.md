Decorator design pattern :
When we have a case where we have multiple case 
& we want to combine them inany number and order
in an efficient way
Eg.

Email | SMS | Push notification

Email | SMS <br>
SMS | Email <br>
SMS | Push N <br>
Email | Push <br>
.... <br>
... <br>

any combination

This is one of the example how it is implemented in java :
```
BufferedReader in  =  new BufferedReader( new InputStreamReader( new FileInputStream("")));
```
Here Reader Class is implemented by all of the above.