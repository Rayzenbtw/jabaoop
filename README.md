# Java OOP - Практичні роботи

Цей репозиторій містить практичні роботи з об'єктно-орієнтованого програмування на Java.

## 📁 Структура проекту

```
jabaoop/
├── src/
│   └── main/
│       └── java/
│           └── prac/
│               ├── practice1/
│               ├── practice2/
│               ├── practice3/
│               ├── practice4/
│               ├── practice5/
│               ├── practice6/
│               ├── practice7/
│               ├── practice8/
│               └── practice9/
│           └── indiv/
│               ├── indiv1/
│               ├── indiv2/
│               ├── indiv3/
│               └── indiv4/
└── pom.xml
```

## 🚀 Як відкрити потрібну практику

### Варіант 1: IntelliJ IDEA (рекомендовано)

1. **Відкрити проект:**
   - Запустіть IntelliJ IDEA
   - File → Open → Виберіть папку `jabaoop`
   - Натисніть OK

2. **Знайти потрібну практику:**
   - У лівій панелі Project розкрийте: `src/main/java/prac/`
   - Виберіть папку з потрібною практикою (наприклад, `practice1`, `practice2`, і т.д.)

3. **Запустити Main файл:**
   - Відкрийте файл `Main.java` у потрібній практиці
   - Клацніть правою кнопкою миші на файл → Run 'Main.main()'
   - Або натисніть зелений трикутник біля `public static void main`

### Варіант 2: Швидкий перехід (IntelliJ IDEA)

1. Натисніть `Ctrl + N` (Windows/Linux) або `Cmd + O` (Mac)
2. Введіть назву класу, наприклад: `practice1.Main`
3. Виберіть потрібний файл зі списку
4. Натисніть `Ctrl + Shift + F10` для запуску

### Варіант 3: Через термінал

1. **Перейдіть в кореневу директорію проекту:**
   ```bash
   cd jabaoop
   ```

2. **Скомпілюйте та запустіть потрібну практику:**
   ```bash
   # Для practice1
   javac -d target/classes src/main/java/prac/practice1/*.java
   java -cp target/classes prac.practice1.Main
   
   # Для practice2
   javac -d target/classes src/main/java/prac/practice2/*.java
   java -cp target/classes prac.practice2.Main
   ```

### Варіант 4: Через Maven

```bash
# У кореневій директорії проекту
mvn compile
mvn exec:java -Dexec.mainClass="prac.practice1.Main"
```

Замініть `practice1` на номер потрібної практики.

## 📝 Доступні практики

- **Practice 1** — Робота з точками та колами (Point, Circle)
- **Practice 2** — Вектори в *n*-вимірному просторі: конструктори (за розміром/масивом/копіювання), get/set з перевірками, обчислення довжини (нормы) та вивід.
- **Practice 3** — Модель банківського рахунку (*BankAccount*): депозит/зняття з комісією, статичні поля (загальний баланс, резерв банку, процентна ставка) та нарахування відсотків.
- **Practice 4** — Наслідування та приведення типів: `Point` → `Pixel` (колір), перевизначення `toString()`, робота з `instanceof` (pattern matching) та поліморфізм.
- **Practice 5** — Абстрактні класи та поліморфізм: `Figure` (area/perimeter) і реалізації `Rectangle`, `Circle`, `Triangle`; демонстрація масиву фігур + додатковий метод `diagonal()` для прямокутника.
- **Practice 6** — Внутрішні/локальні/анонімні класи: власний інтерфейс `Iterator<T>` і різні реалізації ітератора для вектора (`inner`, `anonymous`, `local`).
- **Practice 7** — Reflection API: отримання `Class` різними способами, перегляд модифікаторів/конструкторів/полів/методів та виклик методу через `invoke()` (на прикладі `String.substring`).
- **Practice 8** — Колекції `ArrayList` та `TreeSet` для точок: `equals()`, `Comparator` (сортування по x/y), видалення через `Iterator`, сортування `Collections.sort`, пошук `Collections.binarySearch`.
- **Practice 9** — *(не знайдено в репозиторії / немає файлів у `src/main/java/prac/practice9`)*

## 📝 Доступні індивідуальні

- **Individual 1** — *(не знайдено в репозиторії / немає `src/main/java/individual/indiv1`)*
- **Individual 2** — Консольний застосунок “BikeShop”: абстрактний `Bicycle` + спадкоємці (`MountainBike`, `ElectricBike`), меню в консолі, збереження/завантаження колекції через Java Serialization.
- **Individual 3** — Планувальник подій: `Event` + час `EventTime` (Comparable), зберігання в `TreeMap`, читання/запис у файл (репозиторій `EventFileRepository`) у форматі `yyyy-MM-dd HH:mm|title|location`.
- **Individual 4** — Модель готелю з багатопоточністю: заявки на заселення `Booking` (Runnable/Thread), синхронізація `synchronized` + `wait/notify`, імітація асинхронного надходження заявок через `ScheduledExecutorService`, пошук гостя за прізвищем.

## ⚙️ Вимоги

- Java 11 або вище
- IntelliJ IDEA / Eclipse / VS Code (з розширенням Java)
- Maven (опціонально)

## 💡 Порада

Кожна практика знаходиться в окремому пакеті (`prac.practice1`, `prac.practice2`, і т.д.), тому ви можете працювати з ними незалежно один від одного.
