package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {

    private Deque<Command> commands = new ArrayDeque<>();

    // undo로 취소된 명령들을 redo를 위해 임시로 저장할 곳을 만들음
    private Deque<Command> commandsForRedo = new ArrayDeque<>();

    // commands.push(cmd)는 새 명령을 앞쪽에 넣기 때문에 실제 실행은 가장 먼저 들어온 명령부터 해야 함
    @Override
    public void execute() {
        Iterator<Command> it = commands.descendingIterator();

        while (it.hasNext()) {
            Command cmd = it.next();
            cmd.execute();
        }
    }


    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }

        commands.push(cmd);

        // undo 후 새로운 명령을 실행하면 redo 기록은 삭제함
        commandsForRedo.clear();
    }

    // 마지막 명령을 삭제하지 않고 redo 스택에 보관한다
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd = commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    // undo된 명령을 다시 commands에 복원한다
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd = commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    // 전체 삭제함
    public void clear() {
        commands.clear();

        // redo 기록도 같이 삭제해줌
        commandsForRedo.clear();
    }
}