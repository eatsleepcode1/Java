Incremental development is a good programming practice and is the process of writing, compiling, and testing a small amount of code, then repeating the 
process with a small amount more (an incremental amount), and so on.
Suggested process to complete longer zyLabs:

    Implement Step 1 and submit for grading. Only one test will pass.
    Continue to implement one step at a time and resubmit for grading. At least one additional test should pass after each step.
    Continue until all steps are completed and all tests pass.

Program Specifications For practice with incremental development, write a program to output three statements as specified.
Step 1 (4 pts). Use System.out.println() to output "Step 1 complete". Submit for grading to confirm one of three tests passes.
Output should be:
Step 1 complete


Step 2 (3 pts). Use System.out.println() to output "Step 2 as well". Submit for grading to confirm two of three tests pass.
Output should be:

Step 1 complete
Step 2 as well

Step 3 (3 pts). Use System.out.println() to output "All steps now complete". Submit for grading to confirm all tests pass.
Output should be:

Step 1 complete
Step 2 as well
All steps now complete
 *//
 public class LabProgram {
   public static void main(String[] args) {
     System.out.println("Step 1 complete");
     System.out.println("Step 2 as well");
     System.out.println("All steps now complete");
   }
}
