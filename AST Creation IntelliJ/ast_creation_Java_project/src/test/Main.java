package test;

public class Main {
	public static void main(String [] args)
	{
		FileProcessor fileProcessor = new FileProcessor("data/");

		fileProcessor.loadAndSave("test_bug.json");
		fileProcessor.loadAndSave("test_nobug.json");
	}
}