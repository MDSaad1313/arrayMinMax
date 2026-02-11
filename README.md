
# 📘 README.md – DSA Level 1 (Arrays Foundation)

````markdown
# 🟢 DSA Level 1 – Arrays & Core Patterns (Java)

This repository contains my complete Level 1 Data Structures & Algorithms preparation in Java.

Level 1 focuses on building:
- Strong array fundamentals
- Logical thinking
- Pattern recognition
- Optimal O(n) solutions
- Interview-ready explanations

---

# 🎯 Level 1 Goal

To master:
- Basic array manipulation
- Two pointer techniques
- XOR logic
- Majority voting
- HashSet usage
- Edge case handling

And move from:
"I know Java syntax"  
to  
"I can think algorithmically"

---

# 📚 Topics Covered

## 1️⃣ Linear Scan Problems
- Find Maximum
- Find Minimum
- Second Largest Element
- Check if Array is Sorted

**Pattern:**
```java
for(int i = 0; i < arr.length; i++) {
    // compare & update
}
````

Time Complexity: O(n)
Space Complexity: O(1)

---

## 2️⃣ Two Pointer Technique (Inward)

### Reverse an Array

```java
int left = 0;
int right = n - 1;

while(left < right) {
    swap(arr[left], arr[right]);
    left++;
    right--;
}
```

Used when:

* Swapping elements
* Reversing segments

---

## 3️⃣ Two Pointer Technique (Forward)

### Remove Duplicates (Sorted Array)

### Move Zeroes to End

### Union of Two Sorted Arrays

### Intersection of Two Sorted Arrays

Pattern:

```java
int i = 0;

for(int j = 0; j < n; j++) {
    if(condition) {
        arr[i] = arr[j];
        i++;
    }
}
```

Key Idea:

* One pointer scans
* One pointer places valid elements

---

## 4️⃣ Array Rotation (Reversal Algorithm)

Rotate array by K positions in O(n) time and O(1) space.

Steps:

1. Reverse first k elements
2. Reverse remaining n-k elements
3. Reverse entire array

```java
k = k % n;
```

Why?
To avoid unnecessary full rotations.

---

## 5️⃣ XOR Pattern

Used in:

* Missing Number
* Single Number

Rules:

```
a ^ a = 0
a ^ 0 = a
```

Idea:
Duplicates cancel.
Only unique element remains.

---

## 6️⃣ Majority Element (Boyer–Moore Voting)

Find element appearing more than n/2 times.

Core idea:

* Same element → increase count
* Different element → decrease count
* Majority survives

Time: O(n)
Space: O(1)

---

## 7️⃣ HashSet Pattern

### Longest Consecutive Sequence

Key Insight:
Only start counting when:

```java
if(!set.contains(num - 1))
```

Time: O(n)
Space: O(n)

---

# 🧠 Core Patterns Learned

| Pattern                | When to Use                    |
| ---------------------- | ------------------------------ |
| Linear Scan            | Find max/min                   |
| Two Pointers (Inward)  | Reverse array                  |
| Two Pointers (Forward) | Remove duplicates, move zeroes |
| Reversal Trick         | Rotation                       |
| XOR                    | Cancellation problems          |
| Boyer-Moore            | Majority element               |
| HashSet                | Fast lookup                    |

---

# ⏱ Complexity Awareness

* Single loop → O(n)
* Nested loops → O(n²)
* Two arrays merge → O(n + m)
* HashSet lookup → O(1)

---

# 🔥 Problems Mastered

✔ Find Max / Min
✔ Second Largest
✔ Reverse Array
✔ Check Sorted
✔ Remove Duplicates
✔ Move Zeroes
✔ Rotate by K
✔ Missing Number (Sum & XOR)
✔ Single Number
✔ Majority Element
✔ Union
✔ Intersection
✔ Longest Consecutive Sequence

---

# 📈 Current Level

Strong foundation in:

* Array manipulation
* Pattern recognition
* Interview reasoning

Next Phase:
🟡 Sliding Window & Subarray Problems

---

# 🧩 Key Takeaway

Level 1 is about:

* Thinking before coding
* Writing optimal O(n) solutions
* Handling edge cases confidently
* Building pattern recognition

Consistency > Speed

---

# 🚀 Author

Saad Mujawar
Java Full Stack Developer
DSA Journey – From Level 1 to 100 💯
Tell me what you want next 💪
```
