# ObserverDemo
---
Observer观察者模式在Android中的应用

 1. Observable：
 被观察者接口，被观察者需要实现此接口，在需要发出通知的地方，调用以下两个方法
 
`setChanged()`
`notifyObservers("改变了名字")`
