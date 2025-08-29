# 🎯 Design Patterns en Java : Singleton, Factory Method & Abstract Factory

Ce projet a pour but de présenter les **design patterns de création** les plus utilisés en Java :  
- **Singleton**  
- **Factory Method**  
- **Abstract Factory**

---

## 📌 Objectifs
- Illustrer le fonctionnement de chaque pattern avec des exemples concrets.  
- Montrer leurs différences et cas d’utilisation.  
- Servir de base pédagogique pour apprendre et réviser les design patterns en Java.  

---

## 🛠️ Patterns Implémentés

### 1️⃣ Singleton
Le pattern **Singleton** garantit qu’une classe ne possède **qu’une seule instance** et fournit un point d’accès global à celle-ci.  
Exemple d’utilisation :  
- Gestionnaire de connexion à une base de données 

---

### 2️⃣ Factory Method
Le pattern **Factory Method** permet de déléguer la création d’objets à des sous-classes.  
Exemple d’utilisation :  
- Système de livraison où chaque type de transport est créé via une factory (🚚 Camion, 🚢 Bateau, ✈️ Avion).  

---

### 3️⃣ Abstract Factory
Le pattern **Abstract Factory** permet de créer des familles d’objets liés **sans dépendre de leurs classes concrètes**.  
Exemple d’utilisation :  
- Création d’interfaces adapter a plusieur types de Chaise et de Sofa (Victorienne et Moderne)

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