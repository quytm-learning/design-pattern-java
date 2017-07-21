# Visitor Design Pattern

Visitor cho phép định nghĩa các thao tác (operators) trên một tập các đối
tượng (objects) không đồng nhất về kiểu mà không làm thay đổi định nghĩa
class. trong mẩu thiết kế visitor ta định nghĩa các thao tác trên các lớp
tách biệt gọi các lớp visitors, các lớp này cho phép tách rời các thao tác
với các đối tượng mà nó tác động đến. Với mỗi thao tác được thêm vào, một
lớp visitor tương ứng được tạo ra.

## Bài toán đặt ra

Một người đi mua hàng(Visitor), trong giỏ của anh ta có mặt hàng Book và
thanh toán hàng.

Khi đó, ta thiết kế một class ShoppingCart, trong đó có phương thức visit()
trả về giá tiền của quyển sách.


```
class Book {

    int accept(){
        // ...
    }

}

class ShoppingCart {

    int visit(Book book) {
        // Do somethings for Book
    }

}
```

Tiếp theo, anh ta chọn thêm mặt hàng nữa là Fruit. Đến lúc này, ta thiết
kế thêm class cho Fruit. Cả hai mặt hàng cùng implement từ interface
ItemElement.

```
interface ItemElement {
    int accept();
}

class Book implements ItemElement {

    @Override
    int accept(){
        // ...
    }

}

class Fruit implements ItemElement {

    @Override
    int accept(){
        // ...
    }

}

class ShoppingCart {

    int visit(Book book) {
        // Do somethings for Book
    }

    int visit(Fruit fruit) {
        // Do somethings for Fruit
    }

}

```

Mọi thứ vẫn ổn!

Tiếp theo, khi thanh toán ta có thêm một phương thức pay():

```
int pay() {
    int cost = 0;
    for (ItemElement item : listElements) {
        if (item instance of Book) {
            cost += visit((Book) item);
        } else if (item instance of Fruit) {
            cost += visit((Fruit) item);
        }
    }
    return cost;
}
```

Đậu xanh! Việc ép kiểu này có vẻ không ổn chút nào, nhưng cũng chẳng còn
cách nào khác vì ShoppingCast chỉ xử lý method visit() riêng cho từng mặt hàng.
Để thanh toán một chuỗi các mặt hàng theo cách chỉ là giải pháp tạm thời,
mọi thứ sẽ phức tạp, rối rắm khi số loại mặt hàng tăng lên 3, 4, ...

Ok. Giờ ta sẽ tìm hiểu xem Visitor pattern giải quyết vấn đề đó như thế nào?

## Implementation

Như bài toán trên đặt ra, với cách giải quyết thông thường, việc maintain
code khá là thốn. Vấn đề chính là ở chỗ Visitor xử lý method visit() với
các implement riêng cho từng mặt hàng khác nhau.

Visitor đưa ta đi theo một hướng khác, thay vì phải tìm ra kiểu của mặt hàng
và tính giá cho nó, ta gọi mặt hàng đó ra, truyền vào visitor, tính giá rồi
trả về kết quả. Nghe có vẻ khó hiểu nhưng công nhận là khó hiểu thật,
vậy thì ta sẽ thực hành về nó thông qua việc giải quyết bài toán trên sử
dụng Visitor.


```
interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}


public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        // Do somethings for Book
    }

    @Override
    public int visit(Fruit fruit) {
        // Do somethings for Fruit
    }

}
```

ShoppingCartVisitorImpl có các method visit(...) xử lý riêng cho từng
mặt hàng được truyền vào.

```
interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}

public class Book implements ItemElement {

    // ...

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

public class Fruit implements ItemElement {

    // ...

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
```

Method accept được truyền vào parameter là ShoppingCartVisitor, nhiệm vụ của
parameter này sẽ là gọi ra hàm visit(this), tùy thuộc loại class của `this`
 mà hàm visit(Book book) hay visit(Fruit fruit) được gọi ra.

Lúc này, method pay() được cài đặt vô cùng đơn giản, ta cũng không cần
quan tâm tới Object ItemElement là class nào

```
int pay() {
    int cost = 0;
    for (ItemElement item : listElements) {
        cost += item.accept(visitor);
    }
    return cost;
}
```

nếu để ý một chút, bạn sẽ thấy `Overloading` và `Polymorphism` đã được áp dụng
một cách triệt để.

## Kết luận

Việc sử dụng Visitor giúp đơn giản hóa cách xử lý nhiều đối tượng có kiểu khác nhau,
tuy nhiên đối với số lượng 1, 2, 3 đối tượng thì cũng không nhất thiết
làm theo mẫu trên.

`visit(Book)` và `visit(Fruit)` cũng không nhất thiết phải đặt cùng tên,
ta chỉ sử dụng overloading giúp việc gọi hàm đơn giản và thống nhất hơn.