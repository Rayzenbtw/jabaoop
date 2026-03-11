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
│               └── practice8/
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

- **Practice 1** - Робота з точками та колами (Point, Circle)
- **Practice 2** - [Додайте опис]
- **Practice 3** - [Додайте опис]
- **Practice 4** - [Додайте опис]
- **Practice 5** - [Додайте опис]
- **Practice 6** - [Додайте опис]
- **Practice 7** - [Додайте опис]
- **Practice *8* - [Додайте опис]

## ⚙️ Вимоги

- Java 11 або вище
- IntelliJ IDEA / Eclipse / VS Code (з розширенням Java)
- Maven (опціонально)

## 💡 Порада

Кожна практика знаходиться в окремому пакеті (`prac.practice1`, `prac.practice2`, і т.д.), тому ви можете працювати з ними незалежно один від одного.
