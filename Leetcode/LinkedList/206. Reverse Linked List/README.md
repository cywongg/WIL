=======================================================================================<br>
### UMPIRE Method:
#### Understand

> - Ask clarifying questions and use examples to understand what the interviewer wants out of this problem.
> - Choose a “happy path” test input, different than the one provided, and a few edge case inputs.
> - Verify that you and the interviewer are aligned on the expected inputs and outputs.

1. Can the input be empty? (head is null?)
    - Yes
2. Any requirement on time/space complexity?
    - O(N) in time and O(1) in space
3. Does the linked list have a cycle?
    - No

### Match
> - See if this problem matches a problem category (e.g. Strings/Arrays) and strategies or patterns within the category



### Plan
> - Sketch visualizations and write pseudocode
> - Walk through a high level implementation with an existing diagram

General Idea: 

1) Initialize a previous node, a current node.
2) While current node is not null
    - Initialize a next node to temporarily hold the next node
    - Point current node .next to previous node
    - Set prev node to current node
    - Set current node to next node
3) Return previous node


### Implement
> - Implement the solution (make sure to know what level of detail the interviewer wants)



### Review
> - Re-check that your algorithm solves the problem by running through important examples
> - Go through it as if you are debugging it, assuming there is a bug
### Evaluate
> - Finish by giving space and run-time complexity
> - Discuss any pros and cons of the solution


- Time Complexity: 
- Space Complexity: 

> - What was the crux to understand? 