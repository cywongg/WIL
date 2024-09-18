=======================================================================================<br>
### UMPIRE Method:
#### Understand

> - Ask clarifying questions and use examples to understand what the interviewer wants out of this problem.
> - Choose a “happy path” test input, different than the one provided, and a few edge case inputs.
> - Verify that you and the interviewer are aligned on the expected inputs and outputs.

- In an new output array perspective, you either, 1. just add original, 2. add new then original, 3. just merge it to update the new interval for it to be added later
- Why just updating new interval will work? 

### Match
> - See if this problem matches a problem category (e.g. Strings/Arrays) and strategies or patterns within the category
<img width="153" alt="image" src="https://github.com/user-attachments/assets/e0a33475-d082-423d-ace4-10cf9ed71665">





### Plan
> - Sketch visualizations and write pseudocode
> - Walk through a high level implementation with an existing diagram

General Idea: 


### Implement
> - Implement the solution (make sure to know what level of detail the interviewer wants)



### Review
> - Re-check that your algorithm solves the problem by running through important examples
> - Go through it as if you are debugging it, assuming there is a bug
- Key points of putting (newInterval == null || newInterval[0] > interval[1]) first
Now, let's consider what happens if we reverse the order of these conditions:

1. If we place interval[0] > newInterval[1] before (newInterval == null || newInterval[0] > interval[1]), the code will first check if the current interval comes after the new interval.

2. Now, imagine the new interval is set to null. This means the condition (newInterval == null || newInterval[0] > interval[1]) will be true for every iteration. But since we are checking interval[0] > newInterval[1] first, it will throw a null pointer exception because newInterval is null, and we are trying to access newInterval[1].

So, the order of conditions is important to ensure that the code handles all cases correctly and avoids null pointer exceptions. By checking (newInterval == null || newInterval[0] > interval[1]) first, we ensure that the null check is performed before accessing the elements of newInterval.
  
### Evaluate
> - Finish by giving space and run-time complexity
> - Discuss any pros and cons of the solution


- Time Complexity: 
- Space Complexity: 
