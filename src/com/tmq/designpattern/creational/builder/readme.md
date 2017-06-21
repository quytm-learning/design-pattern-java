# Builder Design Pattern

Builder sinh ra để giải quyết vấn đề của Factory và Abstract Factory,
được sử dụng trong các trường hợp:

- Có quá nhiều tham số truyền vào, có thể gây nhầm lẫn thứ tự các tham số đó
- Có một số properties chỉ là optional, và không cần thiết phải đưa vào
constructor (giống Factory)

Builder giải quyết vấn đề này bằng cách đưa các properties require vào trong
constructor, các trường optional được gán step-by-step cho tới khi đạt
được một object cuối cùng (final).

