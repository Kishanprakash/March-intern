package Cast;

public class ToolDetails extends Tool {
    @Override
    public void useTool() {
        System.out.println("Overridden: useTool in ToolDetails");
    }

    @Override
    public void sharpen() {
        System.out.println("Overridden: sharpen in ToolDetails");
    }

    @Override
    public void clean() {
        System.out.println("Overridden: clean in ToolDetails");
    }

    @Override
    public void store() {
        System.out.println("Overridden: store in ToolDetails");
    }

    @Override
    public void repair() {
        System.out.println("Overridden: repair in ToolDetails");
    }

    public void extraMethod() {
        System.out.println("Running extra method in ToolDetails");
    }
}
