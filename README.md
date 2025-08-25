## Java_Test

```markdown
這是一個 Java 學習專案，包含基本語法練習與套件使用示範。  
主要內容有基本的程式控制、數學工具類別、以及套件封裝與 JAR 打包。
```

## 📂 專案結構

```markdown
basic/
├── App1.java
├── Array.java
├── loop.java
├── loopstatement.java
└── switch_test.java
math/
├── geometry/
│   └── Rectangle.java
└── BasicMath.java
App.java
manifest.txt
README.md
```

---

## 🚀 執行方式

### 1. 編譯
```sh
javac App.java
````

### 2. 執行

```sh
java App
```

### 3. 打包 JAR

```sh
jar cvfm test.jar manifest.txt *.class
```

### 4. 執行 JAR

```sh
java -jar test.jar
```

---

## 📘 範例說明

* **basic/**

  * `App1.java` : 基本方法呼叫與靜態數學函式
  * `Array.java` : 使用陣列儲存學生分數並計算平均
  * `loop.java` : while 與 for 迴圈示範
  * `loopstatement.java` : while + break / continue
  * `switch_test.java` : switch 判斷運算

* **math/**

  * `BasicMath.java` : 提供數學函式 (加法、乘法、PI 常數)
  * `geometry/Rectangle.java` : 定義幾何相關常數 (黃金比例)

* **App.java**
  主程式，示範如何使用 `math.BasicMath` 與 `math.geometry.Rectangle`。

---

## 🔧 開發環境

* Java JDK 8+
* 編輯器: Visual Studio Code
<a href="https://code.visualstudio.com/" target="_blank"> <img src="https://upload.wikimedia.org/wikipedia/commons/9/9a/Visual_Studio_Code_1.35_icon.svg" alt="python" width="40" height="40"/> </a>
<a href="https://www.oracle.com/java/technologies/downloads/" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="python" width="40" height="40"/> </a>

---

## 📌 作者

版權所有 © 2021 - 2025 ∙ Red night moon Team