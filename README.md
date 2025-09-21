# 🎯 Design Patterns en Java : Singleton, Factory Method & Abstract Factory

Ce projet a pour but de présenter les **design patterns de création** les plus utilisés en Java :  
- **AbstractFactory**  
- **Adapter**  
- **Bridge**
- **Builder**  
- **Command**  
- **Decorator**
- **Factory**  
- **Itrator**
- **Observer**  
- **Prototype**  
- **Singleton**  

---

## 📌 Objectifs
- Illustrer le fonctionnement de chaque pattern avec des exemples concrets.  
- Montrer leurs différences et cas d’utilisation.  
- Servir de base pédagogique pour apprendre et réviser les design patterns en Java.  

---

## 📂 Structure du projet


```
Design Pattern
├─ AbstractFactory
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ AbstractFactory.iml
│  ├─ out
│  │  └─ production
│  │     └─ AbstractFactory
│  │        ├─ Chair.class
│  │        ├─ FurnitureFactory.class
│  │        ├─ Main.class
│  │        ├─ ModernChair.class
│  │        ├─ ModernFurnitureFactory.class
│  │        ├─ ModernSofa.class
│  │        ├─ Sofa.class
│  │        ├─ VictorianChair.class
│  │        ├─ VictorianFurnitureFactory.class
│  │        └─ VictorianSofa.class
│  └─ src
│     ├─ Chair.java
│     ├─ FurnitureFactory.java
│     ├─ Main.java
│     ├─ ModernChair.java
│     ├─ ModernFurnitureFactory.java
│     ├─ ModernSofa.java
│     ├─ Sofa.java
│     ├─ VictorianChair.java
│     ├─ VictorianFurnitureFactory.java
│     └─ VictorianSofa.java
├─ Adapter
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Adapter.iml
│  ├─ out
│  │  └─ production
│  │     └─ Adapter
│  │        ├─ FileCoverter.class
│  │        ├─ FileFormatAdatper.class
│  │        ├─ Main.class
│  │        └─ PDFConverterLib.class
│  └─ src
│     ├─ FileCoverter.java
│     ├─ FileFormatAdatper.java
│     ├─ Main.java
│     └─ PDFConverterLib.java
├─ Bridge
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Bridge.iml
│  ├─ out
│  │  └─ production
│  │     └─ Bridge
│  │        ├─ EmailSender.class
│  │        ├─ EmergencyNotification.class
│  │        ├─ InfoNotification.class
│  │        ├─ Main.class
│  │        ├─ MessageSender.class
│  │        ├─ Notification.class
│  │        └─ SMSSender.class
│  └─ src
│     ├─ EmailSender.java
│     ├─ EmergencyNotification.java
│     ├─ InfoNotification.java
│     ├─ Main.java
│     ├─ MessageSender.java
│     ├─ Notification.java
│     └─ SMSSender.java
├─ Builder
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Builder.iml
│  ├─ out
│  │  └─ production
│  │     └─ Builder
│  │        ├─ BuilderDirector.class
│  │        ├─ Burger.class
│  │        ├─ BurgerBuilder.class
│  │        ├─ CheeseBurgerBuilder.class
│  │        ├─ Main.class
│  │        └─ VeganBurgerBuilder.class
│  └─ src
│     ├─ BuilderDirector.java
│     ├─ Burger.java
│     ├─ BurgerBuilder.java
│     ├─ CheeseBurgerBuilder.java
│     ├─ Main.java
│     └─ VeganBurgerBuilder.java
├─ Command
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Command.iml
│  ├─ out
│  │  └─ production
│  │     └─ Command
│  │        ├─ Command.class
│  │        ├─ Light.class
│  │        ├─ LightOffCommand.class
│  │        ├─ LightOnCommande.class
│  │        ├─ Main.class
│  │        └─ RemoteControl.class
│  └─ src
│     ├─ Command.java
│     ├─ Light.java
│     ├─ LightOffCommand.java
│     ├─ LightOnCommande.java
│     ├─ Main.java
│     └─ RemoteControl.java
├─ Decorator
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Decorator.iml
│  ├─ out
│  │  └─ production
│  │     └─ Decorator
│  │        ├─ Decorator.class
│  │        ├─ MailNotifier.class
│  │        ├─ Main.class
│  │        ├─ NotifierDecorator.class
│  │        ├─ NotifierInterface.class
│  │        ├─ SMSNotifier.class
│  │        └─ WhatsappNotifier.class
│  └─ src
│     ├─ Decorator.java
│     ├─ MailNotifier.java
│     ├─ Main.java
│     ├─ NotifierDecorator.java
│     ├─ NotifierInterface.java
│     ├─ SMSNotifier.java
│     └─ WhatsappNotifier.java
├─ Factory
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Design Pattern.iml
│  ├─ out
│  │  └─ production
│  │     └─ Design Pattern
│  │        ├─ Air.class
│  │        ├─ AirPlane.class
│  │        ├─ Deliver.class
│  │        ├─ Logistic.class
│  │        ├─ Main.class
│  │        ├─ Road.class
│  │        ├─ Sea.class
│  │        ├─ Ship.class
│  │        └─ Truck.class
│  └─ src
│     ├─ Air.java
│     ├─ AirPlane.java
│     ├─ Deliver.java
│     ├─ Logistic.java
│     ├─ Main.java
│     ├─ Road.java
│     ├─ Sea.java
│     ├─ Ship.java
│     └─ Truck.java
├─ Iterator
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Iterator.iml
│  ├─ out
│  │  └─ production
│  │     └─ Iterator
│  │        ├─ Book.class
│  │        ├─ Collection.class
│  │        ├─ Interator.class
│  │        ├─ Library.class
│  │        ├─ LibraryIterator.class
│  │        └─ Main.class
│  └─ src
│     ├─ Book.java
│     ├─ Collection.java
│     ├─ Interator.java
│     ├─ Library.java
│     ├─ LibraryIterator.java
│     └─ Main.java
├─ Observer
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ Observer.iml
│  ├─ out
│  │  └─ production
│  │     └─ Observer
│  │        ├─ Main.class
│  │        ├─ Observer.class
│  │        ├─ Subject.class
│  │        ├─ WeatherApp.class
│  │        ├─ WeatherSubject.class
│  │        └─ WeatherWidget.class
│  └─ src
│     ├─ Main.java
│     ├─ Observer.java
│     ├─ Subject.java
│     ├─ WeatherApp.java
│     ├─ WeatherSubject.java
│     └─ WeatherWidget.java
├─ Prototype
│  ├─ .idea
│  │  ├─ misc.xml
│  │  ├─ modules.xml
│  │  └─ workspace.xml
│  ├─ out
│  │  └─ production
│  │     └─ Prototype
│  │        ├─ Cycle.class
│  │        ├─ Main.class
│  │        ├─ Prototype.class
│  │        └─ Rectangle.class
│  ├─ Prototype.iml
│  └─ src
│     ├─ Cycle.java
│     ├─ Main.java
│     ├─ Prototype.java
│     └─ Rectangle.java
├─ README.md
└─ Singleton
   ├─ .idea
   │  ├─ misc.xml
   │  ├─ modules.xml
   │  └─ workspace.xml
   ├─ out
   │  └─ production
   │     └─ Singleton
   │        ├─ DataBaseConnexionSingleton.class
   │        └─ Main.class
   ├─ Singleton.iml
   └─ src
      ├─ DataBaseConnexionSingleton.java
      └─ Main.java

```

## Executer ou Compiler les codes

1- CLoner le github

```bash
git clone https://github.com/juanprince30/learn-design-pattern-in-java
```

2-Se seplacer vers le dossier design a tester

```bash
cd Adapter
```

3-Executer le code java

```bash
javac main.java
java main
