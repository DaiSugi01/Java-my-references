# [Threads](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html)

## Thread's States
- New
    The state witch is created.  
- Runnable  
    Thread is running.  
- Suspended  
    A running thread can be suspended, which temporarily suspends its activity.  
    A suspended thread can then be resumed.  
- Blocked  
    Thread which is blocked when waiting for a resource.  
    It's waiting for another thread to finish.
- Terminated  
    A thread can be terminated, which halts its execution immediately at any given time.  
    Once a thread is terminated, it cannot be resumed. 

## There is no guarantees about scheduling.  
The Thread Scheduler makes all the decisions about which thread runs, how long it is.  
You cannot control the scheduler.

## How to launch a new thread
1. Make a Runnable object which is the thread's job.
2. Make a Thread object, which is the worker, and give it a Runnable object.
3. Start the Thread.
