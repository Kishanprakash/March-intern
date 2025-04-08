package Cast;

public class ToolCast {
    public void cast(Tool tool) {
        System.out.println("Casting Tool");
        tool.useTool();
        tool.sharpen();
        tool.clean();
        tool.store();
        tool.repair();
        if(tool instanceof ToolDetails) {
            ToolDetails ref = (ToolDetails)tool;
            ref.extraMethod();
        }
    }
}
