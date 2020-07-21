package com.github.zg2pro.interviews;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloShellComponent {

    @ShellMethod("say hello")
    public String hello(@ShellOption String arg) {
        return "hello Mr " + arg;
    }

}
