# CMPUT501 Project 

[Step 1] Run the comment_bug_relation_raw_data_process.ipynb Notebook file for reading code-comment raw files. That notebook generates JSON files which will be used to collect AST of corresponding Java Code.
[Step 2] Prepare the AST from the JSON file using Java Compiler (e.g. IntelliJ)
[Step 3] Run comment_bug_relation_processing_simple_ast.ipynb to process those AST for preparing pk file to measure the inconsistency between code and correspondent comments. 
[Step 3] Run siamese-run-Code_Comment.ipynb to calculate the inconsistency between code and correspondent comments using pretrained siamese neural network

