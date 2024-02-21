**Task №2**

Java'da, deadlock, resource'dan noto'g'ri tartibda foydalanilgan holatda yuzaga keladi. Misol uchun, agar ikkita thread biror bir resource'ni bloklaydi va har ikkasi ham boshqa thread bloklagan resource'ga kirishi kerak bo'ladi, ammo bloklangan bloklangan boladi. Bu holatda deadlock yuzaga keladi. Java'da deadlock'ni bartaraf etish uchun quyidagi usullardan foydalaning mumkin:

1. **Resource'lar bilan to'g'ri tartibda ishlatish**: Ikkala thread'ning resource'lar bilan to'g'ri tartibda ishlashini ta'minlash. Bu, deadlock'ni oldini olish uchun eng sodda usullaridan biri hisoblanadi.

2. **`synchronized` kalit so'zidan foydalanish**: `synchronized` kalit so'zi bilan yozilgan resource'lar bilan ishlash, shu kalit so'z bilan yozilgan method'lardan foydalanish, shu kalit so'z bilan yozilgan block'lardan foydalanish.

3. **`Lock` classidan foydalanish**: `Lock` class'i obyektlari yordamida, deadlock'dan qutulishimiz mumkin. Bunda biz biror bir thread resource bilan ishlayotganda, resource'ni  bloklab qoyish talab qilinadi. Va qachonki thread ishini yakunlagandan so'ng, resource unlock qilinadi.


**Task №5**

(0[1-9]|[1-2][0-9]|3[01])-(0[1-9]|1[012])-([1-9][0-9][0-9][0-9])
