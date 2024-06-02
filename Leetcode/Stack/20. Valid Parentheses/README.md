=======================================================================================<br>
### UMPIRE Method:
#### Understand

> - Ask clarifying questions and use examples to understand what the interviewer wants out of this problem.
> - Choose a “happy path” test input, different than the one provided, and a few edge case inputs.
> - Verify that you and the interviewer are aligned on the expected inputs and outputs.

- Can the input string be empty?
- No

### Match
> - See if this problem matches a problem category (e.g. Strings/Arrays) and strategies or patterns within the category

- Stack
  - Stack is useful here since we can easily keep track of the last bracket. 
  - We also want to match with the LATEST brackets was recorded when a closing bracket is identified.


### Plan
> - Sketch visualizations and write pseudocode
> - Walk through a high level implementation with an existing diagram

General Idea: 
What are the different cases?
1. odd number -> invalid
2. each step: 
   1. start with close but no open -> invalid for starter
   2. start with close with a matching open -> clear it 
   3. start with close with no matching open -> add to stack
3. at the end:
   1. if stack is empty (all matched) -> valid

> - How can you optimise this solution? 
    - Can keep a hashmap to improve readability
    - can make use of containsKey & get 

### Implement
> - Implement the solution (make sure to know what level of detail the interviewer wants)


### Review
> - Re-check that your algorithm solves the problem by running through important examples
> - Go through it as if you are debugging it, assuming there is a bug
### Evaluate
> - Finish by giving space and run-time complexity
> - Discuss any pros and cons of the solution

- Assume N is the length of the input string.
  - Time Complexity: O(N)
  - Space Complexity: O(N)