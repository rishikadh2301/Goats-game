# 🐐 Battle of the Goats  

### A Turn-Based Goat Fighting Game in Java  

## 📖 Description  
**Battle of the Goats** is a simple yet fun turn-based combat game where warrior goats battle using different attack strategies. Each goat belongs to a unique class, such as **Fighter** or **Mage**, with special abilities and weaknesses. The goal is to **reduce your opponent’s HP to zero before they defeat you!**  

The game features different **attack types** including:  
- **Physical** (e.g., cleave, sword strikes)  
- **Magical** (e.g., fireballs, magic missiles)  
- **Holy, Poison, and Elemental** damage  

Each goat has strengths and weaknesses, making battles strategic and exciting.  

---

## 🚀 Features  
✅ **Different Goat Classes** – Fighters are strong and resistant to physical damage, while Mages use magic but are weak to physical attacks.  
✅ **Unique Attacks** – Each class has its own special attacks with varying damage and hit patterns.  
✅ **Turn-Based Combat** – Goats attack each other in rounds until one of them faints.  
✅ **Damage Types & Resistances** – Fighters resist **physical damage** but take extra damage from **magic**, while Mages resist **magic** but are weak to **physical** attacks.  
✅ **Healing Ability** – Goats can heal to restore health but never beyond their max HP.  

---

## 🛠️ How to Run  
1. Clone this repository:  

git clone https://github.com/rishikadh2301/Goats-game.git



## EXAMPLE
Fighter mick = new Fighter("Mickey Roork");
Mage mark = new Mage("Marco");

System.out.println(mick);
System.out.println(mark);

// Mage attacks Fighter
Attack magicAttack = mark.attack();
mick.takeDamage(magicAttack);

System.out.println(mick); // See updated HP
