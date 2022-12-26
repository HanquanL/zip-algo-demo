# Java Technical Interview Prep 

## Resources
[Leet Code](https://leetcode.com/problemset/all/)  
[Learn-X-in-Y-minutes](https://learnxinyminutes.com/docs/java/)  
[Coding Interview Guide in Java](https://github.com/PacktPublishing/The-Complete-Coding-Interview-Guide-in-Java)  
[Leet Code (Mock Interveiw)](https://leetcode.com/interview/)     
[HackerRank](https://www.hackerrank.com/)  
[Pramp](https://www.pramp.com/#/)  
Java Developers Community (LinkedIn)  

Algorithms & Computational Complexity
- [Computational Complexity (P vs NP)](https://www.youtube.com/watch?v=YX40hbAHx3s)
- [Big-O Cheatsheet](https://www.bigocheatsheet.com/)  
- [Big O Notation](https://www.youtube.com/watch?v=v4cd1O4zkGw)  (Gaykle Laakmann McDowell - Author of Cracking The Coding Interview) 
- [Bubble Sort Visualizer](https://codepen.io/lonekorean/pen/bqjzqr)  
- [Bubble Sort Explained via Hungarian Folk Dance](https://www.youtube.com/watch?v=lyZQPjUT5B4)  
- [Sorting Algos Visualization](https://www.youtube.com/watch?v=kPRA0W1kECg)


## Whiteboard Interviews

### Types of questions
 - Whiteboarding logic problems (leet code programming challenge style)
 - Conceptual (Java, Spring, SQL)
 - Testing & Debugging practices/techniques
 - Front-end frameworks/tools (if seeking front-end pos)
 - System design Q’s (maybe some high level network architecture Q’s).
 - IDE/Terminal challenges
### Tips/Tricks:
- Communication is perhaps THE most important thing when it comes to any interview. Ultimately, it allows you to showcase your resourcefulness, ability to think critically, and articulate your understanding while being receptive to various feedback.  

- How can you demonstrate TDD through a whiteboard interview? (Whiteboards are all about how you break down a problem. If you can write a ‘skeleton’ of what the solution should look like and then solve/test small pieces in a strategic manner you will be able to get to the larger solution while demonstrating your design & approach)

- The best thing that you can do at this point is to BUILD on projects, solve whiteboards with others and practice mock interviews. Always make sure you are continuing to develop even after your last lab is due or you pass the final exam. A lot of second round interviews will require you to go deeper into the things that you have built, be able to show the progress you have made.
- Practice difficult questions and your responses to things that you simply do not know. Be strategic in how you guide the conversation when you get stumped. It is perfectly ok to say that you do not know in an interview, and it is preferred over trying to BS your way through it. However, try to think of something that you do know and try to lead with that. 
    - Sample Question: “How do you implement a static block?”
    - Sample Unsure Answer: “I know the static keyword belongs to a class itself rather than an instance, but I am not familiar with the proper way to implement a static block. Based on my understanding, we can have static variables, methods, and inner-classes. My thought would be that a static block would exhibit functionality similar to that of a constructor, but would not rely on an instance to be created in order to access its contents.”

## Whiteboarding strategy (Analysis, Impl, Test)
## Analysis
- Demonstrate understanding of the problem
- Ask questions for clarity on the task, limitations, edge cases, etc. (repeat the problem back if necessary)
- Create a game plan when solving any problem
- Come up with a high level TODO list
- Walk through steps you need to take to get to solution
- Communicate approach/strategy effectively
- Create sample data or use cases to reference (traceability)

## Implementation
- Convert your TODO list into pseudocode
- Talk through how you transform pseudo -> java 
- Solve your pseudo code first and ask questions if needed
- Convert your pseudocode to java to best of ability
- Always try to identify core java data structures/patterns in your solution
- Optimize your solution (Big O)

## Testing/Validations
- How can you prove your right?
- Use sample data & trace through your solution
- Think of edge cases and possible bugs in your code
- How does it perform & scale?

## Quotes from Alumni
```
“Practice practice practice...
Create game plan when solving any coding problem
convey /share the plan w interviewer
Understand problem and ask any questions for clarity on ask, limitations, edge cases, etc.
Write neatly and align your braces (makes a good impression regardless of being correct)
Talk through it and ask questions and even for help if you need it”
```
```
“Do ask any and all questions you have. Do ask the interviewer for help or bounce ideas off them when you get stuck. Don’t hold you thoughts to yourself just because you’re not 100% sure it’s right or on the right track. Those I think are the ones I try to preach”
```
```
“Always verbalize your thought processes. Talk out your logic. Even if syntax is a bit off, your logic can compensate. Look up as many white boarding exercises as possible and work on memorizing answers. Having answers memorized can make allowance for any uncontrollable nerves/anxiety. Practice, practice, practice--on a whiteboard. Believe it or not, typing and dry/erase are vastly different. Don't convert into a robot. Let your personality shine through your ability to problem solve. Always ask for clarification, to let interviewers know you're fully engaged. Knowing your sorting algorithms also always helps.”
```
```
“Don't face the whiteboard, it's okay to take time to think through your answer before you start, and talk your way through all the steps”
```
```
“My favorite question i've ever been asked was draw out the last application you worked on without any detail”
```
```
“Familiarize yourself with structure design, focus on what kind of object you need and the relationship between them, e.g. one-to-many, many-to-many... and be prepared that people might want to see it in database table structure rather than in java. I personally think Java Spring Entity is fine, but you must be clear on the relationship between objects.“
```
```
“As practice, maybe you could try drawing the UML for other group's final project and compare the difference, ask them why they designed it that way, and try to find the pro and con for your own design and their design.“
```
```
“Pay attention to what the interviewer is asking and reconfirm with the interviewer if there is any doubt. Don't be afraid to ask extra questions on what they wanted.“
```
```
“As a developer, one important trait to have is to vigilantly re-check your solution so that you know what you wrote is at least correct, especially with a reference.“
```
```
“Think about how to ask the appropriate questions to the interviewer before proceeding into diving into the logic“
```
```
“Do not be afraid to ask questions to the interviewer. The interviewer is on your side. Thinking out loud is also really important for the interviewer to feel like they are engaged and can coach you through. In terms of how to start the whiteboarding interview, I find it often helpful to talk through the method signature first with the interviewer just to establish what the parameters are, what is expected to be returned, and clarify what the requirements are.“
```
```
“CoderPad.io was a helpful tool for this exercise. It offers videochatting, a shared workspace,  the ability to preload questions and select them from a dropdown mid-interview, and the ability to replay all the activity in the shared workspace after the fact.“
```
```
“Often, if you give a good enough strategic overview of what you’re going to do, they won’t even have you write it out, or only in pseudo code“
```
```
“For the white-boarding, I suggest that you speak with the interviewer as much as you can.
tell them what you are thinking and try to break the problem down,
using them as resource if you are stuck, treat it like you are solving the problem together,
unless they specifically ask you to solve it yourself…”
```
```
“For the white-boarding, I would suggest you ask the interviewer first that
if you could do pseudo-code, or at least announce it early that you are doing pseudo-code,
don't wait until they question you.
it's okay to work in pseudo-code, but your variable name needs to be consistent.
keep calm, listen and think. don't be afraid to start over your thought if you are stuck and engage with interviewer a lot.”
```

