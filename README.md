> 1. 防止死锁的唯一方法就是在构造程序时避免出现不一致的锁顺序。<br>
> 2. 锁分段技术。<br>
> 3. 锁的粒度。<br>
> 4. 连锁式加锁（Hand-Over-Hand Locking）<br>
> 5. 锁耦合（Lock Coupling）<br>
> 6. 仅当内置锁不能满足需求时，才可以考虑使用ReentranLock。<br>
> 7. ReentranLock使用场景：
> - 可定时的、可轮询的与可中断的锁获取操作。
> - 公平队列，以及非块结构的锁。
