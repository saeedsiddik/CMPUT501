# CMPUT501 Project 

**[Step 1]** Run the _comment_bug_relation_raw_data_process.ipynb_ Notebook file under **Raw Code Comment Processing**  for reading code-comment raw files. That notebook generates JSON files which will be used to collect AST of corresponding Java Code.



**[Step 2]** Prepare the AST from the JSON file using Java Compiler (e.g. IntelliJ, Eclipse). You can find the Java project under _AST Creation IntelliJ_ folder. The project name is _ast_creation_Java_project_ which takes two data named _test_bug.json_ and _test_nobug.json_ as input. You can generate the those in put from Step 1 or directly use the file under the  _AST Creation IntelliJ_ folder. The Java project write the AST to two new JSON file named as _ast_test_bug.json_ and _ast_test_nobug.json_

**[Step 3]** Run _comment_bug_relation_processing_simple_ast.ipynb_ under **PKL file creating using AST** to process those AST for preparing pk file to measure the inconsistency between code and correspondent comments.

**[Step 4]** Run _siamese-run-Code_Comment.ipynb_ under **Model Run** to calculate the inconsistency between code and correspondent comments using pretrained siamese neural network

**[Step 5]** Run _Result_Visualization.ipynb_ under **Result visualization** section for drawing diagram of results.  

