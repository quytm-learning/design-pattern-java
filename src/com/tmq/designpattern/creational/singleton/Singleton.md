# Singleton Pattern

## Khái niệm

Là pattern giúp ta khởi tạo 1 instance duy nhất của 1 class tồn tại trong JVM.

## Mục đích

Singleton pattern được tạo ra nhằm mục đích cho việc logging, drivers object,
caching và thread pool.

```
Singleton pattern is used for logging, drivers objects, caching and thread pool.
Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade etc. Singleton design pattern is used in core java classes also, for example java.lang.Runtime, java.awt.Desktop.
```

## Thực hiện

Để sử dụng Singleton pattern ta có các bước tiếp cận chung:
- Private constructor
- Private static variable cho instance duy nhất của class
- Public static method dùng để get instance trên

## Implements

Có nhiều implements cho Single pattern:

### Eager initialization

Đây là cách đơn giản nhất để tạo một singleton, trong đó, instance được khởi
tạo ngay khi class được load, tuy nhiên thì có thể instance có thể không được
sử dụng ngay gây tốn tài nguyên hệ thống.

Nếu singleton không tốn quá nhiều tài nguyên thì đây là 1 lựa chọn không tồi,
tuy nhiên trong phần lớn trường hợp nên tránh việc khởi tạo instance cho đến
khi getInstance() được gọi

### Static block initialization

Cách này sử dụng static block, tương tự Eager initialization

```
    static {
        // initialization instance
    }
```
hoặc:
```
    static {
        try {
            // initialization instance
        } catch(Exception e) {
            // ...
        }
    }
```

### Lazy initialize

Một cách tối cải thiện vấn đề của 2 loại trên đó là sử dụng Lazy, trong
đó, ta chỉ khởi tạo khi method getInstance() được gọi đến.

Tuy nhiên, không phải lúc nào cách khởi tạo này cũng đúng, khi sử dụng
đối với multi-thread, trong trường hợp xấu, có thể có nhiều hơn 1 instance
được tạo ra bởi các thread chạy song song.

### Thread Safe Singleton

Như trong phần Lazy initialize đã đề cập, multi-thread có thể phá vỡ Single pattern,
vì vậy ta có thể giải quyết vấn đề này bằng cách sử dụng synchronized

```
    public static synchronized getInstance(){
        // ...
    }
```

Việc sử dụng synchronized trong nhiều thread sẽ làm giảm hiệu năng của hệ thống
cho nên, ta sử dụng `Double checked locking principle` để cải thiện điều đó:

 ```
     public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
         if(instance == null){
             synchronized (ThreadSafeSingleton.class) {
                 if(instance == null){
                     instance = new ThreadSafeSingleton();
                 }
             }
         }
         return instance;
     }
 ```

### Bill Pugh Singleton Implementation

to be continue ...