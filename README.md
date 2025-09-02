# Projet RPG Simple - Application Java

## Description
Ce projet est une application RPG (Role Playing Game) très simple développée en Java. Le jeu propose un système de combat basique entre différents types de personnages.

## Structure du Projet

```
src/
├── com/activision/
│   ├── GameMain.java          # Point d'entrée principal
│   └── entity/                # Classes des personnages
│       ├── Personnage.java    # Classe abstraite de base
│       ├── Guerrier.java      # Classe Guerrier
│       ├── Voleur.java        # Classe Voleur
│       ├── Archer.java        # Classe Archer
│       └── Magicien.java      # Classe Magicien
├── module-info.java
└── .gitignore
```

## Classes de Personnages

### Personnage (Classe abstraite)
- **Attributs** : nom, hp, level
- **Méthodes abstraites** : attaquer(), defendre()

### Guerrier
- **Attaque** : 5 dégâts
- **Défense** : Récupère 2 HP

### Magicien
- **Attaque** : 3 dégâts
- **Défense** : Récupère 3 HP

### Voleur
- **Attaque** : Attaque rapide
- **Défense** : Esquive

### Archer
- **Attaque** : Tir à l'arc
- **Défense** : Recul tactique

## Comment Jouer

1. **Compilation** :
   ```bash
   javac -d bin src/com/activision/*.java src/com/activision/entity/*.java
   ```

2. **Exécution** :
   ```bash
   java -cp bin com.activision.GameMain
   ```

3. **Gameplay** :
   - Le jeu crée automatiquement un Guerrier et un Magicien
   - Combat simple au tour par tour
   - Choisissez 1 pour attaquer ou 2 pour défendre
   - Le combat continue jusqu'à ce qu'un personnage soit vaincu

## Architecture Simple

- **Héritage** : Classes spécialisées héritant de Personnage
- **Polymorphisme** : Méthodes attaquer() et defendre() redéfinies
- **Abstraction** : Classe Personnage abstraite

---
*Projet RPG simple en Java - Version basique sans complexité.*